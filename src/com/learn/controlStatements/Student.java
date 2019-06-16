package com.learn.controlStatements;

public class Student {
   private String name;
   private double average;

   // constructor initializes instance variables
   public Student(String name, double average){
      this.name = name;

      // validate that average is > 0.0 and < 100.0; otherwise,
      // keep instance variable average's default value (0.0)
      if (average > 0.0)
         if (average <= 100.0)
            this.average = average; // assign to instance variable
   }

   // sets the Student's name

   public void setName(String name) {
      this.name = name;
   }
}
