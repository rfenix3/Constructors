package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        this("56789", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance = this.balance + depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            // using printf method to print out result with added formatting.
            System.out.printf("Only $%8.2f available. Withdrawal of $%8.2f not processed", this.balance, withdrawalAmount);
            System.out.println();
        } else {
            this.balance -= withdrawalAmount;
            // using printf method to print out result with added formatting.
            System.out.printf("Withdrawal of $%8.2f processed. Remaining balance = $%8.2f", withdrawalAmount, this.balance);
            System.out.println();
        }
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

}
