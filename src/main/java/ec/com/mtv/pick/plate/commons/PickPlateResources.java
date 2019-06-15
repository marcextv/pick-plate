package ec.com.mtv.pick.plate.commons;

/**
 * Manage resource properties
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public final class PickPlateResources {

	/**
	 * Empty constructor.
	 */
	private PickPlateResources() {

	}
	
	/**
	 * Return morning initial time data.
	 */
	public static final String DATA_MORNING_INITIAL = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.data.moring.initial");
	
	/**
	 * Return morning end time data.
	 */
	public static final String DATA_MORNING_END = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.data.moring.end");
	
	/**
	 * Return afternoon initial time data.
	 */
	public static final String DATA_AFTERNOON_INITIAL = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.data.afternoon.initial");
	
	/**
	 * Return afternoon/night end time data.
	 */
	public static final String DATA_NIGHT_END = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.data.afternoon.end");

	/**
	 * Return a 'Hello World' message.
	 */
	public static final String LABEL_HELLO_WORLD = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.label.hello.world");
	
	/**
	 * Return a dash symbol.
	 */
	public static final String LABEL_DASH_SYMBOL = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.label.dash.symbol");

	/**
	 * Return regex for time format.
	 */
	public static final String REGEX_TIME_FORMAT = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.regex.time.format");
	
	/**
	 * Return regex for letter plate format.
	 */
	public static final String REGEX_LETTER_PART = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.regex.letter.plate.part");
	
	/**
	 * Return regex for number plate format.
	 */
	public static final String REGEX_NUMBER_PART = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.regex.number.plate.part");
	
	/**
	 * Return formatter for time.
	 */
	public static final String FORMATTER_TIME = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.formatter.time");
	
	/**
	 * Return message for correct time format.
	 */
	public static final String MESSAGE_CORRECT_TIME_FORMAT = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.incorrect.time.format");
	
	/**
	 * Return message for incorrect time format.
	 */
	public static final String MESSAGE_INCORRECT_TIME_FORMAT = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.incorrect.time.format");
	
	/**
	 * Return message for missing dash symbol.
	 */
	public static final String MESSAGE_MISSING_DASH_SYMBOL = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.missing.dash.symbol");
	
	/**
	 * Return message for there are more dash that one required.
	 */
	public static final String MESSAGE_MORE_ONE_DASH_SYMBOL = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.more.one.dash.symbol");
	
	/**
	 * Return message for error reading plate format.
	 */
	public static final String MESSAGE_ERROR_READING_PLATE_FORMAT = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.error.reading.plate.format");
	
	/**
	 * Return message for error in letter plate part format.
	 */
	public static final String MESSAGE_ERROR_LETTER_PLATE_FORMAT = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.error.letter.plate.format");
	
	/**
	 * Return message for error in number plate part format.
	 */
	public static final String MESSAGE_ERROR_NUMBER_PLATE_FORMAT = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.error.number.plate.format");
	
	/**
	 * Return message for error in plate format.
	 */
	public static final String MESSAGE_INCORRECT_PLATE_FORMAT = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.incorrect.plate.format");
	
	/**
	 * Return message for incorrect date format.
	 */
	public static final String MESSAGE_INCORRECT_DATE_FORMAT = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.incorrect.date.format");
	
	/**
	 * Return message for Monday picked.
	 */
	public static final String MESSAGE_PICK_MONDAY = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.pick.monday");
	
	/**
	 * Return message for Tuesday picked.
	 */
	public static final String MESSAGE_PICK_TUESDAY = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.pick.tuesday");
	
	/**
	 * Return message for Wednesday picked.
	 */
	public static final String MESSAGE_PICK_WEDNESDAY = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.pick.monday");
	
	/**
	 * Return message for Thursday picked.
	 */
	public static final String MESSAGE_PICK_THURSDAY = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.pick.thursday");
	
	/**
	 * Return message for Friday picked.
	 */
	public static final String MESSAGE_PICK_FRIDAY = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.pick.friday");
	
	/**
	 * Return message for Weekend picked.
	 */
	public static final String MESSAGE_PICK_WEEKEND = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.pick.weekend");
	
	/**
	 * Return message for plate picked for morning.
	 */
	public static final String MESSAGE_PLATE_PICKED_MORNING = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.plate.picked.morning");
	
	/**
	 * Return message for plate picked for afternoon.
	 */
	public static final String MESSAGE_PLATE_PICKED_AFTERNOON = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.plate.picked.afternoon");
	
	/**
	 * Return message for plate is free.
	 */
	public static final String MESSAGE_PLATE_FREE = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.plate.free");
	
	/**
	 * Return message for error on time format.
	 */
	public static final String MESSAGE_ERROR_TIME_FORMAT = PickPlateMessages.getInstance()
			.getMessageForKey("ec.com.mtv.pick.plate.message.error.time.format");

}
