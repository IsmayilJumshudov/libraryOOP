package SimpleBankAppOOP;

public class Account {

    private final String accountNumber;
    private Double balance;


    public Account(String accountNumber, Double balance ){
        this.accountNumber=accountNumber;
        this.balance=balance;

    }


    public void deposit (double amount){

        balance+=amount;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
        else{
            System.err.println("Insufficient funds in account " + accountNumber);
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }
}
