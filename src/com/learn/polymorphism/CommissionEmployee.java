package com.learn.polymorphism;

public class CommissionEmployee extends Employee{

    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                              double commissionRate)
    {
        super(firstName, lastName, socialSecurityNumber);

        // implicit call to object's default constructor occurs here
        if (grossSales < 0.0)
            throw new IllegalArgumentException
                    ("Gross sales must be >= 0.0");

        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException
                    ("Commission rate must be > 0.0 and < 1.0");

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end constructor

    // set gross sales amount
    public void setGrossSales(double grossSales){
        if (grossSales < 0.0)
            throw new IllegalArgumentException
                    ("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    // return gross sales amount
    public double getGrossSales(){
        return this.grossSales;
    }

    // set commission rate
    public void setCommissionRate(double commissionRate){
        if (commissionRate < 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException
                    ("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    // get commission rate
    public double getCommissionRate() {
        return this.commissionRate;
    }

    // calculate earnings
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales() ;
    }

    // return String representation of CommissionEmployee
    @Override // indicates that this method overrides a super class method
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "Commission Employee", super.toString(),
                "Gross Sales", getGrossSales(),
                "Commission Rate", getCommissionRate());
    }
}
