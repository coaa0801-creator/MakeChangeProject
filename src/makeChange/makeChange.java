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
		
	public static double addMore() {
		Scanner kb = new Scanner(System.in);
		System.out.println("How much more would you like to add to your payment?");
		double newPay = kb.nextDouble();
		return newPay;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double amount = Total();
		double pay = Payment();
		while (amount >= pay) {
		if (amount == pay) {
			System.out.print("Thank you for providing exact change! Have a nice day!");
		}
		else if (amount > pay) {
			System.out.println("Well that's not enough, please provide at least " + (amount - pay)  + " more\n");
			double newPay = addMore();
			pay = pay + newPay;
		}
		else {
			System.out.println("Thank you for your payment. Let me grab your change... \n\n");
		}

		}
	}

}
