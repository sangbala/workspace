package test;

import bankAccount.AccountType;
import bankAccount.BankAccount;

public class BankAccountValidationTest {

    public static void main(String[] args) {


        BankAccount testAcct2= null;
        BankAccount testAcct3= null;
        try {
            BankAccount testAcct1=new BankAccount(12812800,"John Doe",
                    1000008.00, AccountType.Saving);
            testAcct2 = new BankAccount(12812800,"John Doe",
                    100008.00, AccountType.Saving);
            testAcct3 = new BankAccount(12812800,"John Doe",
                    8.00);
        } catch (CustomUncheckedException e) {
            System.out.println("must be greater than 0");;
        }
        System.out.println(testAcct2);
        testAcct2.withdrawal(100.99);
        System.out.println(testAcct2);
        testAcct2.deposit(10001.99);
        System.out.println(testAcct2);
        testAcct2.withdrawal(10001.99);
        System.out.println(testAcct2);

        System.out.println(testAcct3);

    }
}
