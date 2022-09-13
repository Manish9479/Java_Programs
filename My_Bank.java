import java.util.Scanner;
class Account {
   private int account_No;
    String Customer_Name;
    double balance;


public double getbalance( int x) {
    balance = balance +x;
    System.out.println(balance);
    return balance;
    
}
public boolean withdrawl(int x,double y) {
    balance = balance - x;
    balance = balance - y;
    System.out.println(balance);
    return true;
}

public boolean deposit(int x , double y) {
    balance = balance + x;
    balance = balance +y;
    return true;

}

public void setAccountNo(int x) {
    account_No=x;
    
}

 public int getAccountNo() {
     System.out.println(account_No);
     return account_No;
    
 }

public boolean withdrawl(double x) {
    balance = balance - x ;
    System.out.println(balance);
    return true;
}

public boolean deposit(double x) {
    balance = balance + x;
    System.out.println(balance);
    return true;    
}
}

public class My_Bank {
    public static void main (String[] args) {
        int bl;
          
        Account account_No = new Account();
        Scanner sn = new Scanner(System.in);
          System.out.println("enter balance");
          bl = sn.nextInt();
        account_No.withdrawl(78,87);
         account_No.getbalance(bl);
         account_No.deposit(1000,7000);
         account_No.setAccountNo(1919191);
         account_No.getAccountNo();
        account_No.withdrawl(115);
        account_No.deposit( 120);
        System.out.println(account_No.balance);

    
    }
    
}
