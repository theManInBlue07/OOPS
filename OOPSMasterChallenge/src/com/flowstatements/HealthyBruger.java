package com.flowstatements;

public class HealthyBruger extends Hamburgers{

    public HealthyBruger( double price) {
        super("Healthy Burger", "Brown Rye bread Roll", true, price);
    }
    private String Healthy1itemName;
    private double Healthy1itemPrice;

    private String Healthy2itemName;
    private double Healthy2itemPrice;

    public void addHealthy1item(String name , double price){
        this.Healthy1itemName=name;
        this.Healthy1itemPrice=price;
    }
    public void addHealthy2item(String name,double price){
        this.Healthy2itemName=name;
        this.Healthy2itemPrice=price;
    }

    @Override
    public double itemizeHambureger() {
        double healthyHamburger = super.itemizeHambureger();
        if(Healthy1itemName != null ){
            healthyHamburger += Healthy1itemPrice;
            System.out.println("Added "+this.Healthy1itemName+" for an extra price of "+this.Healthy1itemPrice);
        }
        if(Healthy2itemName != null ){
            healthyHamburger += Healthy2itemPrice;
            System.out.println("Added "+this.Healthy2itemName+" for an extra price of "+this.Healthy2itemPrice);
        }
        System.out.println("Total amount to be paid =="+healthyHamburger);
        return healthyHamburger;

    }
}
