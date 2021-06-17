package com.flowstatements;

public class Main {

    public static void main(String[] args) {
	VipCustomer delault1 = new VipCustomer();
	VipCustomer Satyam = new VipCustomer("Satyam",25863147.00,"satyam@abcdmail.com");
	VipCustomer Shubhamd =new VipCustomer("Shubham",2564.00);
		System.out.println(Satyam.getName());
		System.out.println(Satyam.getEmail());
		System.out.println(Satyam.getCreditLimit());
		System.out.println(Shubhamd.getCreditLimit());
		System.out.println(Shubhamd.getEmail());
		System.out.println(Shubhamd.getName());
		System.out.println(delault1.getName());
		System.out.println(delault1.getCreditLimit());
		System.out.println(delault1.getEmail());
    }
}
