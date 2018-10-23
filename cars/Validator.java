package cars;

import java.util.Scanner;

public class Validator {// app for validating inputs and detecting invalid inputs
	Scanner scan = new Scanner(System.in);
	int userInt;
	double userDouble;

	public int numberIsInteger() {
		boolean isValid = false;
		do {
			if (scan.hasNextInt()) {
				userInt = scan.nextInt();
				isValid = true;
			} else {
				System.out.println("Enter valid integer: ");
			}
			scan.nextLine();
		} while (!isValid);
		return userInt;
	}

	public int numberIsBetweenTwoNumbers(int lowerInt, int upperInt) {

		do {
			numberIsInteger();
			while (userInt < lowerInt || userInt > upperInt) {// using the || (or) sign to make either input is
																// lower than or greater than the upper and lower
																// Int
				System.out.print("Please re-enter number: ");
				numberIsInteger();
			}
		} while (userInt < lowerInt && userInt > upperInt);
		return userInt;
	}

	public int numberIsPositiveInteger(int i) {
		boolean validInt = false;
		do {

			if (scan.hasNextInt()) {
				userInt = scan.nextInt();
				validInt = true;
				if (userInt < i) {
					System.out.println("Not a positive integer. Please enter valid choice: ");
					validInt = false;
				}
			} else {
				System.out.println("Not an integer. Please enter valid choice: ");
			}
			scan.nextLine();
		} while (!validInt);

		return userInt;
	}

	public double numberIsDouble() {
		boolean isValid = false;
		do {
			if (scan.hasNextDouble()) {
				userDouble = scan.nextDouble();
				isValid = true;
			} else {
				System.out.println("Enter valid number: ");
			}
			scan.nextLine();
		} while (!isValid);
		return userDouble;
	}

	public boolean validateUsed() {
		boolean isValid = false;

		do {
			String choice = scan.nextLine();

			if (choice.equalsIgnoreCase("y")) {
				isValid = true;
			} else if (choice.equalsIgnoreCase("n")) {
				return isValid;
			} else {
				System.out.println("Invalid entry, please type 'y' to continue or 'n' to end.");
			}

		} while (!isValid);

		return isValid;
	}
}
