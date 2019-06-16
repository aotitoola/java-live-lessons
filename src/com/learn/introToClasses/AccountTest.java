package com.learn.introToClasses;

// Creating and manipulating an Account Object

import java.util.Scanner;

public class AccountTest {

   public static void main(String[] args) {
      // create s Scanner object to obtain input from the command window
      Scanner input = new Scanner(System.in);

      // create an Account object and assign it to myAccount
      Account myAccount = new Account( "John Legend", 122.46);

      // display initial value of name (null)
      System.out.printf("Initial name is: %s%n%n", myAccount.getName());

      // prompt for and read name
      System.out.println("Please enter the name: ");
      String theName = input.nextLine(); // read a line of text
      myAccount.setName(theName);
      System.out.println(); // outputs a blank line

      // display the name stored
      System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());

      // create two Account objects
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53);

      // display initial value of name and initial balance for each Account
      System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

      // create a Scanner to obtain input from the command window
      input = new Scanner(System.in);

      System.out.printf("%nEnter deposit amount for account1: "); //prompt
      double depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
      account1.deposit(depositAmount); // add to account1's balance

      // display balances
      System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

      System.out.printf("%nEnter deposit amount for account2: "); //prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nAdding %.2f to account2 balance%n%n", depositAmount);
      account2.deposit(depositAmount); // add to account2's balance

      // display balances
      System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
   }
}// end class AccountTest
