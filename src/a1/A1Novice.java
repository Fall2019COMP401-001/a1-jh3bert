package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customerCount= 0;

		System.out.println("Enter number of customers: ");
		int customers = scan.nextInt();

		String[] firstNames= new String[customers];
		String[] lastNames= new String[customers];
		double[] totals= new double[customers];
		
		double cost =0.0;

			for (int i =0; i<firstNames.length; i++) {
						
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
					
			int items = scan.nextInt();

			for (int y =0; y<items; y++) {
				
				int quantity = scan.nextInt();
							
				String itemName= scan.next();
				
				double price = scan.nextDouble();
				
				cost+=quantity*price;
			
			}
			totals[i]=cost;
			cost=0;
			}
			
			for (int i =0; i<firstNames.length; i++) {
				
				System.out.print(firstNames[i].charAt(0)+". "+lastNames[i]+": ");
				System.out.printf("%.2f",totals[i]);
			}
	
	
	
	}
}
