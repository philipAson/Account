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
        this.name = name;

    }
    // Method that gets name
    public String getName(String name) {
        return name;

    }
    // Method that returns name and balance in a string
    public String toString() {
        return name + " balance \n:" + balance;

    }
    // Method that transfer from SavingsAccount to a Account
    public void transfer(double amount, Account acc) {
        if(this.balance < amount) {
            System.out.println("The amount requested is to big, try a smaller amount");
        }
        else {
            this.balance = balance - amount;
            acc.balance = acc.balance + amount;

            System.out.println(this.name + " has " + this.balance);
            System.out.println(acc.name + " has " + acc.balance);
        }

    }

}
