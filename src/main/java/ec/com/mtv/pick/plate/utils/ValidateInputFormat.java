package ec.com.mtv.pick.plate.utils;

import java.util.Arrays;
import java.util.List;

import ec.com.mtv.pick.plate.commons.PickPlateResources;
import ec.com.mtv.pick.plate.exceptions.PickPlateException;

/***
 * Validate data input by user.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public final class ValidateInputFormat {

	/**
	 * Empty constructor.
	 */
	private ValidateInputFormat() {

	}

	/**
	 * Validate if time format is correct.
	 * 
	 * @param inputTime string of time send
	 * @return true if format is correct, false if it doesn't
	 */
	public static boolean correctTime(String inputTime) {
		return inputTime.matches(PickPlateResources.REGEX_TIME_FORMAT);
	}

	/**
	 * Validate if plate is correct.
	 * 
	 * @param plate value to be evaluate
	 * @throws PickPlateException format error
	 */
	public static void correctPlate(String plate) throws PickPlateException {
		try {
			long count = plate.chars().filter(dash -> dash == PickPlateResources.LABEL_DASH_SYMBOL.charAt(0)).count();
			if (count == 0) {
				throw new PickPlateException(PickPlateResources.MESSAGE_MISSING_DASH_SYMBOL);
			}
			if (count > 1) {
				throw new PickPlateException(PickPlateResources.MESSAGE_MORE_ONE_DASH_SYMBOL);
			}
			List<String> plateParts = Arrays.asList(plate.split(PickPlateResources.LABEL_DASH_SYMBOL));
			if (plateParts.size() != 2) {
				throw new PickPlateException(PickPlateResources.MESSAGE_ERROR_READING_PLATE_FORMAT);
			}
			String letterPart = plateParts.get(0);
			if (checkErrorLetterPlatePart(letterPart)) {
				throw new PickPlateException(PickPlateResources.MESSAGE_ERROR_LETTER_PLATE_FORMAT);
			}
			String numberPart = plateParts.get(1);
			if (checkErrorNumberPlate(numberPart)) {
				throw new PickPlateException(PickPlateResources.MESSAGE_ERROR_NUMBER_PLATE_FORMAT);
			}
		} catch (Exception e) {
			throw new PickPlateException(PickPlateResources.MESSAGE_INCORRECT_PLATE_FORMAT.concat(e.getMessage()));
		}
	}

	/**
	 * Check for error in plate letter part.
	 * 
	 * @param letterPart string to be evaluate
	 * @return true if there is error
	 */
	private static boolean checkErrorLetterPlatePart(String letterPart) {
		return !letterPart.matches(PickPlateResources.REGEX_LETTER_PART) || letterPart.length() != 3;
	}

	/**
	 * Check for error in plate number part.
	 * 
	 * @param numberPart string to be evaluate
	 * @return true if there is error
	 */
	private static boolean checkErrorNumberPlate(String numberPart) {
		return !numberPart.matches(PickPlateResources.REGEX_NUMBER_PART)
				|| (numberPart.length() != 3 && numberPart.length() != 4);
	}

	/**
	 * Validate plate letter part.
	 * 
	 * @param numberPart string to be evaluate
	 * @return true if there is not error
	 */
	public static boolean validateNumberPlate(String numberPart) {
		return numberPart.matches(PickPlateResources.REGEX_NUMBER_PART)
				&& (numberPart.length() == 3 || numberPart.length() == 4);
	}

}
