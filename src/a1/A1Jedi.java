package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int storeItems = scan.nextInt();
		
		String[] itemNames = new String[storeItems];
		double[] itemCosts = new double[storeItems];
		
		int[] itemQuantity = new int[storeItems];
		int[] customerCount = new int[storeItems];
		int[] repeats = new int[storeItems];
		
		for (int i =0; i<storeItems; i++) {
			itemNames[i]= scan.next();
			itemCosts[i]= scan.nextDouble();
		}
		
		int customers = scan.nextInt();
		
		String[] firstNames = new String[customers];
		String[] lastNames = new String[customers];
		
		for (int i=0; i<customers; i++) {
			firstNames[i] = scan.next();
			lastNames[i]= scan.next();
			
			int count = 0;
			
			int itemsBought = scan.nextInt();
			
			for(int y=0; y<itemsBought; y++) {
				int quantity = scan.nextInt();
				String itemName= scan.next();
				
					
				for (int x =0; x < itemNames.length; x++) {
					
					if (itemNames[x].equalsIgnoreCase(itemName)) {
						itemQuantity[x]+=quantity;
						if (repeats[x]==count) {
						customerCount[x]+=1;
						repeats[x]++;
						}
					}
				}
				for (int x =0; x<itemNames.length; x++) {
					if (repeats[x]==count)
						repeats[x]++;
				}
				
			}
		count++;
		}

		for (int i=0; i < itemNames.length; i++) {
			if (customerCount[i]==0)
				System.out.println("No customers bought "+itemNames[i]);
			else
				System.out.println(customerCount[i]+" customers bought "+itemQuantity[i]+" "+itemNames[i]);
		}
	}
}