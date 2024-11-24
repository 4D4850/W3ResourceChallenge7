import java.util.ArrayList;

public class Bank{
    private class Account{
        private int id;
        private double accountBalance;
        private String name;

        public Account(int f_id, double f_accountBalance, String f_name){
            id = f_id;
            accountBalance = f_accountBalance;
            name = f_name;
        }
        public int modifyBalance(double amount){ // Just put in a negative number to withdraw
            if((accountBalance + amount) < 0){
                return 1; //Insufficient funds
            }
            accountBalance += amount;
            return 0; //Success
        }
    }
    ArrayList<Account> accountList = new ArrayList<Account>();
    String bankName;
    public Bank(String f_bankName){

    }
}