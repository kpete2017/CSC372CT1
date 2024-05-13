public class BankAccount {
    private double balance;
    private string firstName;
    private string lastName;
    private int accountID;


    /** Constructor */
    public BankAccount() {
        balance = 0;
    }

    /** Getters and Setters */
    public string getFirstName() {
        return firstName;
    }
    
    public void setFirstName(string name) {
        firstName = name;
    }
    
    public string getLastName() {
        return lastName;
    }
    
    public void setLastName(string name) {
        lastName = name;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int id) {
        accountID = id;
    }

    /** Balance Methods */
    
    public void deposit(double value) {
        balance += amount;
    }

    public void withdrawl(double value) {
        balance -= amount;
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