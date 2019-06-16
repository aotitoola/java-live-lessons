package com.learn.polymorphism;

// private superclass members cannot be accessed in a subclass
// BasePlusCommissionEmployee inherits protected instance
// variables from CommissionEmployee

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary)
    {
        // explicit call to superclass CommissionEmployee  constructor, because there is no default/ no-argument constructor
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        // if baseSalary is invalid throw exception
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    // set base salary
    public void setBaseSalary(Double baseSalary){
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // return base salary
    public double getBaseSalary() {
        return this.baseSalary;
    }

    // calculate earnings
    @Override
    public double earnings()
    {
        // not allowed: commissionRate and grossSales private in superclass
        return baseSalary + super.earnings();
    }

    // return String representation of BasePlusCommissionEmployee
    @Override
    public  String toString()
    {
        // not allowed: attempts to access private superclass members
        return String.format(
                "%s %s%n%s: %.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary()
        );

    } //end class BasePlusCommissionEmployee
}
