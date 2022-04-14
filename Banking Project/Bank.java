/**
 * Represents a bank for managing customers and their bank accounts
 */
import java.util.Scanner; 
public class Bank {
	
	public static void main (String[] args) {
		// New instance of bank class
		Bank bank = new Bank();
		// calls run method
		bank.run();
	}
	// Runs program by initializing and managing bank accounts and customers
	public void run ()
	{
		System.out.println("Welcome to the Bank! What is your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello " + name + ", We are creating checking and savings accounts for you.");
		Customer customer = new Customer(name);
		System.out.println("What is your address?");
		String address = sc.next();
		customer.setAddress(address);
		BankAccount checkingAccount = new BankAccount("checking", customer);
		BankAccount savingsAccount = new BankAccount("saving", customer);
		System.out.println(checkingAccount.getCustomerInfo());
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		System.out.println("Amount to deposit into checking account");
		double amount = sc.nextDouble();
		checkingAccount.deposit(amount);
		System.out.println("Amount to deposit into saving account");
		amount = sc.nextDouble();
		savingsAccount.deposit(amount);
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		System.out.println("Amount to withdraw from checking account");
		amount = sc.nextDouble();
		try
		{
			checkingAccount.withdraw(amount);
		}
		catch (Exception  e)
		{
			//e.printStackTrace()
			System.out.println(e.getMessage());
		}
		System.out.println("Amount to withdraw from savings account");
		amount = sc.nextDouble();
		try
		{
			savingsAccount.withdraw(amount);
		}
		catch (Exception e)
		{
			//e.printStackTrace()
			System.out.println(e.getMessage());
		}
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		sc.close(); // closes scanner, good practice
	}
}
