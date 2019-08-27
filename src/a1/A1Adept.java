package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int storeItems = scan.nextInt();
		
		String[] itemNames = new String[storeItems];
		double[] itemCosts = new double[storeItems];
		
		for (int i =0; i<storeItems; i++) {
			itemNames[i]= scan.next();
			itemCosts[i]= scan.nextDouble();
		}
		
		int customers = scan.nextInt();
		
		String[] firstNames = new String[customers];
		String[] lastNames = new String[customers];
		double [] totals = new double[customers];
		double cost =0;
		
		for (int i=0; i<customers; i++) {
			firstNames[i] = scan.next();
			lastNames[i]= scan.next();
			
			int itemsBought = scan.nextInt();
			
			for(int y=0; y<itemsBought; y++) {
				int quantity = scan.nextInt();
				String itemName= scan.next();
				
				for(int x=0; x<itemNames.length; x++) {
					if (itemNames[x].equals(itemName)) {
						cost+= quantity*itemCosts[x];
					}
				}
				
			}
			totals[i]=cost;
			cost=0;
			
		}
		
		double max = totals[0];
		int indexBiggest = 0;
		
		for (int i =1; i<totals.length; i++) {
			if(totals[i]>max) {
				max =totals[i];
				indexBiggest = i;
			}
		}
		double min = totals[0];
		int indexSmallest = 0;
		
		for (int i = 1; i<totals.length; i++) {
			if(totals[i]<min) {
				min = totals[i];
				indexSmallest = i;
			}
		}
		double total =0;
		
		for (int i =0; i<totals.length; i++) {
			total+=totals[i];
		}
		double average = total/customers;
		
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
