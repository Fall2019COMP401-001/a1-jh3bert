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
		

			for (int i =0; i<firstNames.length; i++) {
			
			
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
						
			int items = scan.nextInt();

			for (int y =0; y<items; y++) {

				int quantity = scan.nextInt();
				
				String itemName= scan.next();

				double price = scan.nextDouble();
				
				totals[y]=quantity*price;
			
			}
		
			}
			
			for (int i =0; i<firstNames.length; i++) {
				
				System.out.println(firstNames[i].charAt(0)+". "+lastNames[i]+": "+totals[i]);
			}
	
	
	
	}
}
