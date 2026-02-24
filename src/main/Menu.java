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
	public void typeSearch(ArrayList<Vehicle> vehicleList) {
		String userSearch;
		boolean searchCheck = false;
		try (Scanner myScanner = new Scanner(System.in)) {
			System.out.println("Enter the type of vehicle");
			userSearch = myScanner.nextLine();
		}
		for (Vehicle car:vehicleList) {
			if (car.getVehicleType() == userSearch) {
				System.out.println(car);
				searchCheck = true;
			}
		}
		if (searchCheck == false) {
			System.out.println("No vehicles found");
		}
	}
	public void subtypeSearch(ArrayList<Vehicle> vehicleList) {
		String userType;
		String userSubType;
		boolean searchCheck = false;
		try (Scanner myScanner = new Scanner(System.in)) {
			System.out.println("Enter the type of vehicle");
			userType = myScanner.nextLine();
			System.out.println("Enter the subtype");
			userSubType = myScanner.nextLine();
		}
		for (Vehicle car:vehicleList) {
			if (car.getVehicleType() == userType && userSubType == car.getSubtype()) {
				System.out.println(car);
				searchCheck = true;
			}
		}
		if (searchCheck == false) {
			System.out.println("No vehicles found");
		}
		
	}
	public void randomSearch(ArrayList<Vehicle> vehicleList) {
		int vehicleAmount;
		try (Scanner myScanner = new Scanner(System.in)) {
			System.out.println("Enter the number of vehicles");
			vehicleAmount = myScanner.nextInt();
		}
		ArrayList<Vehicle> randomVehicles = new ArrayList<Vehicle>(vehicleList);
		java.util.Collections.shuffle(randomVehicles);
		if (vehicleAmount > randomVehicles.size()) {
			vehicleAmount = randomVehicles.size();
		}
		for (int index = 0; index < vehicleAmount; index++) {
			Vehicle car = randomVehicles.get(index);
			System.out.println(car);
		}
	}
}
