package main;

import java.util.ArrayList;
import java.util.Scanner;

import problemdomain.*;

public class Menu {
  public ArrayList<Vehicle> displaymenu (ArrayList<Vehicle> vehicleList){
    boolean looping = true;

    Scanner choice = new java.util.Scanner(System.in);
		do {
		    System.out.println("\n===Welcome to Drivemasters");
		    System.out.println("\nPlease choose from the options:");
		    System.out.println("1. Purchase Vehicle");
		    System.out.println("2. Display vehicles by type");
		    System.out.println("3. Display vehicles by subtype.");
		    System.out.println("4. Produce random list of vehicles.");
		    System.out.println("5. Save and Exit");
		    int menu_choice = choice.nextInt();
		    choice.nextLine();

		    //based on interger from scanner it will lead into the following cases:
		    switch(menu_choice){
		      case 1:
		        vehicleList = vehiclePurchase(vehicleList,choice);
		        break;
		      case 2:
		        typeSearch(vehicleList,choice);
		        break;
		      case 3:
		        subtypeSearch(vehicleList,choice);
		        break;
		      case 4:
		        randomSearch(vehicleList,choice);
		        break;
		      case 5:
		        System.out.println("Exiting");
		        looping = false;
		        break;
		      default:
		        System.out.println("Invaild please try again.");
		        break;

		    

		    }
		    
		}
		while(looping == true);
		return vehicleList;
}
  
	public ArrayList<Vehicle> vehiclePurchase(ArrayList<Vehicle> vehicleList,Scanner myScanner){
		boolean foundCheck = false;
		Vehicle foundVehicle = null;
		float userSearch;
		int vehicleIndex = 0;
		
		System.out.println("Enter the ID of the vehicle you want to purchase");
		userSearch = myScanner.nextLong();
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
	public void typeSearch(ArrayList<Vehicle> vehicleList,Scanner myScanner) {
		String userSearch;
		boolean searchCheck = false;
		System.out.println("Enter the type of vehicle");
		userSearch = myScanner.nextLine().strip();
		System.out.println("Vehicles Found:");
		for (Vehicle car:vehicleList) {
			
			if (car.getVehicleType().toLowerCase().equals(userSearch.toLowerCase())) {
				
				System.out.println(car);
				searchCheck = true;
			}
		}
		if (searchCheck == false) {
			System.out.println("No vehicles found");
		}
	}
	public void subtypeSearch(ArrayList<Vehicle> vehicleList,Scanner myScanner) {
		int userType;
		String userSubType;
		boolean searchCheck = false;
		
		System.out.println("Enter the type of vehicle");
		System.out.println("1 for Sedan");
		System.out.println("2 for Hatchback");
		System.out.println("3 for SUV");
		System.out.println("4 for Hybrid");
		System.out.println("5 for Pickup Truck");
		userType = myScanner.nextInt();
		myScanner.nextLine();
		System.out.println("Enter the subtype");
		userSubType = myScanner.nextLine();
		System.out.println("Vehicles Found:");
		for (Vehicle car:vehicleList) {
			switch(userType) {
			case 1: if (car instanceof Sedan) {
				if (((Sedan) car).getTrunkSize().equals(userSubType)) {
					System.out.println(car);
					searchCheck = true;
					break;
				}
			}case 2: if (car instanceof Hatchback) {
				if (((Hatchback) car).getHatchType().toLowerCase().equals(userSubType.toLowerCase())) {
					System.out.println(car);
					searchCheck = true;
					break;
				}
			}case 3: if (car instanceof SUV) {
				if (((SUV) car).getDriveTrain().toLowerCase().equals(userSubType.toLowerCase())) {
					System.out.println(car);
					searchCheck = true;
					break;
				}
			}case 4: if (car instanceof Hybrid) {
				if (((Hybrid) car).getPowerTrain().toLowerCase().equals(userSubType.toLowerCase())) {
					System.out.println(car);
					searchCheck = true;
					break;
				}
			}case 5: if (car instanceof PickupTruck) {
				if (((PickupTruck) car).getCargoBed().toLowerCase().equals(userSubType.toLowerCase())) {
					System.out.println(car);
					searchCheck = true;
					break;
				}
			}
			}
		}
		if (searchCheck == false) {
			System.out.println("No vehicles found");
		}
		
	}
	public void randomSearch(ArrayList<Vehicle> vehicleList,Scanner myScanner) {
		int vehicleAmount;
		System.out.println("Enter the number of vehicles");
		vehicleAmount = myScanner.nextInt();
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
