package com.hr.personnel.client;

import com.hr.personnel.Employee;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    private double rate;
    private double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        this.rate = rate;
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public void pay(){
        System.out.println(getName()+
                " is paid hourly "+
                getRate()*getHours());
    }

    @Override
    public String toString() {
//        return  "HourlyEmployee name: "+ getName() +
//                ", hire date: "+getHireDate()+
//                " HourlyEmployee:" +
//                " rate=" + rate +
//                ", hours=" + hours ;

        return  super.toString()+
                " HourlyEmployee:" +
                " rate=" + rate +
                ", hours=" + hours ;
    }

    @Override
    public void payTaxes() {

        System.out.println(getName()+
                " pays tax in the amount of $"+
                getRate()*getHours()*HOURLY_TAX_RATE);


    }


}
