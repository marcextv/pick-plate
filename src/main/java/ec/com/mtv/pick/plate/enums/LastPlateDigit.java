package ec.com.mtv.pick.plate.enums;

/**
 * Enumerators for last plate digit.
 *  
 * @author Marcelo Torres Vinueza
 *
 */
public enum LastPlateDigit {

	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), ZERO(0);
	
	private int value;
	
	LastPlateDigit(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
