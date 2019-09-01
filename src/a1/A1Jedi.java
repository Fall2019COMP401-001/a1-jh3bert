package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// initializing arrays and variables
		
		int storeItems = scan.nextInt();
		
		int count =0;	// used in conjunction with repeat array to calculate customer count
		
		String[] itemNames = new String[storeItems];
		double[] itemCosts = new double[storeItems];	
		int[] itemQuantity = new int[storeItems];
		int[] customerCount = new int[storeItems];
		int[] repeats = new int[storeItems];		// should have used boolean array to test if repeated
		
	// assigning store items with costs to array
		for (int i =0; i<storeItems; i++) {
			itemNames[i]= scan.next();
			itemCosts[i]= scan.nextDouble();
		}
		
		int customers = scan.nextInt();
		
		String[] firstNames = new String[customers];
		String[] lastNames = new String[customers];
	
		// assigning customer names to array	
		for (int i=0; i<customers; i++) {
			firstNames[i] = scan.next();
			lastNames[i]= scan.next();
			
			int itemsBought = scan.nextInt();
		  
			// for each item allow for quantity and name input
			for(int y=0; y<itemsBought; y++) {
				int quantity = scan.nextInt();
				String itemName= scan.next();
			
				// searching for item in store item array				
				for (int x =0; x < itemNames.length; x++) {					
			
					// if found add the quantity variable to the quantity array at the index value that the item name was equal to the store item array	
					if (itemNames[x].equalsIgnoreCase(itemName)) {
						itemQuantity[x]+=quantity;
					
						// will prove true for the first time each item is bought from the customer	
						if (repeats[x]==count) {
						customerCount[x]++;
						repeats[x]++;		/* increments repeat index so if this index is 
											reached again for the same customer the if statement
											 will prove false and customerCount won't increment */
						}
					}
				}
			}
			/*increments all indices of unbought items by the 
			last customer so the array equals the count at the start of each customer*/
			
			for (int x =0; x<itemNames.length; x++) {
				if (repeats[x]==count)
					repeats[x]++;		
			}
			count++;
		}
	// printing results
		for (int i=0; i < itemNames.length; i++) {
			if (customerCount[i]==0)
				System.out.println("No customers bought "+itemNames[i]);
			else
				System.out.println(customerCount[i]+" customers bought "+itemQuantity[i]+" "+itemNames[i]);
		}
	}
}