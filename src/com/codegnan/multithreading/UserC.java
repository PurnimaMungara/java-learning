package com.codegnan.multithreading;


class UserC implements Runnable {
BankAccount account;
public UserC(BankAccount account) {
    this.account = account;
}
@Override
public void run() {
    account.withdraaw(Thread.currentThread().getName(), 5000);
}
}

