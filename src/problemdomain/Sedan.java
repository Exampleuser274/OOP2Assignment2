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


}
