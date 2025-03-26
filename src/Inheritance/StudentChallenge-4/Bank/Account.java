package Bank;

public class Account {
    private int accountNumber;
    private String name;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;
    private int balance;

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

    public int getBalance(){
        return balance;
    }

    public void setBalance(int amount, String withdrawOrDeposit){
        if (amount >= 0 && (withdrawOrDeposit.equals("D"))){
            balance += amount;
        } else if (amount >= 0 && (withdrawOrDeposit.equals("W"))) {
            balance = amount;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }


}