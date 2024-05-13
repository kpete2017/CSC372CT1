// Kyle Petersen
// 05/13/2020
// Programming II
// Critical Thinking 1

import java.text.DecimalFormat;

public class BankAccount {
    private double balance;
    private String firstName;
    private String lastName;
    private int accountID;


    /** Constructor */
    public BankAccount() {
        balance = 0;
    }

    /** Getters and Setters */
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String name) {
        firstName = name;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String name) {
        lastName = name;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int id) {
        accountID = id;
    }

    /** Balance Methods */
    
    public void deposit(double amount) {
        DecimalFormat f = new DecimalFormat("##.00");
        double temp = balance + amount;
        balance = Double.parseDouble(f.format(temp));    
    }

    public void withdrawl(double amount) {
        DecimalFormat f = new DecimalFormat("##.00");
        double temp = balance - amount;
        balance = Double.parseDouble(f.format(temp));
    }

    public double getBalance() {
        return balance;
    }

    public void accountSummary() {
        System.out.println("ACCOUNT SUMMARY");
        System.out.println("Account ID: " + accountID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Balance: " + balance);
    }
}