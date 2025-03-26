package Bank;

public class Account {
    private int accountNumber;
    private String name;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;

    public Account(int accountNumber,
                   String name,
                   String address,
                   String phoneNumber,
                   String dateOfBirth) {

        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName(){
        return name;
    }
}