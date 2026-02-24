package problemdomain;


public class Hybrid extends Vehicle{

	String powerTrain;
	int electricRange;
	public Hybrid(long carID, String vehicleType, String subtype, int speed, double fuel, int seats, int year,
			String driveTrain, int price, int quantity, String powerTrain, int electricRange) {
		super(carID, vehicleType, subtype, speed, fuel, seats, year, driveTrain, price, quantity);
		this.powerTrain = powerTrain;
		this.electricRange = electricRange;
	}
	@Override
	public String returnToFile() {
		return (carID + ";" + vehicleType + ";" + subtype  + ";" +  speed  + ";" + fuel  + ";" +  seats  + ";" +  year  + ";" +  driveTrain  + ";" + price + ";" + quantity + ";" + powerTrain + ";" + electricRange);
		}
	public String getPowerTrain() {
		return powerTrain;
	}
	public void setPowerTrain(String powerTrain) {
		this.powerTrain = powerTrain;
	}
	public int getElectricRange() {
		return electricRange;
	}
	public void setElectricRange(int electricRange) {
		this.electricRange = electricRange;
	}
	@Override
	 public String toString() {
		 String powerDesc;
		 if (powerTrain == "E") {
			 powerDesc = "Power Liftgate";
		 } else if (powerTrain == "A") {
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
			 + "Range:           " + electricRange + "\n";
	 }
}
