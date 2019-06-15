package ec.com.mtv.pick.plate.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import ec.com.mtv.pick.plate.data.PlateDayRelation;

/**
 * Plate day relation data test.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class PlateDayRelationTest {
	
	@Test
	public void testPlateDayRelationInstance() {
		assertNotNull(PlateDayRelation.getInstance());
	}
	
	@Test
	public void testGetValues() {
		List<Integer> values = PlateDayRelation.getInstance().getFridayValues();
		assertNotNull(values);
		values.forEach(System.out::println);
		values = PlateDayRelation.getInstance().getWednesdayValues();
		assertNotNull(values);
		values.forEach(System.out::println);
	}

}
