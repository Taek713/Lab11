package cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		Car car = new Car();
		String userInput = "";

		Validator validate = new Validator();
		ArrayList<Car> carList = new ArrayList<>();//using array list to hold listed car inputs

		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.print("\nHow many cars are you entering: ");
		int numCars = validate.numberIsPositiveInteger(0);

		for (int i = 0; i < numCars; i++) {
			System.out.print("\nEnter car #" + (i + 1) + " make:");//using i + 1 for adding # to it
			String userCar = scan.nextLine();
			car.setMake(userCar);// setting to store car
			System.out.print("\nEnter car #" + (i + 1) + " model:");
			String userModel = scan.nextLine();
			car.setModel(userModel);
			System.out.print("\nEnter car #" + (i + 1) + " year:");
			int userYear = validate.numberIsBetweenTwoNumbers(1000, 9999);
			car.setYear(userYear);
			System.out.print("\nEnter car #" + (i + 1) + " price:");
			double userPrice = validate.numberIsDouble();
			car.setPrice(userPrice);
			System.out.println("\nIs the car used? (y/n)");

			if (validate.validateUsed()) {
				System.out.println("\nEnter car #" + (i + 1) + " milage:");
				int userMilage = validate.numberIsPositiveInteger(0);
				carList.add(new usedCar(userCar, userModel, userYear, userPrice, userMilage));
			} else {
				carList.add(new Car(userCar, userModel, userYear, userPrice));
			}

		}
		System.out.println("\nCurrent Inventory: ");
		for (Car list : carList) {// enhanced for, for list and cars 
			System.out.print(list + "\n");
		}

		System.out.print("\nWhich car would you like? ");
		userInput = scnr.nextLine();

	}
}
