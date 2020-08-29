package makeChange;

import java.text.DecimalFormat;
import java.util.Scanner;

public class makeChange {


	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double amount = Total();
		double pay = Payment();
		while (amount >= pay) {
			if (amount == pay) {
				System.out.print("Thank you for providing exact change! Have a nice day!");
			} else if (amount > pay) {
				DecimalFormat rndDiff = new DecimalFormat("#.00");
				System.out.print("Well that's not enough, please provide at least $" + (rndDiff.format(amount - pay))
						+ " more\n");
				double newPay = addMore();
				pay = pay + newPay;
			}
		}
		System.out.println("Thank you for your payment. Let me grab your change... \n");
		System.out.println(GetChange(amount, pay));
kb.close();
	}
	public static String Currency(double change) {
		int quantity = 0;
		if (change > 20) {
			do {
				change = change - 20;
				quantity++;
			} while ((change - 20) > 0);
			if (quantity == 1) {
				System.out.println(quantity + " - $20 bill ");
			} else {
				System.out.println(quantity + " - $20 bills ");
			}
		}
		
		if (change > 10) {
			do {
				change = change % 20;
				quantity = 0;
				change = change - 10;
				quantity++;
			} while ((change - 10) > 0);
			if (quantity == 1) {
				System.out.println(quantity + " - $10 bill ");
			} else {
				System.out.println(quantity + " - $10 bills ");
			}
		}
		if (change > 5) {
			do {
				change = change % 10;
				quantity = 0;
				change = change - 5;
				quantity++;
			} while ((change - 5) > 0);
			if (quantity == 1) {
				System.out.println(quantity + " - $5 bill ");
			} else {
				System.out.println(quantity + " - $5 bills ");
			}
		}
		if (change > 1) {
			do {
				change = change % 5;
				quantity = 0;
				change = change - 1;
				quantity++;
			} while ((change - 1) > 0);
			if (quantity == 1) {
				System.out.println(quantity + " - $1 bill ");
			} else {
				System.out.println(quantity + " - $1 bills ");
			}
		}
		if (change > 0.25) {
			do {
				change = change % 1;
				quantity = 0;
				change = change - 0.25;
				quantity++;
			} while ((change - 0.25) > 0);
			if (quantity == 1) {
				System.out.println(quantity + " - Quarter ");
			} else {
				System.out.println(quantity + " - Quarters ");
			}
		}
		if (change > 0.10) {
			do {
				change = change % 0.25;
				quantity = 0;
				change = change - 0.10;
				quantity++;
			} while ((change - 0.10) > 0);
			if (quantity == 1) {
				System.out.println(quantity + " - Dime ");
			} else {
				System.out.println(quantity + " - Dimes ");
			}
		}
		if (change > 0.05) {
			do {
				change = change % 0.10;
				quantity = 0;
				change = change - 0.05;
				quantity++;
			} while ((change - 0.05) > 0);
			if (quantity == 1) {
				System.out.println(quantity + " - Nickel ");
			} else {
				System.out.println(quantity + " - Nickels ");
			}
		}
		if (change > 0.01) {
			do {
				change = change % 0.05;
				quantity = 0;
				change = change - 0.01;
				quantity++;
			} while ((change - 0.01) > 0);
			if (quantity == 1) {
				System.out.println(quantity + " - Penny ");
			} else {
				System.out.println(quantity + " - Pennies ");
			}
		}
		
		
		return "";
		
	}
	
	public static String GetChange(double amount, double pay) {
		DecimalFormat rndDiff = new DecimalFormat("#.00");
		double changeNeeded = pay - amount;
		System.out.println("Looks like that will be $" + (rndDiff.format(changeNeeded)) + " coming back to you\n\n");
		Currency(changeNeeded);
		
		return "\n\nThank You!!";
	}
	
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
}
