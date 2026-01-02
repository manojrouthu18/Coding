package bank;

import bank.exception.InsufficientBalanceException;

public class TestingAccount {
    public static void main(String[] args) {
        Account newAcc=new Account(12345678,"Savings",0);

        newAcc.deposit(1000);
        newAcc.getBalance();
        newAcc.deposit(20000);
        newAcc.getBalance();
     

        try {

        newAcc.withdrawal(300000);

        newAcc.getBalance();
            
        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
            
        }

    }
}
