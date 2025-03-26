package Bank;

public class Solution {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(
                1234,
                "Glen Ganderton",
                "32 Clifford Street",
                "61400246510",
                "11/11/1990"
                );

        System.out.println("Name: " + account.getName());
        System.out.println("Account Number: " + account.getAccountNumber());
        account.setAccountNumber(777666);
        System.out.println("New Account Number: " + account.getAccountNumber());
        account.deposit(100);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(50);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(5);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(155);
        System.out.println("Balance: " + account.getBalance());

    }
}