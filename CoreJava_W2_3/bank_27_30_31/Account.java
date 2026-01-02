package bank;
/*
27. Write a program to create an interface called account operation with methods deposit(), getBalance().Implement this interface in Account class.
28. Design classes that need to sort a collection of Product objects either by product name or by price.
29. Accept five strings which contain numbers and display the total for those numbers. Make your program fault tolerant.
30. Go back to all classes and handle exceptions.
31. Create an insufficientBalanceException Class with the message "Insufficient Balance X for withdrawal of Y". */

import bank.exception.InsufficientBalanceException;

public class Account implements AccountOperation{
  
 private long acc_no;
 private String type;
 private long balance;

      public Account(long acc_no,String type,long initAmount){
        this.acc_no=acc_no;
        this.type=type;
        this.balance=initAmount;

        System.out.println("account created with no: "+acc_no);

      }


      public void deposit(long amount){

        balance+=amount;
          System.out.println(amount+"$ Depositted in to the accno ending with "+(acc_no%100000));
      }


      public void getBalance(){

          System.out.println("Balance : "+balance);
      }
      


      public void withdrawal(long withdrawal) throws InsufficientBalanceException{

        if(balance<withdrawal){
          throw new InsufficientBalanceException("Insufficient Balance  "+balance+" for windrawl of "+withdrawal);
        }
        System.out.println(withdrawal+"$ withdrawed !");

        balance-=withdrawal;

      }


   
 
}

