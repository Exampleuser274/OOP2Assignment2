package problemdomain;

public abstract class Vehicle {
	long carID;
	String vehicleType;
	String subtype;
	int speed;
	double fuel;
	int seats;
	int year;
	String driveTrain;
	int price;
	int quantity;
	public Vehicle(int carID, String vehicleType, String subtype, int speed, float fuel, int seats, int year,
			String driveTrain, int price, int quantity) {
		super();
		this.carID = carID;
		this.vehicleType = vehicleType;
		this.subtype = subtype;
		this.speed = speed;
		this.fuel = fuel;
		this.seats = seats;
		this.year = year;
		this.driveTrain = driveTrain;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public long getCarID() {
		return carID;
	}


	public void setCarID(int carID) {
		this.carID = carID;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getSubtype() {
		return subtype;
	}


	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public double getFuel() {
		return fuel;
	}


	public void setFuel(float fuel) {
		this.fuel = fuel;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getDriveTrain() {
		return driveTrain;
	}


	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public boolean isAvailable(){
		if (this.quantity > 0){
			return true;
		}else {
			return false;
		}
	}
	public void checkout() {
		int updateQuantity = this.getQuantity();
		if (this.isAvailable() == true) {
			updateQuantity -= 1;
			this.setQuantity(updateQuantity);
		}else {
			System.out.println("The selected vehicle is not available");}
		}
	
}
