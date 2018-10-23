package cars;

import java.util.ArrayList;
import java.util.List;

public class CarLot {
	private CarLot newLot = new CarLot();

	public void setUp() throws Exception {

		try {

			newLot.addCarToLot(new Car("GMC", "Terrain", 2017, 12399.99));
			newLot.addCarToLot(new Car("Toyota", "Camry", 2017, 25000.99));
			newLot.addCarToLot(new Car("Chevy", "Corvette", 2014, 14950.99));
			newLot.addCarToLot(new usedCar("Nissan", "Altima", 2015, 15000.99, 1100));
			newLot.addCarToLot(new usedCar("Mercury", "Mountaineer", 2011, 7000.00, 1300));
			newLot.addCarToLot(new usedCar("Ford", "Fusion", 2008, 10000.00, 2000));

		} catch (Exception n) {
			n.printStackTrace();
		}

	}

	public void tearDown() throws Exception {
	}

	public void displayALlCars() throws Exception {
		newLot.displayALlCars();

	}

	public void addCarToLot(Car car) throws Exception {
		try {

			newLot.addCarToLot(new Car("GM", "GMC", 2017, 12345.43));
			newLot.addCarToLot(new Car("Toyota", "Cammy", 2017, 25000.50));
			newLot.addCarToLot(new Car("Chrysler", "200", 2017, 1450.63));
			newLot.addCarToLot(new usedCar("Nissan", "Quest", 2015, 15000.43, 1100));
			newLot.addCarToLot(new usedCar("GM", "Spark", 2011, 7000.43, 1300));
			newLot.addCarToLot(new usedCar("Ford", "Fusion", 2008, 10000.30, 2000));

			newLot.displayALlCars();

		} catch (Exception n) {

		}
	}

	public void removeCarFromLot(Car car) throws Exception {

		try {

			newLot.addCarToLot(new Car("GM", "GMC", 2017, 12345.43));
			newLot.addCarToLot(new Car("Toyota", "Cammy", 2017, 25000.50));
			newLot.addCarToLot(new Car("Chrysler", "200", 2017, 1450.63));
			newLot.addCarToLot(new usedCar("Nissan", "Quest", 2015, 15000.43, 1100));
			newLot.addCarToLot(new usedCar("GM", "Spark", 2011, 7000.43, 1300));
			newLot.addCarToLot(new usedCar("Ford", "Fusion", 2008, 10000.30, 2000));
			newLot.displayALlCars();

			newLot.addCarToLot(new Car("GM", "GMC", 2017, 12345.43));
			newLot.addCarToLot(new Car("Toyota", "Cammy", 2017, 25000.50));
			newLot.addCarToLot(new Car("Chrysler", "200", 2017, 1450.63));
			newLot.addCarToLot(new usedCar("Nissan", "Quest", 2015, 15000.43, 1100));
			newLot.addCarToLot(new usedCar("GM", "Spark", 2011, 7000.43, 1300));
			newLot.addCarToLot(new usedCar("Ford", "Fusion", 2008, 10000.30, 2000));
			newLot.displayALlCars();

		} catch (Exception n) {

		}
	}

	public void findCarByLocation() throws Exception {
	}

	public void replaceCar() throws Exception {
	}

}
