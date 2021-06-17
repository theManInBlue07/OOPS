package com.flowstatements;

import java.sql.SQLOutput;

public class vehicle {
   private String name;
   private  String size;

   private int currentVelocity;
   private int currentDirection;

    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection=0;
        this.currentVelocity=0;
    }
    public void steer(int direction ){
        this.currentDirection += direction;
        System.out.println("vehicle.steer(): Steer at "+currentDirection+" degrees.");
    }
    public void move(int velocity,int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("vehicle.move();: Moving in "+currentDirection+" degrees, with the speed of "
                +currentVelocity);
    }
    public void Stop(){
        System.out.println("Vehicle.stop :: STOP");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
