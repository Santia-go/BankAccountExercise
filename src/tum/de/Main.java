package tum.de;


public class Main {

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(4321, 5028.45, 0.02);
        BonusSaverAccount bonusSaver = new BonusSaverAccount(6543, 1475.85, 0.02);
        CheckingAccount checking = new CheckingAccount(9876, 269.93, savings);

        savings.deposit(148.04);
        bonusSaver.deposit(41.52);
        savings.withdraw(725.55);
        bonusSaver.withdraw(120.38);
        checking.withdraw(320.18);

        //To test the challenges
        //CreditCardAccount creditCard = new CreditCardAccount(7391,300.0, 1000.00);




        //creditCard.pay(532.45);
        //creditCard.pay(467.54);
        //creditCard.pay(0.01);
        //creditCard.pay(0.01);
        //creditCard.compensate();
        //creditCard.pay(23.01);
        //creditCard.pay(532.45);
        //creditCard.handleOverdraftInterest();

    }
}
