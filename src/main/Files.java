package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import problemdomain.*;

public class Files {
//Class for save & load functions
//LoadFile & saveFile function made by Alexander Kovach
	public ArrayList<Vehicle> loadFile() {
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		File vehicleListFile = new File("res\\vehicles.txt");
		try (Scanner vehicleReader = new Scanner(vehicleListFile)){
			String line;
			String[] parts;
			long carID;
			String vehicleType;
			String subType;
			int speed;
			double fuel;
			int seats;
			int year;
			String drivetrain;
			int price;
			int quantity;
			String typeFeature = null;
			int featureInfo = 0;
			String idCheck;
			Vehicle newVehicle = null;
			while (vehicleReader.hasNextLine()) {
				line = vehicleReader.nextLine();
				
				parts = line.split(";");
				carID = Long.parseLong(parts[0]);
				vehicleType = parts[1];
				subType = parts[2];
				speed = Integer.parseInt(parts[3]);
				fuel = Double.parseDouble(parts[4]);
				seats = Integer.parseInt(parts[5]);
				year = Integer.parseInt(parts[6]);
				drivetrain = parts[7];
				price = Integer.parseInt(parts[8]);
				quantity = Integer.parseInt(parts[9]);
				idCheck = Long.toString(carID);
				if (parts.length >= 11) {
					typeFeature = parts[10];
				}
				if (parts.length == 12) {
					featureInfo = Integer.parseInt(parts[11]);
				}
				if (idCheck.startsWith("1")) {
					
					newVehicle = new Sedan(carID,vehicleType,subType,speed,fuel,seats,year,drivetrain,price,quantity,typeFeature);
					
				} else if (idCheck.startsWith("2")) {
					newVehicle = new Hatchback(carID,vehicleType,subType,speed,fuel,seats,year,drivetrain,price,quantity,typeFeature);
				}else if (idCheck.startsWith("3")) {
					newVehicle = new SUV(carID,vehicleType,subType,speed,fuel,seats,year,drivetrain,price,quantity);
				}else if (idCheck.startsWith("4") || idCheck.startsWith("5")) {
					newVehicle = new Hybrid(carID,vehicleType,subType,speed,fuel,seats,year,drivetrain,price,quantity,typeFeature,featureInfo);
				}else if (idCheck.startsWith("6")){
					newVehicle = new PickupTruck(carID,vehicleType,subType,speed,fuel,seats,year,drivetrain,price,quantity,typeFeature,featureInfo);
				}
				vehicleList.add(newVehicle);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehicleList;
	}
	public void saveFile(ArrayList<Vehicle> vehicleList) {
		try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.File("res\\vehicles.txt"))){
			for (Vehicle car : vehicleList) {
				writer.println(car.returnToFile());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
