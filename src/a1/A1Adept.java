package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		// first value is always numbers of items in store
		
		String biggest;
		String smallest;
		double big = 0;
		double small = 0;
		/* these are to store the names and amounts spent of the 
		top and bottom shoppers */
		
		String[] items = new String[count];
		double[] prices = new double[count];
		// these establish arrays for the items and prices
		
		for (int i = 0; i < count; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}		
		// this fills both items and prices arrays with their values
		
		int customers = scan.nextInt();
		// this establishes the number of customers
		
		String[] shoppers = new String[customers];
		double[] totals = new double[customers];
		/* this establishes arrays for the shoppers and their totals
		corresponding to their customer index */
		
		for (int i = 0; i < customers; i++) {
			totals[i] = 0;
		}
		// this sets the default totals to 0 for each customer
		
		for (int i = 0; i < customers; i++) {
			// this cycles through each customer
			
			shoppers[i] = scan.next() + " " + scan.next();
			/* this fills the shoppers array with the first and last 
			names of each customer */
			
			int num = scan.nextInt();
			/* this establishes the number of items bought by each 
			customer */
			
			for (int u = 0; u < num; u++) {
				// this cycles through each item purchased
				int a = scan.nextInt();
				// this holds the number of each item purchased
				String item = scan.next();
				// this holds the name of each item purchased
				double b = 0;
				// this establishes a variable to hold the item price
				
				for (int v = 0; v < count; v++) {
					// this cycles through the known items in the store
					
					if (item.equals(items[v])) {
						// if the item bought matches the cycled store item
						b = prices[v];
						/* set the price of the store item equal to the 
						bought item price */
					}
				}
				totals[i] += a * b;
				/* this adds the amount spent on each item to the customer's
				total */
			}
		}
		small = totals[0];
		smallest = shoppers[0];
		/* this sets an initial maximum for the smallest and who spent the 
		least */
		
		big = totals[0];
		biggest = shoppers[0];
		
		double totalssum = 0;
		// this sets a sum for the totals
		
		for (int i = 0; i < customers; i++) {
			// this cycles through each customer
			if (totals[i] > big) {
				big = totals[i];
				biggest = shoppers[i];
				/* this sets the name of the biggest shopper and the amount 
				they spent */
				
			}else if (totals[i] < small) {
				small = totals[i];
				smallest = shoppers[i];
				/* this sets the name of the smallest shopper and the amount 
				they spent */
			}
			totalssum += totals[i];
		}
		
		double average = totalssum / customers;
				
		System.out.println("Biggest: " + biggest + " (" + String.format("%.2f", big) + ")");
		// this prints the first expected line
		System.out.println("Smallest: " + smallest + " (" + String.format("%.2f", small) + ")");
		// this prints the second expected line
		System.out.println("Average: " + String.format("%.2f", average));
		// this prints the third expected line
	
	}
}
