package makeChange;

import java.text.DecimalFormat;
import java.util.Scanner;

public class makeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		boolean leave = true;
		System.out.println("Thank you for coming in!!");
		while(leave) {
			System.out.print("\nWould you like to make a PURCHASE or LEAVE?   ");
			String hereOrGo = kb.nextLine();
		switch (hereOrGo) {
		case "LEAVE":
		case "leave":
		case "Leave": goodBye(); leave = false;
		break;
		case "PURCHASE":
		case "Purchase":
		case "purchase":
			
		DecimalFormat rndDiff = new DecimalFormat("#.00");
		double amount = Total();
		double pay = Payment();
		boolean payBad = true;
		while (payBad) {
			if (pay > amount) {
				System.out.println("\nThank you for your payment. Let me grab your change... \n");
				payBad = false;
				GetChange(amount, pay);
			}
			else if (amount == pay) {
				System.out.print("\nThank you for providing exact change! Have a nice day!\n");
				break;
			} else if (amount > pay) {
//				rndDiff = new DecimalFormat("#.00");
				System.out.print("\nWell that's not enough... \n\nPlease provide at least $"
						+ (rndDiff.format(amount - pay)) + " more\n");
				double newPay = addMore();
				pay = pay + newPay;
			}
		}

		thankYou();
		break;
		default: 
			System.out.println("I'm sorry, I can't help you with that...");
		}
		}
		kb.close();
	}
	

	public static Double Currency(double change) {
		int quantity = 0;
//		System.out.println(change);//check change value
		if (change >= 20) {
			if ((change % 20) == 0) {
				do {
					change = change - 20;
					quantity++;
				} while ((change - 20) >= 0);
			}

			while ((change - 20 > 0)) {
				change = change - 20;
				quantity++;
			}

			if (quantity == 1) {
				System.out.println(quantity + " - $20 bill ");
			} else {
				System.out.println(quantity + " - $20 bills ");
			}
		}

		if (change >= 10) {
			quantity = 0;
			if ((change % 10) == 0) {
				do {
					change = change - 10;
					quantity++;
				} while ((change - 10) >= 0);
			}
			while ((change - 10) > 0) {
				change = change % 20;
				change = change - 10;
				quantity++;
			}
			if (quantity == 1) {
				System.out.println(quantity + " - $10 bill ");
			} else {
				System.out.println(quantity + " - $10 bills ");
			}
		}
		if (change >= 5) {
			quantity = 0;
			if ((change % 5) == 0) {
				do {
					change = change - 5;
					quantity++;
				} while ((change - 5) >= 0);
			}
			while ((change - 5) > 0) {
				change = change % 10;
				change = change - 5;
				quantity++;
			}
			if (quantity == 1) {
				System.out.println(quantity + " - $5 bill ");
			} else {
				System.out.println(quantity + " - $5 bills ");
			}
		}
		if (change >= 1) {
			quantity = 0;
			if ((change % 1) == 0) {
				do {
					change = change - 1;
					quantity++;
				} while ((change - 1) >= 0);
			}
			while ((change - 1) > 0) {
				change = change % 5;
				change = change - 1;
				quantity++;
			}
			if (quantity == 1) {
				System.out.println(quantity + " - $1 bill ");
			} else {
				System.out.println(quantity + " - $1 bills ");
			}
		}
		if (change >= .25) {
			quantity = 0;
			if ((change % .25) == 0) {
				do {
					change = change - .25;
					quantity++;
				} while ((change - .25) >= 0);
			}
			while ((change - 0.25) > 0) {
				change = change % 1;
				change = change - 0.25;
				quantity++;
			}
			if (quantity == 1) {
				System.out.println(quantity + " - Quarter ");
			} else {
				System.out.println(quantity + " - Quarters ");
			}
		}
		if (change >= .10) {
			quantity = 0;
			if ((change % .10) == 0) {
				do {
					change = change - .10;
					quantity++;
				} while ((change - 0.10) >= 0);
			}
			while ((change - .099) > 0) {
				change = change % .25;
				change = change - .10;
				quantity++;
			}
			if (quantity == 1) {
				System.out.println(quantity + " - Dime ");
			} else {
				System.out.println(quantity + " - Dimes ");
			}
		}
		if (change >= .049) {
			quantity = 0;
			if ((change % .05) == 0) {
				do {
					change = change - .05;
					quantity++;
				} while ((change - .05) > 0);
			}
			while ((change - .049) > 0) {
				change = change % .10;
				change = change - .05;
				quantity++;
			}
			if (quantity == 1) {
				System.out.println(quantity + " - Nickel ");
			} else {
				System.out.println(quantity + " - Nickels ");
			}
		}
		if (change >= .009) {
			quantity = 0;

			if ((change % .01) == 0) {
				do {
					change = change - .01;
					quantity++;
				} while ((change - .01) >= 0);
			}
			while ((change - .009) >= 0) {
				change = change % .05;
				change = change - .01;
				quantity++;
			}
			if (quantity == 1) {
				System.out.println(quantity + " - Penny ");
			} else {
				System.out.println(quantity + " - Pennies ");
			}
		}

		return change;

	}

	public static Double GetChange(double amount, double pay) {
		DecimalFormat rndDiff = new DecimalFormat("#.00");
		double changeNeeded = pay - amount;
		System.out.println("Looks like that will be $" + (rndDiff.format(changeNeeded)) + " coming back to you\n");
//		System.out.println(changeNeeded); check Change needed transfer double number
		Currency(changeNeeded);

		return changeNeeded;
	}

	public static double Total() {
		Scanner kb = new Scanner(System.in);
		System.out.print("\nWhat is the total on the items you have there?   ");
		double total = kb.nextDouble();
		if (total < 0) {
			System.out.print(
					"\nI'm sorry, this isn't the counter for returns. \n\nIf you'd like to purchase something, could you please give me the total?   ");
			total = kb.nextDouble();
		}
//		System.out.println(total);//check total value
		return total;
	}

	public static double Payment() {
		Scanner kb = new Scanner(System.in);
		System.out.print("\nWhoa! What amount were you thinking of paying?   ");
		double payment = kb.nextDouble();
		if (payment < 0) {
			System.out.print(
					"\nI'm sorry, I can't pay you to take it... No, it makes no difference how crappy you think the quality is. \n\nYou must provide at least the total amount. What amount would you be paying?   ");
			payment = kb.nextDouble();
		}
//		System.out.println(payment);//Check payment value
		return payment;
	}

	public static double addMore() {
		Scanner kb = new Scanner(System.in);
		System.out.print("\nHow much more would you like to add to your payment?   ");
		double newPay = kb.nextDouble();
//		System.out.println(newPay);//check for newPay Value
		return newPay;
	}

	public static void thankYou() {
		System.out.println("\n<----------------->" + "\n|                 |" + "\n|   Thank you!!   |"
				+ "\n|                 |" + "\n<----------------->");
	}
	public static void goodBye() {
		System.out.println("\n<----------------->" + "\n|                 |" + "\n|    Goodbye!!    |"
				+ "\n|                 |" + "\n<----------------->");
	}
}
