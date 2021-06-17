package com.flowstatements;

public class Main {

    public static void main(String[] args) {
	Animals default1 = new Animals("default",1,1,6,6);
	Dog doggy1 = new Dog("Shaggy",4,35,2,40,1,"Mid Silky coat");
        //System.out.println(doggy1.getBrain());
        // using animal class eat method
       // doggy1.eat();

    //using dog class overwritten eat method.
    //  doggy1.eat();
    //doggy1.run();
    //doggy1.walk();


    Fish nemo = new Fish("Nemo",0,10,2,4,10);
    nemo.move(5);
    //nemo.swim(5);

    }
}
