package ec.com.mtv.pick.plate.test;

import org.junit.Test;

import ec.com.mtv.pick.plate.logic.PickPlateLogic;

/**
 * Application logic test.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class LogicTest {

	@Test
	public void testFindDayOfWeek() {
		try {
			String inputDate = "1986-02-10";
			PickPlateLogic logic = new PickPlateLogic();
			String dayOfWeek = logic.findDayOfWeek(inputDate);
			System.out.println(dayOfWeek);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testCheckPickDate() {
		try {
			String plate = "PCA--455";
			PickPlateLogic logic = new PickPlateLogic();
			String dayOfWeek = logic.checkPickDate(plate);
			System.out.println(dayOfWeek);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testCheckPickTime() {
		try {
			String inputTime = "19:03:11";
			PickPlateLogic logic = new PickPlateLogic();
			String result = logic.checkPickTime(inputTime);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPickPlate() {
		String inputDate = "2019-06-17";
		String plate = "PCA-9712";
		String inputTime = "05:03:11";
		PickPlateLogic logic = new PickPlateLogic();
		System.out.println(logic.pickPlate(plate, inputDate, inputTime));
	}

}
