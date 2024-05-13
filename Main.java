

public class Main {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.setFirstName("John");
        account.setLastName("Doe");
        account.setAccountID(12345);
        account.deposit(100);
        account.processWithdrawl(50);
        account.displayAccount();
    }
}
