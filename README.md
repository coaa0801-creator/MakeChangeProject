## ![Logo](http://skilldistillery.com/downloads/sd_logo.jpg) Aaron Cottrell
## Make Change Homework
From the user side the the program is very simple. You are prompted whether you'd like to make a purchase or leave. You are prompted for the total of what you intend to purchase. The program will then ask you how you intend to pay. Both of these numbers must be positive doubles or 2 place decimal numbers. In the event you attempt to enter another type number you will be met with a friendly error message explaining why you can't enter the amount you chose. If you chose a negative number, you will be prompted for a new number until you provide a workable value. If the value contains too many places beyond the decimal point, the program will round this value.

From there the program will inquire as to how the total or bill will be paid. The same rules apply to the payment. This number must be positive and a 2 place decimal number. If other values are input, the program acts similarly to how it did in the first prompt. Negative values will be prompted for a new value and more specific values will be rounded to the hundreth's place.

The program then compares the two values given to determine if the payment is sufficient. If payment is exact, the program thanks you and starts the transaction process over and you are given the option to leave. If you come up short, you're going to need to come up with more money and are prompted to do so until you meet or exceed the bill total. If you exceed the bill total the program then moves to calculate your change.

This is where things get spicy since you want the bills and coins counted out casino style. Double initialized numbers hold a lot of decimal value so there are issues with boolean evaluations of whole numbers to truncated numbers. I made some slight adjustments to some of the smaller denominations to account for the rounding issues.

The program pops out the quantity of each denomination and the total amount being given back for verification. The program then thanks you for your purchase and then prompts if you would like to make another purchase or leave once again. Upon choosing leave you are given a goodbye message and the program terminates.

## Step by Step (Short version)
1. Choose Purchase or Leave
2. Enter Purchase amount
3. Enter Payment amount

    3a.Make adjustments to Payment amount
4. Receive Change amount
5. Choose Purchase or Leave
