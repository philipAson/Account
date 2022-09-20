public class Account {

    String name;    // Name
    double balance;   // Saldo

    private static int count = 0;
    // Constructor that sets the default value of ur balance to 0.
    public Account() {
        this.balance = 0;
        this.count++;

    }
    // Constructor that defines your name and balance.
    public Account(String name, double startbBalance) {
        this.name = name;
        this.balance = startbBalance;
        this.count++;

    }
    // Method that makes a withdrawl from balance
    public double withdraw(double amount) {
        if (this.balance >= amount && amount > 0) {
            this.balance = balance - amount;
            return amount;
        }
        return 0;
    }
    // Method that makes a deposit to balance
    public void deposit(double amount) {
        this.balance = balance + amount;

    }
    // Method that sets name
    public void setName(String name) {
        this.balance = balance;

    }
    // Method that gets name
    public String getName(String name) {
        return name;

    }
    // Method that returns name and balance in a string
    public String toString() {
        return name + " balance \n:" + balance;

    }
}
