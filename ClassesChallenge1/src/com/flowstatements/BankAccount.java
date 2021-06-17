package com.flowstatements;

import java.sql.SQLOutput;

public class BankAccount {
    private String AccountNumber;
    private  double Balance;
    private String CustomerName;
    private String PhoneNumber;
    private String Email;

    // Making my own constructor
    public BankAccount(){// like methods a constructor can be overloaded as well.
        this("123654",25.00,"default Name ","default Phone Number","abc@ghmail.com");
        System.out.println("empty constructor called ");
    }
    public BankAccount(String AccountNumber, double balance,String CustomerName,
                       String PhoneNumber,String Email){
        this.AccountNumber =AccountNumber;
        this.Email =Email;
        this.Balance= balance;
        this.CustomerName = CustomerName;
        this.PhoneNumber = PhoneNumber;
    }// major constructor could be used again and again in other constructors to stop duplicating of the code.

    public BankAccount(double balance, String customerName, String phoneNumber) {
        this("Ac?number 0000",balance,customerName,phoneNumber,"default@xxxyyy.com");
        // using the major constructor we are automatically updating the Ac # and Email.
    }

    public void depositAmount(double depositAmount){
        Balance  +=depositAmount;
        System.out.println(CustomerName+" your Updated Balance for the account number "+ AccountNumber+" after the deposit of "+depositAmount +" is "+Balance);
    }

    public void withdrawAmount(double withdrawAmount){
        if(Balance-withdrawAmount<0){
            System.out.println("Invalid Withdraw Amount Entered ");
        }else{
            Balance -= withdrawAmount;
            System.out.println(CustomerName+" your Updated Balance for the account number "+ AccountNumber+" after the withdrawl of"+withdrawAmount +" is "+Balance);
        }
    }




    public String getAccountNumber() {
        System.out.println("Congratulations "+CustomerName+" your New Account Number is "+AccountNumber);
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

//    public String FinalDetails(String finalDetails){
//        String name = CustomerName;
//        String phone = PhoneNumber;
//        String email = Email;
//        String AcNumber = AccountNumber;
//        Double balance = Balance;
//        System.out.println(CustomerName);
//        System.out.println(PhoneNumber);
//        System.out.println(Email);
//        System.out.println(AccountNumber);
//        System.out.println(Balance);
//        return finalDetails;
//    }

}
