package CS203Course.Inheritance.Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static void main(String[] args) {

        Checking cAccount = new Checking();
        Savings sAccount = new Savings();
        Retirement rAccount = new Retirement();

        List<Account> accounts = new ArrayList<Account>();
        accounts.add(cAccount);
        accounts.add(sAccount);
        accounts.add(rAccount);

        for(Account a : accounts) {
            a.Deposite(300);
            System.out.println(a);
        }
    }
}
