package ec.com.mtv.pick.plate.entities;

import lombok.Getter;
import lombok.Setter;

/**
 * Owner of plate object description.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
@Getter
@Setter
public class Owner {

	/**
	 * Plate owner identification.
	 */
	private String id;

	/**
	 * Plate owner complete name.
	 */
	private String name;

	/**
	 * Empty constructor.
	 * 
	 * @see Owner
	 */
	public Owner() {

	}

	/**
	 * Constructor with all parameters.
	 * 
	 * @see Owner
	 * 
	 * @param id   owner identifier
	 * @param name owner name
	 */
	public Owner(String id, String name) {
		this.id = id;
		this.name = name;
	}

}
