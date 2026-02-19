package problemdomain;

public class Hatchback extends Vehicle{
	enum hatches{
		S,T,P
	}
	hatches hatchType;
	public Hatchback(int carID, String vehicleType, String subtype, int speed, float fuel, int seats, int year,
			String driveTrain, int price, int quantity, hatches hatchType) {
		super(carID, vehicleType, subtype, speed, fuel, seats, year, driveTrain, price, quantity);
		this.hatchType = hatchType;
	}
	@Override
	 public String toString() {
		 String hatchDesc;
		 if (hatchType == hatches.P) {
			 hatchDesc = "Power Liftgate";
		 } else if (hatchType == hatches.T) {
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
