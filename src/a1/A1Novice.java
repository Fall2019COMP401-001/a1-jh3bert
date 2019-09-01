package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Initializing variables and arrays to be used in future code

		int customers = scan.nextInt();

		String[] firstNames= new String[customers];
		String[] lastNames= new String[customers];
		double[] totals= new double[customers];
		
		double cost =0.0;

		// assigning customer names to the name string arrays
			for (int i =0; i<firstNames.length; i++) {
						
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
					
			int items = scan.nextInt();
		
		// assigning a quantity, name, price to each item bought, incrementing total cost for each item
			for (int y =0; y<items; y++) {
				
				int quantity = scan.nextInt();
							
				String itemName= scan.next();
				
				double price = scan.nextDouble();
				
				cost+=quantity*price;
			
			}
		// assigning the end cost to the total array at the same index of the customer name, resetting cost after each loop	
			totals[i]=cost;
			cost=0;
			}
		// printing results	
			for (int i =0; i<firstNames.length; i++) {
				
				System.out.print(firstNames[i].charAt(0)+". "+lastNames[i]+": ");
				System.out.printf("%.2f",totals[i]);
				System.out.println();
			}
	
	
	
	}
}
