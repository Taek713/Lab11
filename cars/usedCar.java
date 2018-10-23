package cars;

public class usedCar extends Car {

	private double mileage;

	public usedCar(String make, String model, int year, double price, double milage) {
		super(make, model, year, price);
		this.mileage = milage;
	}

	public double getMilage() {
		return mileage;
	}

	public void setMilage(double milage) {
		this.mileage = milage;
	}

	@Override
	public String toString() {
		return super.toString()+" Mileage : "+this.mileage;
	}
}