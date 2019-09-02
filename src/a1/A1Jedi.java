package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		// first value is always numbers of items in store
		
		String[] items = new String[count];
		double[] prices = new double[count];
		// these establish arrays for the items and prices
		
		for (int i = 0; i < count; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}		
		// this fills both items and prices arrays with their values
		
		int[] custBought = new int[count];
		int[] itemBought = new int[count];
		
		for (int i = 0; i < count; i++) {
			custBought[i] = 0;
			itemBought[i] = 0;
		}
		
		int customers = scan.nextInt();
		// this establishes the number of customers
		
		for (int i = 0; i < customers; i++) {
			// this cycles through each customer
			
			boolean[] boughtYet = new boolean[count];
			
			for (int u = 0; u < count; u++) {
				boughtYet[u] = false;
			}
			
			String name = scan.next() + scan.next();
			
			int num = scan.nextInt();
			/* this establishes the number of items bought by each 
			customer */
			
			for (int u = 0; u < num; u++) {
				// this cycles through each item purchased
				int a = scan.nextInt();
				// this holds the number of each item purchased
				String item = scan.next();
				// this holds the name of each item purchased
				
				for (int v = 0; v < count; v++) {
					// this cycles through the known items in the store
					
					if (item.equals(items[v])) {
						// if the item bought matches the cycled store item
						itemBought[v] += a;
						if (boughtYet[v] == false) {
							custBought[v] ++;
							boughtYet[v] = true;
						}
						/* increase the number of customers that bought this
						 item by one and add the number bought to the item
						 bought total */
					}
				}
				// items in the store loop end
			}
			// item purchased loop end
		}
		// customer loop end
		for (int i = 0; i < count; i++) {
			if (custBought[i] != 0) {
				System.out.println(custBought[i] + " customers bought " + itemBought[i] + " " + items[i]);
			} else {
				System.out.println("No customers bought " + items[i]);
			}
		}
	}
}
