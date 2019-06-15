package ec.com.mtv.pick.plate.data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ec.com.mtv.pick.plate.enums.LastPlateDigit;
import lombok.Getter;

/**
 * Data repository for relation between day and number for Pick and Date rules.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
@Getter
public final class PlateDayRelation {

	/**
	 * Instance of class.
	 */
	private static final PlateDayRelation INSTANCE = new PlateDayRelation();

	/**
	 * Values for Monday.
	 */
	private List<Integer> mondayValues;

	/**
	 * Values for Tuesday.
	 */
	private List<Integer> tuesdayValues;

	/**
	 * Values for Wednesday.
	 */
	private List<Integer> wednesdayValues;

	/**
	 * Values for Thursday.
	 */
	private List<Integer> thursdayValues;

	/**
	 * Values for Friday.
	 */
	private List<Integer> fridayValues;

	/**
	 * Private constructor. Set default values for pick date.
	 */
	private PlateDayRelation() {
		this.mondayValues = Stream.of(LastPlateDigit.ONE.getValue(), LastPlateDigit.TWO.getValue())
				.collect(Collectors.toList());
		this.tuesdayValues = Stream.of(LastPlateDigit.THREE.getValue(), LastPlateDigit.FOUR.getValue())
				.collect(Collectors.toList());
		this.wednesdayValues = Stream.of(LastPlateDigit.FIVE.getValue(), LastPlateDigit.SIX.getValue())
				.collect(Collectors.toList());
		this.thursdayValues = Stream.of(LastPlateDigit.SEVEN.getValue(), LastPlateDigit.EIGHT.getValue())
				.collect(Collectors.toList());
		this.fridayValues = Stream.of(LastPlateDigit.NINE.getValue(), LastPlateDigit.ZERO.getValue())
				.collect(Collectors.toList());
	}

	/**
	 * @return the instance
	 */
	public static PlateDayRelation getInstance() {
		return INSTANCE;
	}

}
