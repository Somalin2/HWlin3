package mypackage;

import java.util.Scanner;

public class Deposit{

	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name:");
		String size=scanner.next();
		
			System.out.println("Enter Account Number: ");
			String name=scanner.next();
			System.out.println("Please enter Balance: ");
			float rate=scanner.nextFloat();
			System.out.println("Please enter PIN: ");
			float PIN=scanner.nextFloat();
//			employees[i]=new Employee();
//			employees[i].setName(name);
//			employees[i].setRate(rate);
			employees[i]=new Employee(name, rate, PIN);
		}
		
		for(int i=0;i<size;i++) {
//			System.out.println(employees[i].getName() + " annual salary is " + employees[i].getRate()*50*40);
			employees[i].salary();
		}
		
	}

}
