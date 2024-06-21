public class bank_account
{
private double balance;
public bank_account(double open_balance)
{
balance = open_balance;
}
public void display()
{
System.out.println("your account is:+" +balance);
}
public void deposit(double amount)
{
balance = balance + amount;
}
public void withdraw(double  amount)
{
balance = balance - amount;
}
public void transfer(double amount)
{
balance = balance - amount;
}
public static void main(String args[])
bank_account tran1 = new bank_account(100000);
System.out.println("balance before:");
tran1.display();
System.out.println("balance after transaction:");
tran1.deposit(50000.0);
tran1.withdraw(20000.0);
tran1.transfer(12000.0);
System.out.println("show balance after transaction:");
tran1.display();
}
