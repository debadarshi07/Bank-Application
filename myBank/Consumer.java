package myBank;

import java.util.Scanner;

public class Consumer extends Bank {
	
	
	public static void deposit() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter last 5 digits of your account no:");
		int accountOrder=sc.nextInt();
		
		System.out.print("Enter the amount in Rs:");
		double amount=sc.nextDouble();
		
		accounts[accountOrder].setBalance(accounts[accountOrder].getBalance() + amount);
		System.out.println("Money was successfully deposited into your account.");
		
		
		// Want to check your updated balance??
		
		System.out.print("Do you want to check your updated balance ? Y or N: ");
		char response=sc.next().charAt(0);
		
		if(response=='Y'||response=='y') {
			System.out.println("Remaining balance in your account: Rs."+accounts[accountOrder].getBalance());
		}
		
	}
	
	public static void withdraw() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the last 5 digits of your account no:");
		int accountOrder=sc.nextInt();
		
		System.out.print("Enter the amount in Rs:");
		double amount=sc.nextDouble();
		
		if(amount > accounts[accountOrder].getBalance()) {
			System.out.println("Insufficient balance in account.");
		}else {
			accounts[accountOrder].setBalance(accounts[accountOrder].getBalance() - amount);
			System.out.println("Money withdrawn successfully.");
		}
		
		
		// Want to check your updated balance??

		System.out.print("Do you want to check your updated balance ? Y or N: ");
		char response=sc.next().charAt(0);
		
		if(response=='Y'||response=='y') {
			System.out.println("Remaining balance in your account: Rs."+accounts[accountOrder].getBalance());
		}

		
	}
	
	public static void checkBalance() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter last 5 digits of your account no:");
		int accountOrder=sc.nextInt();
		
		System.out.println("Remaining balance in account: "+accounts[accountOrder].getBalance());

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		replaceNulls();
		
		
		
		registration();
		deposit();
		withdraw();
		checkBalance();
		registration();
		checkBalance();
		checkBalance();
		
		
	}

}
