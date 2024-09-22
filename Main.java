/*
-Name: Aarav Goyal
-Date: 9.15.2023
-Project: Piggy Bank Problem
*/
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
//Declares the variables
String Name;
int pennies, nickels, dimes, quarters, weeks;
double penniesvalue, nickelsvalue, dimesvalue, quartersvalue, totalmoney, avgweek, avgyear;
//Asks all the questions.
System.out.print("What is your name? ");
Name = in.nextLine();
System.out.print("How many pennies you have? ");
pennies = in.nextInt();
System.out.print("How many nickels you have? ");
nickels = in.nextInt();
System.out.print("How many dimes you have? ");
dimes = in.nextInt();
System.out.print("How many quarters you have? ");
quarters = in.nextInt();
System.out.print("How many weeks have you been saving? ");
weeks = in.nextInt();
//This calculates the total value of the coins and weeks.
penniesvalue = pennies * 0.01;
nickelsvalue = nickels * 0.05;
dimesvalue = dimes * 0.10;
quartersvalue = quarters * 0.025;
totalmoney = penniesvalue + nickelsvalue + dimesvalue + quartersvalue;
avgweek = totalmoney / weeks;
avgyear = avgweek * 52.1429;
//This prints everything.
System.out.printf("%n%-15s %-16s %-11s %n", "Coin Type", "# of Coins", "Value");
System.out.printf("%n%-15s %-16d $%-11.2f ", "Pennies", pennies, penniesvalue);
System.out.printf("%n%-15s %-16d $%-11.2f ", "Nickels", nickels, nickelsvalue);
System.out.printf("%n%-15s %-16d $%-11.2f ", "Dimes", dimes, dimesvalue);
System.out.printf("%n%-15s %-16d $%-11.2f %n", "Quarters", quarters, quartersvalue);
System.out.printf("%nYour grand total is: $%.2f%n", totalmoney);
System.out.printf("The average you have been saving per week is: $%.2f%n", avgweek);
System.out.printf("%s, at this rate you can save $%.2f in one year.%n", Name, avgyear);
  }
}