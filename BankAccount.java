package mypackage;
//TESTING
import java.util.Scanner;

public class BankAccount {
	private String name;
	private int account_Number;
	private float balance;
	private int pin;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAccount_Number()
	{
		return account_Number;
	}
	public void setAccount_Number(int account_Number)
	{
		this.account_Number = account_Number;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public int getPin()
	{
		return pin;
	}
	public void setPin(int pin) 
	{
		this.pin = pin;
	}
	public float transFer(float x) 
	{
		if (balance < x)
		{
			return balance;
		}
		return balance = balance - x;
	}
	public BankAccount()
	{
		
	}
	
	public BankAccount(String name, int account_Number, float balance, int pin)
	{
		this.name = name;
		this.account_Number = account_Number;
		this.balance = balance;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Account{" +
				 "name='" + name + '\'' +
				 ", account_Number=" + account_Number +
				 ", balance=" + balance +
				 ", pin=" + pin +
				 '}';
	}
	public float withDrawn(float x)
	{
		if (balance <  x)
		{
			return balance;
		}
		return balance = balance - x;
	}
	public float depoSit(float x)
	{
		return balance = balance + x;
	}
	public void change_Pin()
	{
		Scanner input = new Scanner(System.in);
		int pin;
		System.out.println("Input Your PIN: ");
		pin = input.nextInt();
		if (pin == getPin())
		{
			System.out.println("Your PIN is: " + getPin());
			System.out.println("Input your new PIN");
			pin = input.nextInt();
			setPin(pin);
		} else 
		{
			System.out.println("Wrong Pin");
			change_Pin();
		}
	}
}
