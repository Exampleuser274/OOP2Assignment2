package problemdomain;

public class PickupTruck extends Vehicle{
	enum cbs{
		SB,EB,DB
	}
	cbs cargoBed;
	int cargoCapacity;
	public PickupTruck(int carID, String vehicleType, String subtype, int speed, float fuel, int seats, int year,
			String driveTrain, int price, int quantity, cbs cargoBed, int cargoCapacity) {
		super(carID, vehicleType, subtype, speed, fuel, seats, year, driveTrain, price, quantity);
		this.cargoBed = cargoBed;
		this.cargoCapacity = cargoCapacity;
	}
	
}
