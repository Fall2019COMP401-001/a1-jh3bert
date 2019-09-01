package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// initializing variables and arrays
		
		int storeItems = scan.nextInt();
		
		String[] itemNames = new String[storeItems];
		double[] itemCosts = new double[storeItems];
	
		// assigning the store item names and their prices to parallel arrays
		for (int i =0; i<storeItems; i++) {
			itemNames[i]= scan.next();
			itemCosts[i]= scan.nextDouble();
		}
		// initializing more variables and arrays
		int customers = scan.nextInt();
		
		String[] firstNames = new String[customers];
		String[] lastNames = new String[customers];
		double [] totals = new double[customers];
		double cost =0;
		
		// assigning customer names to two arrays
		for (int i=0; i<customers; i++) {
			firstNames[i] = scan.next();
			lastNames[i]= scan.next();
			
			int itemsBought = scan.nextInt();
		// allowing for input of item quantity and name
			for(int y=0; y<itemsBought; y++) {
				int quantity = scan.nextInt();
				String itemName= scan.next();
			// searching for inputted item name in array	
				for(int x=0; x<itemNames.length; x++) {
					// multiplies quantity times cost array at index that the item name was found
					if (itemNames[x].equals(itemName)) {
						cost+= quantity*itemCosts[x];
					}
				}
				
			}
			// assigning cost variable to total array of current index, reset cost
			totals[i]=cost;
			cost=0;
			
		}
	// finding the most money spent	
		double max = totals[0];
		int indexBiggest = 0;
		
		for (int i =1; i<totals.length; i++) {
			if(totals[i]>max) {
				max =totals[i];
				indexBiggest = i;
			}
		}
	// finding the least money spent	
		double min = totals[0];
		int indexSmallest = 0;
		
		for (int i = 1; i<totals.length; i++) {
			if(totals[i]<min) {
				min = totals[i];
				indexSmallest = i;
			}
		}
	// calculating total amount spent by all customers	
		double total =0;
		
		for (int i =0; i<totals.length; i++) {
			total+=totals[i];
		}
		double average = total/customers;
	// printing results	
		System.out.print("Biggest: "+firstNames[indexBiggest]+" "+lastNames[indexBiggest]+" (");
		System.out.printf("%.2f",max );
		System.out.println(")");
		
		System.out.print("Smallest: "+firstNames[indexSmallest]+" "+lastNames[indexSmallest]+" (");
		System.out.printf("%.2f",min);
		System.out.println(")");
		
		System.out.print("Average: "); 
		System.out.printf("%.2f", average);
		System.out.print("\n");
	}
}
