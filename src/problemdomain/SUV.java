package problemdomain;

public class SUV extends Vehicle{
	

	public SUV(long carID, String vehicleType, String subtype, int speed, double fuel, int seats, int year,
			String driveTrain, int price, int quantity) {
		super(carID, vehicleType, subtype, speed, fuel, seats, year, driveTrain, price, quantity);
	}
	@Override
	public String returnToFile() {
		return (carID + ";" + vehicleType + ";" + subtype  + ";" +  speed  + ";" + fuel  + ";" +  seats  + ";" +  year  + ";" +  driveTrain  + ";" + price + ";" + quantity);
		}
	@Override
	 public String toString() {
		return "Car ID:          " + carID + "\n"
			 + "Vehicle Type:    " + vehicleType + "\n"
			 + "Sub Type:        " + subtype + "\n"
			 + "Speed:           " + speed + "\n"
			 + "Fuel:            " + fuel + "\n"
			 + "Number of Seats: " + seats + "\n"
			 + "Year:            " + year + "\n"
			 + "Drivetrain:      " + driveTrain + "\n"
			 + "Price:           " + price + "\n"
			 + "Available:       " + quantity + "\n";
	 }
}
