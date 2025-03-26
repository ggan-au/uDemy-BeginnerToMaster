package Bank;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber,
                          String name,
                          String address,
                          String phoneNumber,
                          String dateOfBirth) {
        super(accountNumber, name, address, phoneNumber, dateOfBirth);
    }

    public void deposit(int amount){
        if (amount > 0){
            setBalance(amount, "D");
        } else {
            System.out.println("Deposit amount must be greater than 0");
        }
    }

    public void withdraw(int amount) {
        if (getBalance() >= amount){
            setBalance(getBalance() - amount, "W");
        } else {
            System.out.println("Not enough funds available for withdrawal, " +
                    "you have " + getBalance() + " available.");
        }
    }

}