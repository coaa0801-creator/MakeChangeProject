## ![Logo](http://skilldistillery.com/downloads/sd_logo.jpg) Aaron Cottrell
## Make Change Project

## Overview
The program is designed to take user input on a cash transaction and return the remainder with denominations including $100, $50, $20, $10, $5, $1, Quarters, Dimes, Nickels and Pennies.

## Step by Step (Short version)
1. Choose Purchase or Leave
2. Enter Purchase amount
3. Claim Tax or No Tax
4. Enter Payment amount

    3a. Make adjustments to Payment amount
5. Receive Change amount
6. Choose Purchase or Leave


## Walkthrough (Long Version)
From the user side, the program is very simple. You are prompted whether you'd like to make a purchase or leave. You are prompted for the total of what you intend to purchase. Once that valid value is given, you must provide whether tax was included or not. I built the program so the City and Tax value are easily changed in a variable. If tax was not included in your original total, it will be added in and your new total is returned. The program will then ask you how you intend to pay. Both the total and payment numbers must be positive doubles or 2 place decimal numbers. In the event you attempt to enter another type number you will be met with a friendly error message explaining why you can't enter the amount you chose. If you chose a negative number, you will be prompted for a new number until you provide a workable value. If the value contains too many places beyond the decimal point, the program will round this value to the hundreth's place.

We then compare the two values given to determine if the payment is sufficient. If payment is exact, the program thanks you and starts the transaction process over and you are given the option to leave. If you come up short, you're going to need to come up with more money and are prompted to do so until you meet or exceed the bill total. If you exceed the bill total the program then moves to calculate your change. So quite a few while loops and a couple switches but the user input part of the experience ends as the rest is back end work.

But this is where things get spicy since you want the bills and coins counted out casino style. Double initialized numbers hold a lot of decimal value so there are issues with boolean evaluations of whole numbers to truncated numbers. I made some slight adjustments to some of the smaller denominations to account for the rounding issues.Do-while and While loops. If Statements with nested If-else statements for each denomination differing the sysout for if there is just 1 of the denomination or multiple. A counter is installed and used as the print number to show the user how many times the process ran aka how many times that denomination went into the amount of change they are owed.

The program pops out the quantity of each denomination and the total amount being given back for verification. The program then thanks you for your purchase and then prompts if you would like to make another purchase or leave once again. Upon choosing leave you are given a goodbye message and the program terminates.

## Struggles
The guts of this program is the Currency method. I spent more time figuring out how to get the boolean statements correct just to get one denomination to recognize and print appropriate change value. Everything else was really just fluff material and glitter but I had a good time making and calling new methods. I had a tough time with the penny rounding and when the guest had exactly the denomination in change coming back. I tried multiple different rounding techniques but couldn't get the Pennies to fall in line. So I started doing sysout prints I later commented out, to test the values along the route to the Currency method and noticed the double value would often come out as xx.9999999998 or something along those lines. Because the denominations are so small I moved the boolean for Nickels and Pennies down a place to include some of the more finite rounding errors and got this thing playing along. I still can't figure out how to get the equations themselves to round. 

Tried to call each Currency as it's own method but couldn't get that to work like I wanted. I probably could have figured it out but I spent plenty of time on the project and I'm fairly happy with the result.

## Lessons Learned
I need to get better at adding comment in for the next person and for myself looking back as I go along so they make more sense for my line of thinking. Toss in test markers along the way so you can see if your equation is headed down the right path. I used Google to help me find rounding options at least for the user print lines.

Take breaks.  I got locked in and before I knew it a couple hours had passed.

## Course Material Used
1. While Loops
2. if, else if, else Statements
3. Variable Initialization & Declaration
4. Scanner (user input)
5. Switch Statements & Fall Through
6. Declaring methods
7. Pass Through Variables
8. sysout print and println
9. Concatenation
10. Returns

## Programs Used
1. Eclipse
2. Atom
3. Git
4. GitHub
5. java
6. Terminal
