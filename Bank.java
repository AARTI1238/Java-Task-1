
Package bank_account;

Public class bank_account
{
Private double balance;
Public bank_account(double open_balance
{
balance = open_balance;
}
Public void display()
{
System.out.println("your account is:+" +balance);
}
Public void deposit(double amount)
{
Balance = balance + amount;
}
Public void withdraw(double  amount)
{
balance = balance - amount;
}
Public void transfer(double amount)
{
balance = balance - amount;
}
Public static void main(String args[])
bank_account tran1 = new bank_account(100000);
System.out.println("balance before:");
tran1.display();
System.out.println("balance after transaction:");
tran1.deposit(50000);
tran2.withdraw(20000);
tran3.transfer(12000);
System.out.println("show balance after transaction:");
tran1.display();
}
}