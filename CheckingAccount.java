// Kyle Petersen
// 05/13/2020
// Programming II
// Critical Thinking 1

public class CheckingAccount extends BankAccount {
    private double interestRate = 0.02;

    public CheckingAccount() {
        super();
    }

    public void processWithdrawl(double amount) {
        super.withdrawl(amount);
        if (super.getBalance() < 0) {
            System.out.println("Account is Overdrawn! Applying Overdraft fee.");
            super.withdrawl(30);
        }
        System.out.println("New Balance: " + super.getBalance());
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate);
    }
}