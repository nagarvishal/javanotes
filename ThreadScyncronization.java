
import java.util.Scanner;

class Account
{
    private int bal;
    public Account(int bal){
        this.bal = bal;
    }
    public boolean isSufficientBalance(int w)
    {
        if(bal > w)return true;
        else return false;
    }
    public void withdraw(int amt)
    {
        this.bal = this.bal - amt;
        System.out.println("Withdrawal Money is "+amt);
        System.out.println("Your Current balance is "+bal);
    }
}

class Customer implements Runnable
{
    private Account account;
    private String name;
    public Customer(Account account,String name){
        this.account = account;
        this.name = name;
    }
    @Override
    public void run() {
        
        synchronized(account){
            Scanner kb = new Scanner(System.in);
            System.out.println(name+"Enter Amount to Withdraw");
            int amt = kb.nextInt();
            if(account.isSufficientBalance(amt)){
                account.withdraw(amt);
            }
            else{
                System.out.println(name+"Insufficient Balance");
            }
        }
    }

}
public class ThreadScyncronization {
    public static void main(String args[]){
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1,"vishal");
        Customer c2 = new Customer(a1,"keshave");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
