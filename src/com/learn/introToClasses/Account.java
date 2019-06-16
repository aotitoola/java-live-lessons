package com.learn.introToClasses;

// Account class that contains a name instance variable
// and methods to set and get its value

public class Account {

   private String name; // instance variable
   private double balance; // instance variable

   // Account constructor that receives two parameters
   public Account(String name, double balance) // constructor name is class name
   {
      this.name = name; // assign name to instance variable name

      // validate that the balance is greater than 0.0; if it's not,
      // instance variable balance keeps its default initial value of 0.0

      if (balance > 0.0)
         this.balance = balance;
   }

   // method that deposits (adds) only a valid amount to the balance
   public void deposit(double depositAmount)
   {
      if (depositAmount > 0.0) // if the depositAmount is valid
         balance = balance + depositAmount; // add it to the balance
   }

   //  method to set the name in the object
   public void setName(String name){
      this.name = name; // store the name
   }

   // method to retrieve the name of the object
   public String getName() {
      return this.name; // return value of name to caller
   }

   // method returns the account balance
   public double getBalance()
   {
      return balance;
   }


}
