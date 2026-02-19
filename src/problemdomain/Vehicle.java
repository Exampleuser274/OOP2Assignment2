package problemdomain;

public abstract class Vehicle {
	int carID;
	String vehicleType;
	String subtype;
	int speed;
	float fuel;
	int seats;
	int year;
	String driveTrain;
	int price;
	int quantity;
	public Vehicle(int carID, String vehicleType, String subtype, int speed, float fuel, int seats, int year,
			String driveTrain, int price, int quantity) {
		super();
		this.carID = carID;
		this.vehicleType = vehicleType;
		this.subtype = subtype;
		this.speed = speed;
		this.fuel = fuel;
		this.seats = seats;
		this.year = year;
		this.driveTrain = driveTrain;
		this.price = price;
		this.quantity = quantity;
	}
	
}
