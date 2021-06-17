package com.flowstatements;

public class Dog extends Animals{
    // fields exclusively related to dog only.
    // using Inheritance we can make a powerful class using features from a Super class(animals ).
    private int eyes;
    private String  coat;
    private int teeth;
    private int tail;




    // A default constructor is needed for Dog class

    public Dog(String name, int legs, int weight,int eyes,int teeth, int tail,String coat) {
        super(name, 1,1, legs, weight );
        //super(name, brain, size, legs, weight);
        // initialising the fields specefic to dog in constructor
        this.eyes = eyes;
        this.teeth = teeth;
        this.tail= tail;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() is called");
    }
    // overwriting a method in java


    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();

    }

    public void walk(){
        System.out.println("Dog.walk () is callled");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() is called ");
        move(10);
    }

    public void movelegs(){
        System.out.println("moveLEgs is called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() is called ");
        movelegs();
        super.move(10);
    }
}
