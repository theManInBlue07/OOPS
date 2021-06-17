package com.flowstatements;

public class Animals {
    private String name;
    private int brain;
    private int body ;
    private int legs;
    private int weight;



    public Animals(String name, int brain, int body, int legs, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.legs = legs;
        this.weight = weight;
    }
    // methods unique to all animals
    public void eat(){
        System.out.println("Animal.eat() method is called");
    }
    public void move(int speed){
        System.out.println("Animal.move() is called . Animal is moving at "+speed);

    }


    // getters for all fields.
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return body;
    }

    public int getLegs() {
        return legs;
    }

    public int getWeight() {
        return weight;
    }
}
