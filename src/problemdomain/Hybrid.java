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
	
}
