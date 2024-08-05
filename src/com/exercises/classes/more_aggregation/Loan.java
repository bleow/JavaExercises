package com.exercises.classes.more_aggregation;

public class Loan {
    private final Customer customer;
    private final BankAccount account;
    private final double loanAmount;

    public Loan(Customer customer, BankAccount account, double loanAmount) {
        this.customer = customer;
        this.account = account;
        this.loanAmount = loanAmount;
    }


    @Override
    public String toString() {
        return "Loan Amount: " + loanAmount + "\n" +
                "Customer ID: " + customer.getCustomerId() + "\n" +
                "Name: " + customer.getName() + "\n" +
                "Account Number: " + account.getAccountNumber() + "\n" +
                "Account Balance: " + account.getBalance() + "\n";
    }

    public static void main(String[] args) {
        Customer customer = new Customer("C001", "John Doe", "123 Main St");
        BankAccount account = new BankAccount("123456", 1000.0);
        Loan loan = new Loan(customer, account, 5000.0);

        System.out.println(loan);
    }
}

