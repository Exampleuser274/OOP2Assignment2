package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import problemdomain.Vehicle;

public class Files {
//Class for save & load functions
//Alexander Kovach is working on load function
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
			while (vehicleReader.hasNextLine()) {
				line = vehicleReader.nextLine();
				parts = line.split(";");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehicleList;
	}
}
