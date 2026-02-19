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
	
}
