package ec.com.mtv.pick.plate.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import ec.com.mtv.pick.plate.entities.Plate;

/**
 * Plate test class.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class PlateTest {
	
	@Test
	public void testPlateIsNotNull() {
		Plate plate = new Plate("PCA-9712", "1721436267", "Marcelo Torres Vinueza");
		assertNotNull(plate);
		assertNotNull(plate.getNumber());
		assertNotNull(plate.getOwner());
		assertNotNull(plate.getOwner().getId());
		assertNotNull(plate.getOwner().getName());
	}
	
	@Test
	public void testPlateIsNull() {
		Plate plate = new Plate();
		assertNotNull(plate);
		assertNull(plate.getNumber());
		assertNotNull(plate.getOwner());
		assertNull(plate.getOwner().getId());
		assertNull(plate.getOwner().getName());
	}

}
