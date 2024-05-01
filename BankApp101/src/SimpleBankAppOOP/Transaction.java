package SimpleBankAppOOP;

public class Transaction {
    public static void deposit (Account account, double amount){
        account.deposit(amount);
        System.out.println("Deposited $" + amount + " into account " + account.getAccountNumber());
    }

    public static void withdraw(Account account, double amount){
        account.withdraw(amount);
    }
}
