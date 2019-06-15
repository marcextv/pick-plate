package ec.com.mtv.pick.plate.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ec.com.mtv.pick.plate.commons.PickPlateMessages;

/**
 * Pick & Plate Messages test.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class PickPlateMessagesTest {
	
	@Test
	public void testPickPlateMessagesInstance() {
		assertNotNull(PickPlateMessages.getInstance());
	}
	
	@Test
	public void testGetMessages() {
		String helloWorld = PickPlateMessages.getInstance().getMessageForKey("ec.com.mtv.pick.plate.hello.world");
		assertNotNull(helloWorld);
		System.out.println(helloWorld);
	}

}
