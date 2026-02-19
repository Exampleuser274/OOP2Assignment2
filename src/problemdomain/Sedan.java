package problemdomain;

public class Sedan extends Vehicle{
 enum trunks{
	 L,M,S
 }
trunks trunkSize;
 public Sedan(int carID, String vehicleType, String subtype, int speed, float fuel, int seats, int year,
		String driveTrain, int price, int quantity, trunks trunkSize) {
	super(carID, vehicleType, subtype, speed, fuel, seats, year, driveTrain, price, quantity);
	this.trunkSize = trunkSize;
 }
 @Override
 public String toString() {
	 String trunkDesc;
	 if (trunkSize == trunks.L) {
		 trunkDesc = "Large/spacious trunk";
	 } else if (trunkSize == trunks.M) {
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
