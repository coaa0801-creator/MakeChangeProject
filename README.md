## ![Logo](http://skilldistillery.com/downloads/sd_logo.jpg) Aaron Cottrell
## Make Change Project
## Step by Step (Short version)
1. Choose Purchase or Leave
2. Enter Purchase amount
3. Enter Payment amount

    3a. Make adjustments to Payment amount
4. Receive Change amount
5. Choose Purchase or Leave

## Overview
The program is designed to take user input on a cash transaction and return the remainder with denominations including $100, $50, $20, $10, $5, $1, Quarters, Dimes, Nickels and Pennies.

##Walkthrough (Long Version)
From the user side the the program is very simple. You are prompted whether you'd like to make a purchase or leave. You are prompted for the total of what you intend to purchase. The program will then ask you how you intend to pay. Both of these numbers must be positive doubles or 2 place decimal numbers. In the event you attempt to enter another type number you will be met with a friendly error message explaining why you can't enter the amount you chose. If you chose a negative number, you will be prompted for a new number until you provide a workable value. If the value contains too many places beyond the decimal point, the program will round this value.

From there the program will inquire as to how the total or bill will be paid. The same rules apply to the payment. This number must be positive and a 2 place decimal number. If other values are input, the program acts similarly to how it did in the first prompt. Negative values will be prompted for a new value and more specific values will be rounded to the hundreth's place.

The program then compares the two values given to determine if the payment is sufficient. If payment is exact, the program thanks you and starts the transaction process over and you are given the option to leave. If you come up short, you're going to need to come up with more money and are prompted to do so until you meet or exceed the bill total. If you exceed the bill total the program then moves to calculate your change.

This is where things get spicy since you want the bills and coins counted out casino style. Double initialized numbers hold a lot of decimal value so there are issues with boolean evaluations of whole numbers to truncated numbers. I made some slight adjustments to some of the smaller denominations to account for the rounding issues.

The program pops out the quantity of each denomination and the total amount being given back for verification. The program then thanks you for your purchase and then prompts if you would like to make another purchase or leave once again. Upon choosing leave you are given a goodbye message and the program terminates.

##Programs Used
1. Eclipse
2. Atom
3. Git
4. GitHub
5. java
6. Terminal

##Struggles
The guts of this program is the Currency method. Everything else was really just fluff material but I had a good time making and calling new methods. I had a tough time with the penny rounding and when the guest had exactly the denomination in change coming back. I tried multiple different rounding techniques but couldn't get the Pennies to fall in line. So I started doing sysout prints in testing to check for values along the route to the Currency method and noticed the double value would often come out as xx.9999999998 or something along those lines. Because the denominations are so small I moved the boolean for Nickels and Pennies down a place to include some of the more finite rounding errors and got this thing playing along.

Tried to call each Currency as it's own method but couldn't get that to work like I wanted. I probably could have figured it out but I spent plenty of time on the project and I'm fairly happy with the result.

Added some comments in afterword. I need to get better at adding these in for the next person and for myself looking back.
