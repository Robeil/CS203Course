package CS203Course.Inheritance.Bank;

public class Retirement extends Account{

    double interest;

    public Retirement(){
        super();
        interest = 1;
    }

    public Retirement(double startingBalance, double extra){
        super(startingBalance);
        interest = extra;
    }
    @Override
    public void Deposite(double money){

        super.Deposite(money * (1+(interest/100)));
    }

    @Override
    public String toString() {
        return "Retirement Account, with balance of: " + super.balance + " an interest of: " + interest+"%";
    }
}
