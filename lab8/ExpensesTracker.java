package lab8;

import java.io.*;
import java.util.Scanner;

public class ExpensesTracker{
	public static void main(String[] args) throws IOExeption {
		
		try {
			
		
			FileWriter fw = new FileWriter(new File("expenses.txt."));
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter outToFile = new PrintWriter(bw);
			String repeat = "y";
			String name, item, log, summary;
			double cost;
			Scanner fileScan = new Scanner(new File("expenses.txt")); 
			Scanner scanny = new Scanner(System.in);

		do{
	 
 
			System.out.println("Input your name: "); 
			name = scanny.nextLine();

			System.out.println("What did you purchase,");
			item = scanny.nextLine();

			System.out.println("How much did you pay? (in USD)"); 
			cost = scanny.nextDouble();

			scanny.nextLine();

			outToFile.println(name +"purchased " + item + " for " + cost +	"US Dollars.");
			System.out.println("Would you like to log another purchase? (y/n)");

			repeat = scanny.nextLine();

		}while (repeat.equalsIgnoreCase("y"));
 		
System.out.println("Would you like to read a summary of your purchase? (y/n)"); 
summary = scanny.nextLine();
outToFile.close();
scanny.close();

	if (summary.equalsIgnoreCase( "y" ) ) {
		while(fileScan.hasNext()) {
			log = fileScan.nextLine();
			System.out.println(log);
		}
	}
	
	} catch (I0Exception e) {
System.out.println("An error occurred."); 
e.printStackTrace();
		}
	}
 }
 
