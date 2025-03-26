package Bank;

public class Solution {
    public static void main(String[] args) {
        Account account = new Account(
                1234,
                "Glen Ganderton",
                "32 Clifford Street",
                "61400246510",
                "11/11/1990"
                );

        System.out.println(account.getName());
    }
}