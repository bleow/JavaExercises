package com.exercises.collections_lists_maps.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BankApp {

    public static void main(String[] args) {
        // Create a list to hold BankAccount objects
        List<BankAccount> accounts = new ArrayList<>();

        // Add BankAccount objects to the list
        accounts.add(new BankAccount("123456", 1000.0));
        accounts.add(new BankAccount("654321", 2000.0));
        accounts.add(new BankAccount("111111", 1500.0));
        accounts.add(new BankAccount("222222", 500.0));

        // Print the list of accounts before sorting
        System.out.println("Accounts before sorting:");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }

        // Sort the list of accounts based on balance
        Collections.sort(accounts);
        // If the class had no compareTo method override, you will need to pass your own Comparator like so:
        // Collections.sort(accounts, (a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()));
        // Collections.sort(accounts, Comparator.comparingDouble(BankAccount::getBalance));


        // Print the list of accounts after sorting
        System.out.println("\nAccounts after sorting:");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}