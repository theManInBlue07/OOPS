package com.flowstatements;

public class DeluxeHambureger extends Hamburgers{
    private Boolean Chips;
    private double ChipsPrice;
    private Boolean Cola;
    private double ColaPrice;

    public DeluxeHambureger( double price) {
        super("Deluxe HamBurger", "Oreganic Bread", true, price);
        super.additional1item("Chips",15.00);
        super.additional2item("Cola",20.00);
    }
// but we do not want to add anything in our burger except Chipa nd cola.
    // overwriting the methods


    @Override
    public void additional1item(String name, double price) {
        System.out.println("Cannot add any further item ");
    }

    @Override
    public void additional2item(String name, double price) {
        System.out.println("Cannot add any further item ");
    }

    @Override
    public void additional3item(String name, double price) {
        System.out.println("Cannot add any further item ");
    }

    @Override
    public void additional4item(String name, double price) {
        System.out.println("Cannot add any further item ");
    }
}
