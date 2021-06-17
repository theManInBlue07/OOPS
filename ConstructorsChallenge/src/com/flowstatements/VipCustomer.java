package com.flowstatements;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("ABCD",000.0000,"ABCD@abcdmail.com" );
        System.out.println("An Empty constructor is called ");
    }

    public VipCustomer(String name,double creditLimit){
        this(name,creditLimit,"ABCD@abcdmail.com");
        System.out.println("A constructor with default email id is called. "+name );

    }
    public VipCustomer(String name,double creditLimit,String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
