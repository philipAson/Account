public class Main {
    public static void main(String[] args) {

        SavingsAccount saveingsaccount = new SavingsAccount("spar1", 2000, 3);
        Account salaryAccount = new Account("a1", 2000);
        
        salaryAccount.withdraw(100);
        salaryAccount.deposit(2400);

        System.out.println(salaryAccount);
        
        salaryAccount.withdraw(300);

        saveingsaccount.addInterest();

        System.out.println(salaryAccount);
        System.out.println(saveingsaccount);

        saveingsaccount.transfer(200, salaryAccount);


    }
}