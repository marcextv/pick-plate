package ec.com.mtv.pick.plate.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import ec.com.mtv.pick.plate.commons.PickPlateResources;
import ec.com.mtv.pick.plate.data.PickTimeRelation;
import ec.com.mtv.pick.plate.data.PlateDayRelation;
import ec.com.mtv.pick.plate.exceptions.PickPlateException;
import ec.com.mtv.pick.plate.utils.ValidateInputFormat;

/**
 * Logic of pick & plate.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class PickPlateLogic {

	/**
	 * Checks if input data is between initial and end calendars.
	 * 
	 * @param init      initial calendar data
	 * @param end       end calendar data
	 * @param checkTime input data to be evaluate
	 * @return true if data is between calendars
	 */
	private boolean checkBetweenCalendars(Calendar init, Calendar end, Date checkTime) {
		return (checkTime.after(init.getTime()) || checkTime.compareTo(init.getTime()) == 0)
				&& checkTime.before(end.getTime());
	}

	/**
	 * Add one more date for check.
	 * 
	 * @param input    string to be evaluate
	 * @param calendar calendar to be added one day if need it
	 */
	private void addOneDate(Calendar input, Calendar calendar) {
		if (PickTimeRelation.getInstance().getEndMorningTime()
				.compareTo(PickTimeRelation.getInstance().getInitMorningTime()) < 0) {
			calendar.add(Calendar.DATE, 1);
			input.add(Calendar.DATE, 1);
		}
	}

	/**
	 * Set calendar data to be evaluate.
	 * 
	 * @param inputTime string to be converted
	 * @return new calendar
	 * @throws ParseException error processing data
	 */
	private Calendar setCalendar(String inputTime) throws ParseException {
		Date date = new SimpleDateFormat(PickPlateResources.FORMATTER_TIME).parse(inputTime);
		Calendar input = Calendar.getInstance();
		input.setTime(date);
		return input;
	}

	/**
	 * Check if input data and pick & plate times are correct.
	 * 
	 * @param inputTime string to be evaluate
	 * @return true if everything is ok
	 */
	private boolean checkAllInputTimes(String inputTime) {
		return ValidateInputFormat.correctTime(inputTime)
				&& ValidateInputFormat.correctTime(PickTimeRelation.getInstance().getInitMorningTime())
				&& ValidateInputFormat.correctTime(PickTimeRelation.getInstance().getEndMorningTime())
				&& ValidateInputFormat.correctTime(PickTimeRelation.getInstance().getInitAfterNoonTime())
				&& ValidateInputFormat.correctTime(PickTimeRelation.getInstance().getEndNightTime());
	}

	/**
	 * Checks if input date is a valid date and finds day of week.
	 * 
	 * @param inputDate string to be evaluated
	 * @return day of week
	 * @throws PickPlateException input date format error
	 */
	public String findDayOfWeek(String inputDate) throws PickPlateException {
		try {
			LocalDate date = LocalDate.parse(inputDate);
			if (date != null) {
				return date.getDayOfWeek().name();
			}
			return PickPlateResources.MESSAGE_PICK_WEEKEND;
		} catch (Exception e) {
			throw new PickPlateException(PickPlateResources.MESSAGE_INCORRECT_DATE_FORMAT);
		}
	}

	/**
	 * Check input plate day of week for pick & plate.
	 * 
	 * @param plate string to be evaluate
	 * @return day of week
	 * @throws PickPlateException input plate format error
	 */
	public String checkPickDate(String plate) throws PickPlateException {
		// Validate data of plate
		ValidateInputFormat.correctPlate(plate);

		// Splits plate parts into letters and plates
		List<String> plateParts = Arrays.asList(plate.split(PickPlateResources.LABEL_DASH_SYMBOL));

		// It only evaluate numeric part
		String numberPart = plateParts.get(1);
		if (ValidateInputFormat.validateNumberPlate(numberPart)) {
			// Now it will get last digit of numeric part
			int last = Character.getNumericValue(numberPart.charAt(numberPart.length() - 1));

			// It stars comparing days of week by last digit taken
			if (PlateDayRelation.getInstance().getMondayValues().contains(last)) {
				return DayOfWeek.MONDAY.name();
			}
			if (PlateDayRelation.getInstance().getTuesdayValues().contains(last)) {
				return DayOfWeek.TUESDAY.name();
			}
			if (PlateDayRelation.getInstance().getWednesdayValues().contains(last)) {
				return DayOfWeek.WEDNESDAY.name();
			}
			if (PlateDayRelation.getInstance().getThursdayValues().contains(last)) {
				return DayOfWeek.THURSDAY.name();
			}
			if (PlateDayRelation.getInstance().getFridayValues().contains(last)) {
				return DayOfWeek.FRIDAY.name();
			}
			return PickPlateResources.MESSAGE_PICK_WEEKEND;
		}
		throw new PickPlateException(PickPlateResources.MESSAGE_ERROR_NUMBER_PLATE_FORMAT);
	}

	/**
	 * Validates if input time is picked for rules.
	 * 
	 * @param inputTime string to be evaluate
	 */
	public String checkPickTime(String inputTime) throws PickPlateException {
		try {
			// Checks if all times are in correct format
			if (this.checkAllInputTimes(inputTime)) {

				// Set calendars for evaluate between times
				Calendar input = this.setCalendar(inputTime);
				Calendar initMorning = this.setCalendar(PickTimeRelation.getInstance().getInitMorningTime());
				Calendar endMorning = this.setCalendar(PickTimeRelation.getInstance().getEndMorningTime());
				Calendar initAfternoon = this.setCalendar(PickTimeRelation.getInstance().getInitAfterNoonTime());
				Calendar endNight = this.setCalendar(PickTimeRelation.getInstance().getEndNightTime());
				addOneDate(input, endMorning);
				addOneDate(input, endNight);

				// Set date for be checked
				Date checkTime = input.getTime();

				// Check between times
				if (checkBetweenCalendars(initMorning, endMorning, checkTime)) {
					return PickPlateResources.MESSAGE_PLATE_PICKED_MORNING;
				}
				if (checkBetweenCalendars(initAfternoon, endNight, checkTime)) {
					return PickPlateResources.MESSAGE_PLATE_PICKED_AFTERNOON;
				}
				return PickPlateResources.MESSAGE_PLATE_FREE;
			} else {
				throw new PickPlateException(PickPlateResources.MESSAGE_ERROR_TIME_FORMAT);
			}
		} catch (Exception e) {
			throw new PickPlateException(e);
		}
	}

	/**
	 * Checks if plate will have pick & plate at the date and time.
	 * 
	 * @param plate     plate identifier
	 * @param inputDate date to be evaluate
	 * @param inputTime time to be evaluate
	 * @return message of processing
	 */
	public String pickPlate(String plate, String inputDate, String inputTime) {
		try {
			String date = checkPickDate(plate);
			String day = findDayOfWeek(inputDate);
			if (day.equals(date)) {
				return checkPickTime(inputTime);
			} else {
				return PickPlateResources.MESSAGE_PLATE_FREE;
			}
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
