package fiveMVehiclesLua;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;	

public class VehiclesGen {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		File carFile = new File("cars.txt");
		PrintWriter ofile = new PrintWriter("output.txt");
		
		if (!carFile.exists()) {
			System.out.println("\"cars.txt\" does not exist. Please make this file and try again.");
			Thread.sleep(5000);
			System.exit(0);
		}
		
		Scanner filescan = new Scanner(carFile);
		Scanner userIn = new Scanner (System.in);
		
		
		ArrayList<String> carArr = new ArrayList<String>();
		
		
		while (filescan.hasNextLine()) {
			carArr.add(filescan.nextLine());
		}
		filescan.close();
		
		for (String i : carArr) {
			System.out.println("What is the NAME of " + i + "? (\"quit\" to quit)");
			String cName = userIn.nextLine();
			
			System.out.println("What is the BRAND of " + i + "? (\"quit\" to quit)");
			String cBrand = userIn.nextLine();
			
			System.out.println("What is the CATEGORY of " + i + "? (\"quit\" to quit)\n(compacts, sedans, suvs, coupes, muscle, sports, super, motorcycle, offroad, industrial, utility, vans, cycles, boats, planes, service, emergency, military, commercial, trains)");
			String cCat = userIn.nextLine();
			
			if (cName.equalsIgnoreCase("QUIT") || cBrand.equalsIgnoreCase("QUIT") || cCat.equalsIgnoreCase("QUIT")) {
				ofile.close();
				userIn.close();
				System.out.println("Exiting...");
				System.exit(0);
			}
			
			ofile.println("--" + i + "\n\n");
			ofile.println("[\'" + i + "\'] = {\n");
			ofile.println("\t[\'name\'] = \'" + cName + "\',\n");
			ofile.println("\t[\'brand\'] = \'" + cBrand + "\',\n");
			ofile.println("\t[\'model\'] = \'" + i + "\',\n");
			ofile.println("\t[\'price\'] = \'99999\', --EDIT ME\n");
			ofile.println("\t[\'category\'] = \'" + cCat + "\',\n");
			ofile.println("\t[\'hash\'] = `" + i + "`,\n");
			ofile.println("\t[\'shop\'] = \'pdm\', --EDIT ME\n");
			ofile.println("},\n\n");
			
		}
		ofile.close();
		userIn.close();
		
		System.out.println(carArr);
		
		System.out.println("\n\n\tDone...");
		System.exit(0);
	}

}
