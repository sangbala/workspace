package com.hr.personnel.client;

import com.hr.personnel.Employee;
import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{

    private double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void pay(){
        System.out.println(getName()+
                " is paid salary "+
                getSalary());
    }



    @Override
    public String toString() {
//        return  "HourlyEmployee name: "+ getName() +
//                ", hire date: "+getHireDate()+
//                " SalariedEmployee:" +
//                "salary=" + salary ;

        return  super.toString()+
                " SalariedEmployee:" +
                "salary=" + salary ;
    }

    @Override
    public void payTaxes() {
        System.out.println(getName()+
                " pays tax in the amount of $"+
                getSalary()*SALARIED_TAX_RATE);
    }
}
