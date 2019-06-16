package com.learn.inheritance;

public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {

        // instantiate CommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis",
                "333-33-3333", 5_000, .04, 300);

        // get base-salaried commission employee data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name: ", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name: ", employee.getLastName());
        System.out.printf("%s %s%n", "Social Security Number: ", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross Sales: ", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate: ", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base Salary: ", employee.getBaseSalary());

        employee.setGrossSales(20_000);
        employee.setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);
    }
}
