package problemdomain;


public class PickupTruck extends Vehicle{
	
	String cargoBed;
	int cargoCapacity;
	public PickupTruck(long carID, String vehicleType, String subtype, int speed, double fuel, int seats, int year,
			String driveTrain, int price, int quantity, String cargoBed, int cargoCapacity) {
		super(carID, vehicleType, subtype, speed, fuel, seats, year, driveTrain, price, quantity);
		this.cargoBed = cargoBed;
		this.cargoCapacity = cargoCapacity;
	}
	@Override
	public String returnToFile() {
		return (carID + ";" + vehicleType + ";" + subtype  + ";" +  speed  + ";" + fuel  + ";" +  seats  + ";" +  year  + ";" +  driveTrain  + ";" + price + ";" + quantity + ";" + cargoBed + ";" + cargoCapacity);
		}
	public String getCargoBed() {
		return cargoBed;
	}
	public void setCargoBed(String cargoBed) {
		this.cargoBed = cargoBed;
	}
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	@Override
	 public String toString() {
		 String bedDesc;
		 if (cargoBed == "SB") {
			 bedDesc = "Short Bed";
		 } else if (cargoBed == "EB") {
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
