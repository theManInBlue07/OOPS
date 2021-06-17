package com.flowstatements;

public class Main {

    public static void main(String[] args) {
	BankAccount Satyam = new BankAccount();
	BankAccount default1 = new BankAccount();




	Satyam.setCustomerName("Satyam Priyadarshi");
	Satyam.getCustomerName();

	Satyam.setEmail("satyam.priyadarshi7@gmail.com");
	Satyam.getEmail();

	Satyam.setPhoneNumber("9810390928");
	Satyam.getPhoneNumber();

	Satyam.setAccountNumber("123456789");
	Satyam.getAccountNumber();

	Satyam.setBalance(50000.00);
	Satyam.getBalance();

	Satyam.depositAmount(25000);
	Satyam.withdrawAmount(100000000.00);
	Satyam.withdrawAmount(59999.23456);

	// loading my new values using the constructors
		// instead of calling Shubham and then loading the fields .
		// Everything done at once.
	BankAccount Shubham = new BankAccount("123456897",250000.00,"Shubham Priyadarshi","9999999999",
			"cjbedchdsbcsdcbdsjc.com");
	Shubham.withdrawAmount(52.00);
	BankAccount newDefault = new BankAccount(25.00,"ABCD","258741369");
		System.out.println(newDefault.getEmail());

	//Satyam.FinalDetails("Satyam Account details");
    }
}
