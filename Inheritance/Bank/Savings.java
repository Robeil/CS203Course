package CS203Course.Inheritance.Bank;

public class Savings extends Account{

        double depositFees;

        public Savings(){
            super();
            depositFees = 5;
        }
        public Savings(double startingBalance, double fees){
            super(startingBalance);
            depositFees = fees;
        }

    }
