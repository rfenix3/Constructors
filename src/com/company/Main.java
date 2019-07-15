package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account richsAccount = new Account();


        richsAccount.withdrawal(100.0);
        richsAccount.deposit(50.0);
        richsAccount.withdrawal(100.0);
        richsAccount.deposit(51.0);
        richsAccount.withdrawal(100.0);
    }
}
