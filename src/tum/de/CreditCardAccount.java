package tum.de;

public class CreditCardAccount extends BankAccount {
    private final double limit;
    private double creditBalance = 0;

    CreditCardAccount(int accountId, double initial, double limit) {
        super(accountId, initial);
        this.limit = limit;
    }

    public boolean pay(double amount) {
        System.out.println("Pay from account " + accountId + "\n" + "Amount:\t\t\t" + amount);
        if (-creditBalance + amount > limit) {
            System.out.println("Sorry, insufficient balance...\n");
            return false;
        }
        creditBalance = creditBalance - amount;
        System.out.println("New credit balance:\t" + creditBalance + "\n");
        return true;
    }

    public void compensate() {
        System.out.println("Compensate account " + accountId);
        balance = balance + creditBalance;
        creditBalance = 0;
        System.out.println("New balance:\t\t" + balance);
        System.out.println("New credit balance:\t" + creditBalance);
    }


    public void handleOverdraftInterest() {
        System.out.println("Handle overdraft interest for account" + accountId);
        if (balance < 0) {
            double overdraftInterest = 0.05 * -balance;
            System.out.println("Overdraft interest: \t" + overdraftInterest);
            balance = balance - overdraftInterest;
        }
        System.out.println("New balance:\t\t" + balance);
    }


}
