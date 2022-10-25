package com.music.client;

import com.music.AccountType;
import com.music.BankAccount;

public class BankAccountClient {

    public static void main(String[] args) {
        BankAccount testAcct1=new BankAccount(12812800,"John Doe",
                100.00, AccountType.Saving);
        testAcct1.deposit(200);
        testAcct1.withdrawal(400);
        System.out.println(testAcct1.toString());

        BankAccount testAcct2=new BankAccount();
        testAcct2.openAccount(82182100,"Sean Lee",1000, AccountType.Checking);
        System.out.println(testAcct2);
    }
}
