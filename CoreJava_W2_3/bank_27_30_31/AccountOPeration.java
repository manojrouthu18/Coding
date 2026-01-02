package bank;

import bank.exception.InsufficientBalanceException;

interface AccountOperation{
    void deposit(long amount);
    void getBalance();

    void withdrawal(long amount) throws InsufficientBalanceException;
}


