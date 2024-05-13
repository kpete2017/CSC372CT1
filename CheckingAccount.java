public class CheckingAccount extends BankAccount {
    private double interestRate = 0.02;

    public CheckingAccount() {
        super();
    }

    public void processWithdrawl(double amount) {
        super.withdrawl(amount);
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate);
    }
}