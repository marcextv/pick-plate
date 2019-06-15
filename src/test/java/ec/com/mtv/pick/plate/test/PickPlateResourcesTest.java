package ec.com.mtv.pick.plate.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ec.com.mtv.pick.plate.commons.PickPlateResources;

/**
 * Pick & Plate resources test.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class PickPlateResourcesTest {
	
	@Test
	public void testMorningInitialTime() {
		assertNotNull(PickPlateResources.DATA_MORNING_INITIAL);
	}
	
	@Test
	public void testMorningEndTime() {
		assertNotNull(PickPlateResources.DATA_MORNING_END);
	}
	
	@Test
	public void testAfternooonInitialTime() {
		assertNotNull(PickPlateResources.DATA_AFTERNOON_INITIAL);
	}
	
	@Test
	public void testNightEndTime() {
		assertNotNull(PickPlateResources.DATA_NIGHT_END);
	}
	
	@Test
	public void testHelloWorld() {
		assertNotNull(PickPlateResources.LABEL_HELLO_WORLD);
	}
	
	@Test
	public void testDashSymbol() {
		assertNotNull(PickPlateResources.LABEL_DASH_SYMBOL);
	}
	
	@Test
	public void testRegexTimeFormat() {
		assertNotNull(PickPlateResources.REGEX_TIME_FORMAT);
	}
	
	@Test
	public void testRegexLetterPlateFormat() {
		assertNotNull(PickPlateResources.REGEX_LETTER_PART);
	}
	
	@Test
	public void testRegexNumberPlateFormat() {
		assertNotNull(PickPlateResources.REGEX_NUMBER_PART);
	}
	
	@Test
	public void testFormatterTime() {
		assertNotNull(PickPlateResources.FORMATTER_TIME);
	}
	
	@Test
	public void testMessageCorrectTimeFormat() {
		assertNotNull(PickPlateResources.MESSAGE_CORRECT_TIME_FORMAT);
	}
	
	@Test
	public void testMessageIncorrectTimeFormat() {
		assertNotNull(PickPlateResources.MESSAGE_INCORRECT_TIME_FORMAT);
	}
	
	@Test
	public void testMessageMissingDashSymbol() {
		assertNotNull(PickPlateResources.MESSAGE_MISSING_DASH_SYMBOL);
	}
	
	@Test
	public void testMessageMoreOneDashSymbol() {
		assertNotNull(PickPlateResources.MESSAGE_MORE_ONE_DASH_SYMBOL);
	}
	
	@Test
	public void testMessageErrorReadingPlateFormat() {
		assertNotNull(PickPlateResources.MESSAGE_ERROR_READING_PLATE_FORMAT);
	}
	
	@Test
	public void testMessageErrorLetterPlateFormat() {
		assertNotNull(PickPlateResources.MESSAGE_ERROR_LETTER_PLATE_FORMAT);
	}
	
	@Test
	public void testMessageErrorNumberPlateFormat() {
		assertNotNull(PickPlateResources.MESSAGE_ERROR_NUMBER_PLATE_FORMAT);
	}
	
	@Test
	public void testMessageErrorPlateFormat() {
		assertNotNull(PickPlateResources.MESSAGE_INCORRECT_PLATE_FORMAT);
	}
	
	@Test
	public void testMessageErrorDateFormat() {
		assertNotNull(PickPlateResources.MESSAGE_INCORRECT_DATE_FORMAT);
	}
	
	@Test
	public void testMessagePickMonday() {
		assertNotNull(PickPlateResources.MESSAGE_PICK_MONDAY);
	}
	
	@Test
	public void testMessagePickTuesday() {
		assertNotNull(PickPlateResources.MESSAGE_PICK_TUESDAY);
	}
	
	@Test
	public void testMessagePickWednesday() {
		assertNotNull(PickPlateResources.MESSAGE_PICK_WEDNESDAY);
	}
	
	@Test
	public void testMessagePickThursday() {
		assertNotNull(PickPlateResources.MESSAGE_PICK_THURSDAY);
	}
	
	@Test
	public void testMessagePickFriday() {
		assertNotNull(PickPlateResources.MESSAGE_PICK_FRIDAY);
	}
	
	@Test
	public void testMessagePickWeekend() {
		assertNotNull(PickPlateResources.MESSAGE_PICK_WEEKEND);
	}
	
	@Test
	public void testMessagePlatePickedMorning() {
		assertNotNull(PickPlateResources.MESSAGE_PLATE_PICKED_MORNING);
	}
	
	@Test
	public void testMessagePlatePickedAfternoon() {
		assertNotNull(PickPlateResources.MESSAGE_PLATE_PICKED_AFTERNOON);
	}
	
	@Test
	public void testMessagePlateFree() {
		assertNotNull(PickPlateResources.MESSAGE_PLATE_FREE);
	}
	
	@Test
	public void testMessageErrorTimeFormat() {
		assertNotNull(PickPlateResources.MESSAGE_ERROR_TIME_FORMAT);
	}

}
