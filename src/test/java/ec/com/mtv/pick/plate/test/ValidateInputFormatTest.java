package ec.com.mtv.pick.plate.test;

import org.junit.Test;

import ec.com.mtv.pick.plate.exceptions.PickPlateException;
import ec.com.mtv.pick.plate.utils.ValidateInputFormat;

/**
 * Validate input format tester.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class ValidateInputFormatTest {
	
	@Test
	public void testCorrectTime() {
		System.out.println(ValidateInputFormat.correctTime("545645645"));
		System.out.println(ValidateInputFormat.correctTime("00:00:12"));
		System.out.println(ValidateInputFormat.correctTime("2sdfsg"));
	}
	
	@Test
	public void testCorrectPlate() {
		try {
			ValidateInputFormat.correctPlate("HJS-4541");
			ValidateInputFormat.correctPlate("PCA-7894");
		} catch (PickPlateException e) {
			System.out.println(e.getMessage());
		}
	}

}
