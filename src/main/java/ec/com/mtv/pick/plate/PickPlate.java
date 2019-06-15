package ec.com.mtv.pick.plate;

import java.util.Scanner;

import ec.com.mtv.pick.plate.logic.PickPlateLogic;

/**
 * Main class.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class PickPlate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nextIteraction;
		do {
			System.out.println("Pick & Plate Analyzer");
			System.out.println("\n=====================");
			System.out.println("\nFirst, write the plate of car (remember, it must be on format XXX-####): ");
			String plate = input.nextLine();
			System.out.println("\nNext, write a date you want to check (remember, it must be on format yyyy-MM-dd): ");
			String date = input.nextLine();
			System.out.println(
					"\nLast but not least, write the time of date you want to check (remember, it must be on format HH:mm:ss): ");
			String time = input.nextLine();
			if (plate != null && date != null && time != null) {
				PickPlateLogic logic = new PickPlateLogic();
				System.out.println(logic.pickPlate(plate, date, time));
			} else {
				System.err.println("Error processing data, one of the parameters is null");
			}
			System.out.println("\n=====================");
			System.out.println("\nContinue: (y/n):");
			nextIteraction = input.nextLine();
		} while (nextIteraction.equalsIgnoreCase("y") || nextIteraction.equalsIgnoreCase("yes"));
		System.out.println("Thanks!!");
		input.close();
	}

}
