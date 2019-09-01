package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int customers = scan.nextInt();
		for (int i = 0; i < customers; i++) {
			String first = scan.next();
			String last = scan.next();
			double total = 0.00;
			int items = scan.nextInt();
			for (int u = 0; u < items; u++) {
				double a = scan.nextDouble();
				String food = scan.next();
				double b = scan.nextDouble();
				total += a * b;
			}
			String totalS = String.format("%.2f", total);
			System.out.println(first.charAt(0) + ". " + last + ": " + totalS);
		}
		scan.close();
		
	}
}
