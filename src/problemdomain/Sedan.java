package problemdomain;

public class Sedan extends Vehicle{
	
String trunkSize;
 public Sedan(long carID, String vehicleType, String subtype, int speed, double fuel, int seats, int year,
		String driveTrain, int price, int quantity, String trunkSize) {
	super(carID, vehicleType, subtype, speed, fuel, seats, year, driveTrain, price, quantity);
	this.trunkSize = trunkSize;
 }
 @Override
 public String returnToFile() {
		return (carID + ";" + vehicleType + ";" + subtype  + ";" +  speed  + ";" + fuel  + ";" +  seats  + ";" +  year  + ";" +  driveTrain  + ";" + price + ";" + quantity + ";" + trunkSize);
		}
 public String getTrunkSize() {
	return trunkSize;
}
 public void setTrunkSize(String trunkSize) {
	this.trunkSize = trunkSize;
 }
 @Override
 public String toString() {
	 String trunkDesc;
	 if (trunkSize == "L") {
		 trunkDesc = "Large/spacious trunk";
	 } else if (trunkSize == "M") {
		 trunkDesc = "Moderate";
	 }	else {
		 trunkDesc = "Small";
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
		 + "Trunk Size:      " + trunkDesc;
 }


}
