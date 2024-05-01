package SimpleBankAppOOP;

class BankApp {
    public static void main(String[] args) {

        Account[] accounts = new Account[2];

        accounts[0] = new Account("755", 900.00);
        accounts[1] = new Account("800", 156.00);


        Transaction.deposit(accounts[0],500.00);
        Transaction.withdraw(accounts[1],25.00);

        System.out.println("Balance of account 755: $" + accounts[0].getBalance());
        System.out.println("Balance of account 800: $" + accounts[1].getBalance());


        

    }

}