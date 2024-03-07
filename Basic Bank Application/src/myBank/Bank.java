package myBank;
import java.util.*;

public class Bank {
	
	//Bank details
	
	final String bankName="State Bank Of India";
	final String addressOfBank="Bhubaneswar";
	static int noOfAccountHolders=00000;
	
	//Consumer details
	
	private String name;
	private int age;
	private double balance;
	private String accountNo;
	
	static Consumer accounts[]=new Consumer[10000];
	
	
	// All getters and setters to access private infos of consumer
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// This method replaces null values with Consumer object references at each index in accounts array. 
	
	public static void replaceNulls() {
		for(int i=0;i<accounts.length;i++) {
			accounts[i]=new Consumer();
		}
	}
	
	public static void registration() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your Full Name:");
		String name=sc.nextLine();
		
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		
		Consumer consumer=new Consumer();
		
		consumer.setName(name);
		consumer.setAge(age);
		consumer.setAccountNo("SBI"+noOfAccountHolders);
		consumer.setBalance(0);
		
		accounts[noOfAccountHolders++]=consumer;
		
		System.out.println("Welcome to SBI family.Your SBI account has been successfully registered.");

	}
		

}
