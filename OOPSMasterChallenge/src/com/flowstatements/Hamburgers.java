package com.flowstatements;

public class Hamburgers {
    private String name;
    private String breadRollType;
    private boolean meat;
    private double price;

    private String additional1name;
    private Double additional1price;

    private String additional2name;
    private Double additional2price;

    private String additional3name;
    private Double additional3price;

    private String additional4name;
    private Double additional4price;


    public Hamburgers(String name, String breadRollType, boolean meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void additional1item(String name, double price){
        this.additional1name=name;
        this.additional1price=price;
    }
    public void additional2item(String name, double price){
        this.additional2name=name;
        this.additional2price=price;
    }
    public void additional3item(String name, double price){
        this.additional3name=name;
        this.additional3price=price;
    }
    public void additional4item(String name, double price){
        this.additional4name=name;
        this.additional4price=price;
    }

    public double itemizeHambureger(){
        double hamburegerPrice = this.price;
        System.out.println("this hamburger =="+this.name+" with a bread roll type =="+this.breadRollType+
                " has a price of =="+this.price+ " without any added additional item.");
        if(additional1name != null){
            hamburegerPrice += additional1price;
            System.out.println("Added "+this.additional1name+" for an extra price of "+this.additional1price);
        }
        if(additional2name != null){
            hamburegerPrice+= additional2price;
            System.out.println("Added "+this.additional2name+" for an extra price of "+this.additional2price);
            
        }
        if(additional3name != null){
            hamburegerPrice+= additional3price;
            System.out.println("Added "+this.additional3name+" for an extra price of "+this.additional3price);

        }
        if(additional4name != null){
            hamburegerPrice+= additional4price;
            System.out.println("Added "+this.additional4name+" for an extra price of "+this.additional4price);

        }
        System.out.println("Total amount to be paid == "+hamburegerPrice);
        return hamburegerPrice;
    }


}
