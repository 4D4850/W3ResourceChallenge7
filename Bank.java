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
        private int modifyBalance(double amount){ // Just put in a negative number to withdraw
            if((accountBalance + amount) < 0){
                return 1; //Insufficient funds
            }
            accountBalance += amount;
            return 0; //Success
        }
        public String getName(){
            return name;
        }
        public int setName(String f_newName){
            name = f_newName;
            return 0;
        }
    }
    ArrayList<Account> accountList = new ArrayList<Account>();
    String bankName;
    int curId;
    public Bank(String f_bankName){

    }
    public int addAccount(String f_name){
        accountList.add(new Account(curId, 0.0, f_name));
        curId++;
        return 0;
    }
    public int withdraw(double f_amount, int f_accountId){
        return accountList.get(f_accountId).modifyBalance(-f_amount);
    }
}