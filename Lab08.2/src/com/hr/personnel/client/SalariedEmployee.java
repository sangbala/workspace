package com.hr.personnel.client;

import com.hr.personnel.Employee;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

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
    public String toString() {
        return  "HourlyEmployee name: "+ getName() +
                ", hire date: "+getHireDate()+
                " SalariedEmployee:" +
                "salary=" + salary ;
    }
}
