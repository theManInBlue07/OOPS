package com.flowstatements;

public class Main {

    public static void main(String[] args) {
	// creating a new object called Bentley using the class Car.
    Car Bentley = new Car();
    Car BMW = new Car();
    Bentley.setModel("Continental GT");

        System.out.println("The selected model in Bentley is "+Bentley.getModel()+".");
    BMW.setModel("720D");
        System.out.println("The selected model in BMW is "+BMW.getModel()+".");
    // Car
    Car Bentley1 = new Car();
    Bentley1.setModel("Flying Spur");
        System.out.println(Bentley1.getModel());
        // but this is not a good way to proceed as all the objects in a class should be private .
    }
}
