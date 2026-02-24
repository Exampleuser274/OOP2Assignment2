package main;

import java.util.ArrayList;
import java.util.Scanner;

import problemdomain.*;

public class Menu {
	public ArrayList<Vehicle> vehiclePurchase(ArrayList<Vehicle> vehicleList){
		boolean foundCheck = false;
		Vehicle foundVehicle = null;
		float userSearch;
		int vehicleIndex = 0;
		try (Scanner myScanner = new Scanner(System.in)) {
			System.out.println("Enter the ID of the vehicle you want to purchase");
			userSearch = myScanner.nextLong();
		}
		for (Vehicle car:vehicleList) {
			if (userSearch == car.getCarID()){
				foundCheck = true;
				foundVehicle = car;
				vehicleIndex = vehicleList.indexOf(car);
			}
		}
		if (foundCheck == true) {
			if (foundVehicle.getQuantity() > 0) {
				foundVehicle.setQuantity(foundVehicle.getQuantity()-1);
				vehicleList.set(vehicleIndex, foundVehicle);
				System.out.println("Vehicle Purchased");
			}else {
				System.out.println("Vehicle not available");
			}
		}else {
			System.out.println("Vehicle not found");
		}
		return(vehicleList);
	}
}
