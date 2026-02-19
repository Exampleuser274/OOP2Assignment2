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
	@Override
	 public String toString() {
		 String bedDesc;
		 if (cargoBed == cbs.EB) {
			 bedDesc = "Short Bed";
		 } else if (cargoBed == cbs.EB) {
			 bedDesc = "Extended Bed";
		 }	else {
			 bedDesc = "Dump Bed";
		 }
		return "Car ID:          " + carID + "\n"
			 + "Vehicle Type:    " + vehicleType + "\n"
			 + "Sub Type:        " + subtype + "\n"
			 + "Speed:           " + speed + "\n"
			 + "Fuel:            " + fuel + "\n"
			 + "Number of Seats: " + seats + "\n"
			 + "Year:            " + year + "\n"
			 + "Drivetrain:      " + driveTrain + "\n"
			 + "Price:           " + price + "\n"
			 + "Available:       " + quantity + "\n"
			 + "Bed Type:        " + bedDesc + "\n"
			 + "Bed Size:        " + cargoCapacity;
	 }
}
