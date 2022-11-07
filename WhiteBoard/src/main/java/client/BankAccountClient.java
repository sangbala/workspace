package client;

import bankAccount.AccountType;
import bankAccount.BankAccount;
import test.CustomUncheckedException;

public class BankAccountClient {

    public static void main(String[] args) {
        BankAccount testAcct1= null;
        BankAccount testAcct2= null;
        try {
            testAcct1 = new BankAccount(12812800,"John Doe",
                    100.00, AccountType.Saving);
            testAcct1.deposit(200);
            testAcct1.withdrawal(400);


            testAcct2 = new BankAccount();
            testAcct2.openAccount(82182100,"Sean Lee",1000, AccountType.Checking);
        } catch (CustomUncheckedException e) {
            e.printStackTrace();
        }

        System.out.println(testAcct1.toString());
        System.out.println(testAcct2);
    }
}
