public class Main {
    public static void main(String[] args) {

        Account saveingsaccount = new SavingsAccount("spar1", 2000, 3);
        Account salaaryAccount = new Account("a1", 2000);
        salaaryAccount.withdraw(100);
        salaaryAccount.deposit(2400);
        System.out.println(salaaryAccount.balance);
        System.out.println(salaaryAccount);
        salaaryAccount.withdraw(300);
        System.out.println(salaaryAccount.balance);
        ((SavingsAccount) saveingsaccount).addInterest();

    }
}