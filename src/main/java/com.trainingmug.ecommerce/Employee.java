package com.trainingmug.ecommerce;

public class Employee {

    public static String companyName = "Digi-Safari Pvt Ltd updated ";
    public static String companyContactNo = "+1-111-222-333";
    public static long employeeCount = 0;

    public long id;
    public String name;
    public String designation;
    public float grossSalary;
    public float travellingAllowances;
    public float federalTax;
    public float stateTax;


    public Employee(){
        employeeCount++;
        id = 1111;
        name = "Andrew Fuller";
        designation = "Senior Software Engineer";
        grossSalary = 5208.33f;
        travellingAllowances = 300.0f;
        federalTax = 611.86f;
        stateTax = 359.24f;

    }

    public Employee(long id, String name, String designation, float grossSalary, float travellingAllowances, float federalTax, float stateTax) {
        employeeCount++;
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.grossSalary = grossSalary;
        this.travellingAllowances = travellingAllowances;
        this.federalTax = federalTax;
        this.stateTax = stateTax;

    }

    public void displayProfile(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Travelling Allowances: " + travellingAllowances);
        System.out.println("Federal Tax: " + federalTax);
        System.out.println("State Tax: " + stateTax);

    }

    public float incrementSalary(float incrementPercentage){
        return grossSalary + ( grossSalary  * incrementPercentage / 100 );
    }

    public static void displayCompanyInfo(){
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Contact No: " + companyContactNo);
        System.out.println("com.trainingmug.ecommerce.Employee Count: " + employeeCount);
    }
}