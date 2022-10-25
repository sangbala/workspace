package com.music.test;

import com.music.AccountType;
import com.music.BankAccount;

public class BankAccountValidationTest {

    public static void main(String[] args) {


        BankAccount testAcct1=new BankAccount(12812800,"John Doe",
                -8.00, AccountType.Saving);
        BankAccount testAcct2=new BankAccount(12812800,"John Doe",
                8.00, AccountType.Saving);
        System.out.println(testAcct2);
        testAcct2.withdrawal(10000.99);
        System.out.println(testAcct2);
        testAcct2.deposit(10001.99);
        System.out.println(testAcct2);
        testAcct2.withdrawal(10001.99);
        System.out.println(testAcct2);
        BankAccount testAcct3=new BankAccount(12812800,"John Doe",
                8.00);
        System.out.println(testAcct3);

    }
}
