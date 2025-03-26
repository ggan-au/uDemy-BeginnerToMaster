package Bank;

public class LoanAccount extends Account {
    public LoanAccount(int accountNumber,
                          String name,
                          String address,
                          String phoneNumber,
                          String dateOfBirth) {
        super(accountNumber, name, address, phoneNumber, dateOfBirth);
    }
}