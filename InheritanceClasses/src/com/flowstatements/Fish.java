package com.flowstatements;

public class Fish extends Animals{
    private int eyes;
    private int gills;
    private int fins;

    public Fish(String name, int legs, int weight, int eyes, int gills, int fins) {
        super(name, 1, 1, legs, weight);
        this.eyes = eyes;
        this.gills = gills;
        this.fins = fins;
    }

    private void rest(){

    }
    private void moveMuscles(){
        System.out.println("moveMuscles is called");
    }
    private void moveBackFin(){
        System.out.println("moveBackFin is called ");

    }
    private void swim(int speed){
        System.out.println("swim method is called");
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    @Override
    public void move(int speed) {
        swim(speed);
        super.move(speed);
    }

}
