package com.flowstatements;

public class Car extends vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private Boolean isManual;


    private int currentGears;

    public Car(String name, String size, int wheels, int doors, int gears, Boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;

        this.currentGears = 1;

    }



    public void changingGears(int currentGears) {

        this.currentGears = currentGears;
        System.out.println("setCurrentGears is called:Gear is change to " + currentGears + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("changeVelocity : Moving at speed of "+speed+" in direction "+direction+" degrees. ");
    }


}








