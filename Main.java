

public class Main {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.setFirstName("John");
        account.setLastName("Doe");
        account.setAccountID(12345);
        account.deposit(50);
        account.processWithdrawl(51);
        account.displayAccount();
    }
}
