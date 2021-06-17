package com.flowstatements;

public class Main {

    public static void main(String[] args) {
    Hamburgers newHam =new Hamburgers("Basic","italian",true,35.00);
    newHam.itemizeHambureger();
    HealthyBruger healthy1 = new HealthyBruger(52.00);
    //healthy1.itemizeHambureger();// through polymorphism itemize bureger works for healthy Burger.
    healthy1.addHealthy1item("egg",10.00);
    healthy1.itemizeHambureger();

    DeluxeHambureger dhb = new DeluxeHambureger(45.23);
    dhb.itemizeHambureger();
    }
}
