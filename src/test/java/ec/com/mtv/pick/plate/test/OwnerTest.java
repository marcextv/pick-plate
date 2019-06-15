package ec.com.mtv.pick.plate.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import ec.com.mtv.pick.plate.entities.Owner;

/**
 * Owner test class.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class OwnerTest {

	@Test
	public void testOwnerIsNotNull() {
		Owner owner = new Owner("1721436267", "Marcelo Torres Vinueza");
		assertNotNull(owner);
		assertNotNull(owner.getId());
		assertNotNull(owner.getName());
	}
	
	@Test
	public void testOwnerIsNull() {
		Owner owner = new Owner();
		assertNotNull(owner);
		assertNull(owner.getId());
		assertNull(owner.getName());
	}
	
}
