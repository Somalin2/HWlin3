package mypackage;

import java.util.Scanner;

public class Login extends BankAccount {
	public void option()
	{
		Scanner input = new Scanner(System.in);
		BankAccount account = new BankAccount();
		int option = 0;
		System.out.println("1: Create account");
		System.out.println("2: Login Exit account");
		System.out.println("0: Exit");
		while (option < 0 || option > 2)
		{
			System.out.println("Error! Choose between 0 - 2");
			option = input.nextInt();
		}
		switch (option)
		{
		case 1:
			create();
			break;
		case 2:
			login();
			break;
		case 0:
			System.exit(0);
			break;
		}
	}
	public void create()
	{
		Scanner input = new Scanner(System.in);
		BankAccount[] account = new BankAccount[100];
		String name;
		int accountNumber;
		int pin;
		System.out.println("Input User Name");
		name = input.next();
		System.out.println("Input Account Number");
		accountNumber = input.nextInt();
		System.out.println("Input PIN");
		pin = input.nextInt();
		setAccount_Number(accountNumber);
		setName(name);
		setPin(pin);
		disPlay();
	}
	public void login()
	{
		Scanner input = new Scanner(System.in);
		String name;
		int accountNumber;
		int pin;
		System.out.println(getAccount_Number() + " " + getPin());
		System.out.println("Input Account Number");
		accountNumber = input.nextInt();
		System.out.println("input PIN");
		pin = input.nextInt();
		if (accountNumber == getAccount_Number() && pin == getPin())
		{
			disPlay();
		}
		else
		{
			System.out.println("Wrong Account number or Pin");
			login();
		}
	}
	public void confirm_Pin()
	{
		Scanner input = new Scanner(System.in);
		int pin;
		System.out.println("Input PIN");
		pin = input.nextInt();
		if (pin == getPin())
		{
			;
		}
		else
		{
			System.out.println("Wrong PIN");
			confirm_Pin();
		}
	}
	public void disPlay()
	{
		Scanner input = new Scanner(System.in);
		int n;
		float balance;
		
		System.out.println("Choose option: ");
		System.out.println("1: Deposit");
		System.out.println("2: Withdrawl");
		System.out.println("3: Transfer");
		System.out.println("4: Check Balance");
		System.out.println("5: Change PIN");
		System.out.println("6: Logout");
		n = input.nextInt();
		while (n < 1 || n > 7)
		{
			System.out.println("Error! Choose between 1 - 6");
			n = input.nextInt();
		}
		do
		{
			switch (n)
			{
			case 1:
				 System.out.println("Your total balance is: $" + getBalance());
				 System.out.println("How many you want to deposit");
				 balance = input.nextFloat();
				 depoSit(balance);
				 break;
			case 2:
				confirm_Pin();
				System.out.println("Your total balance is: $" + getBalance());
				System.out.println("How many you want o withdrawl");
				balance = input.nextFloat();
				withDrawn(balance);
				break;
			case 3:
				confirm_Pin();
				System.out.println("Your total balance is: $" + getBalance());
				System.out.println("How many you want to withdrawl");
				balance = input.nextFloat();
				transFer(balance);
				break;
			case 4:
				System.out.println("Your total balance is: $" + getBalance());
				break;
			case 5:
				change_Pin();
			case 6:
				option();
			}
			System.out.println("Do you want to continue if yes press any key and (-1) to exit");
			n = input.nextInt();
			if (n == -1)
			{
				System.exit(0);
			}
			else 
			{
				disPlay();
			}
		}while (n != -1);	
	}
}
