package com.music.client;

import com.music.AccountType;
import com.music.BankAccount;
import com.music.test.CustomUncheckedException;

public class BankAccountClientArgs {
    public static void main(String[] args) {

        if(args.length<4){
            System.out.println("Usage:java com.music.client.BankAccountClientArgs " +
                    "accountNumber, " +
                    "accountName, " +
                    "balance, " +
                    "accountType.");
            return;
        }
        int accountNumber=Integer.parseInt(args[0]);
        String accountName=args[1];
        double balance=Double.parseDouble(args[2]);
        AccountType type=AccountType.valueOf(args[3]);
        BankAccount acct= null;
        try {
            acct = new BankAccount(accountNumber,accountName,balance,type);
        } catch (CustomUncheckedException e) {
            e.printStackTrace();
        }
        System.out.println(acct);


    }
}
