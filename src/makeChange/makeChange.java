package makeChange;

import java.util.Scanner;

public class makeChange {
	
	public static double Total() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Thank you for coming in!\n\nWhat is the total on the items you have there?  ");
		double total = kb.nextDouble();
		return total;
	}
	public static double Payment() {
		Scanner kb = new Scanner(System.in);
	System.out.print("Whoa! Well what amount were you thinking of paying?  ");
	double payment = kb.nextDouble();
	return payment;
	}
		
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double amount = Total();
		double pay = Payment();
		if (amount > pay) {
			System.out.println("Well that's not enough, please provide at least " + (amount - pay)  + " more");
		}
	}

}
