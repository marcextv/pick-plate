package ec.com.mtv.pick.plate.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ec.com.mtv.pick.plate.data.PickTimeRelation;

/**
 * Pick time data test.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class PickTimeRelationTest {
	
	@Test
	public void testPickTimeRelationInstance() {
		assertNotNull(PickTimeRelation.getInstance());
	}
	
	@Test
	public void testGetInformation() {
		String value = PickTimeRelation.getInstance().getEndNightTime();
		assertNotNull(value);
		System.out.println(value);
		value = PickTimeRelation.getInstance().getInitMorningTime();
		assertNotNull(value);
		System.out.println(value);
	}

}
