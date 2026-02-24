package main;

import java.util.ArrayList;

import problemdomain.*;

public class Main {
//Main loop only
	public static void main(String[] args) {
		Menu menu = new Menu();
		Files files = new Files();
		ArrayList<Vehicle> vehicleList = files.loadFile();
		vehicleList = menu.displaymenu(vehicleList);
		files.saveFile(vehicleList);
	}

}
