package ec.com.mtv.pick.plate.entities;

import lombok.Getter;
import lombok.Setter;

/**
 * Plate object description.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
@Getter
@Setter
public class Plate {

	/**
	 * Plate identifier.
	 */
	private String number;

	/**
	 * Plate owner.
	 */
	private Owner owner;

	/**
	 * Empty constructor.
	 * 
	 * @see Plate
	 * 
	 */
	public Plate() {
		this.owner = new Owner();
	}

	/**
	 * Constructor with all parameters.
	 * 
	 * @see Plate
	 * 
	 * @param number    plate number
	 * @param ownerId   owner identifier
	 * @param ownerName owner name
	 */
	public Plate(String number, String ownerId, String ownerName) {
		this.owner = new Owner(ownerId, ownerName);
		this.number = number;
	}

}
