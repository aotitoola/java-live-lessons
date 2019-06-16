package com.learn.inheritance;

// CommissionEmployee class represents an employee paid a percentage of gross sales

public class CommissionEmployee extends Object {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // five-argument constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                              double commissionRate)
    {
        // implicit call to object's default constructor occurs here
        if (grossSales < 0.0)
            throw new IllegalArgumentException
                    ("Gross sales must be >= 0.0");

        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException
                    ("Commission rate must be > 0.0 and < 1.0");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end constructor

    // return first name
    public String getFirstName(){
        return this.firstName;
    }

    // return last name
    public String getLastName() {
        return this.lastName;
    }

    // return social security number
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }

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
    public double earnings() {
        return getCommissionRate() * getGrossSales() ;
    }

    // return String representation of CommissionEmployee object
    @Override // indicates that this method overrides a super class method
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s %.2f",
                "Commission Employee", firstName, lastName,
                "Social Security Number", socialSecurityNumber,
                "Gross Sales", grossSales,
                "Commission Rate", commissionRate);
    }
}// end class CommissionEmployee
