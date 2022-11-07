package com.music;

import com.music.test.CustomUncheckedException;

import java.time.LocalTime;
import java.time.LocalDate;

public class BankAccount {

    private int accountNumber;
    private String accountName;
    private double balance;
    private final static double MIN_BALANCE=0.0;
    private final static double MIN_TRANSACTION_VALUE =0.0;
    private AccountType accountType=AccountType.Checking;
    private LocalTime lastAccessedTime;
    private LocalDate lastAccessedDay;


    //Constructors:
    public BankAccount(){

    }
    public BankAccount(int accountNumber){
        setAccountNumber(accountNumber);
    }
    public BankAccount(int accountNumber, String accountName){
        this(accountNumber);
        setAccountName(accountName);
    }
    public BankAccount(int accountNumber, String accountName, double balance) throws CustomUncheckedException{
        this(accountNumber,accountName);
        setBalance(balance);
    }
    public BankAccount(int accountNumber, String accountName, double balance,AccountType accountType) throws CustomUncheckedException {
        this(accountNumber,accountName,balance);
        setAccountType(accountType);
    }

    //business method
    public void deposit(double amount){

        if(amount> MIN_TRANSACTION_VALUE){
            balance+=amount;
        }else{
            System.out.println("The amount should be more than 0.");
        }
        lastAccessedTime=LocalTime.now().withNano(0);
        lastAccessedDay=LocalDate.now();

    }
    public void withdrawal(double amount){

        if(amount> MIN_TRANSACTION_VALUE&&amount<balance){
            balance-=amount;
        }else{
            System.out.println("The amount should be more than 0 and less than current balance."
                    + "The amount you entered is "+ amount + "."
                    + "The current balance is "+balance+ ".");
        }
        lastAccessedTime=LocalTime.now().withNano(0);
        lastAccessedDay=LocalDate.now();
    }

    public void openAccount(int accountNumber, String accountName, double balance,AccountType accountType)
            throws CustomUncheckedException {
        setAccountNumber(accountNumber);
        setAccountName(accountName);
        setBalance(balance);
        setAccountType(accountType);
        lastAccessedTime=LocalTime.now().withNano(0);
        lastAccessedDay=LocalDate.now();
    }

    public void changeAccountName(String newName){
        setAccountName(newName);
    }



    //getter setter method start

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {

        if(accountNumber<0){
            System.out.println("This is not a valid account number.");
        }else{
            this.accountNumber = accountNumber;
        }
        lastAccessedTime=LocalTime.now().withNano(0);
        lastAccessedDay=LocalDate.now();

    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws CustomUncheckedException {

        if(balance<MIN_TRANSACTION_VALUE){
            //System.out.println("The value must be greater than 0.");
            throw new CustomUncheckedException("The value must be greater than 0.");
        }else{
            this.balance = balance;
        }

    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }



    //getter setter method end


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", accountType=" + accountType +
                ", last accessed day and time=" +
                lastAccessedDay +
                ", "+
                lastAccessedTime+
                '}';
    }
}
