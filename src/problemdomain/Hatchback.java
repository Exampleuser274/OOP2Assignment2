package problemdomain;

public class Hatchback extends Vehicle{
	
	String hatchType;
	public Hatchback(long carID, String vehicleType, String subtype, int speed, double fuel, int seats, int year,
			String driveTrain, int price, int quantity, String hatchType) {
		super(carID, vehicleType, subtype, speed, fuel, seats, year, driveTrain, price, quantity);
		this.hatchType = hatchType;
	}
	@Override
	public String returnToFile() {
		return (carID + ";" + vehicleType + ";" + subtype  + ";" +  speed  + ";" + fuel  + ";" +  seats  + ";" +  year  + ";" +  driveTrain  + ";" + price + ";" + quantity + ";" + hatchType);
		}
	@Override
	 public String toString() {
		 String hatchDesc;
		 if (hatchType == "P") {
			 hatchDesc = "Power Liftgate";
		 } else if (hatchType == "T") {
			 hatchDesc = "Split Liftgate";
		 }	else {
			 hatchDesc = "Standard Liftgate";
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
			 + "Hatch Type:      " + hatchDesc;
	 }
}
