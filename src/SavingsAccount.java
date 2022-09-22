public class SavingsAccount extends Account {

    // Instance variable for interest rate
    double interestRate;


    // Constructor for interest rate
    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = (interestRate/100) * balance;
        System.out.println("The interest of your balance with a " + interestRate +"% interest rate is: "
                + interest + ".\n The total amount of your savings-account with interest is: " + (interest + balance));
        
    }


}
