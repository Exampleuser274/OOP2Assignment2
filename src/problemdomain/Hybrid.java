package problemdomain;


public class Hybrid extends Vehicle{
	enum pts{
		E,A,PHEV
	}
	pts powerTrain;
	int electricRange;
	public Hybrid(int carID, String vehicleType, String subtype, int speed, float fuel, int seats, int year,
			String driveTrain, int price, int quantity, pts powerTrain, int electricRange) {
		super(carID, vehicleType, subtype, speed, fuel, seats, year, driveTrain, price, quantity);
		this.powerTrain = powerTrain;
		this.electricRange = electricRange;
	}
	@Override
	 public String toString() {
		 String powerDesc;
		 if (powerTrain == pts.E) {
			 powerDesc = "Power Liftgate";
		 } else if (powerTrain == pts.A) {
			 powerDesc = "Split Liftgate";
		 }	else {
			 powerDesc = "Standard Liftgate";
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
			 + "Powertrain:      " + powerDesc + "\n"
			 + "Range:           " + electricRange;
	 }
}
