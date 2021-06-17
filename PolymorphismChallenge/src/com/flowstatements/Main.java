package com.flowstatements;
class Car{
    private String name;
    private String engine;
    private int cylinders;
    private int wheels;
    private int seats;



    public Car(String name, String engine, int cylinders, int seats) {

        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.seats = seats;
        this.wheels=4;
    }

    public String startEngine(){
        return "The engine of "+name+" has strted";
    }
    public String accelerate(){
        return "The foot is on the pedal ."+"\n"+"The "+engine+"& "+cylinders+" cylinders are working and accelerating the Car";
    }
    public String brake(){
        return "Brake applied , STOP.";
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }



}

class LandCruiser extends Car{
    public LandCruiser() {
        super("Land Cruiser", "turbo V5",4 , 7);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
class Bentley extends Car{
    public Bentley() {
        super("Bentley Continental GT", "turbo V8", 6, 4);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
class Ciaz extends Car{
    public Ciaz() {
        super("Ciaz", "1400 CC V2", 2, 4);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
class UselessCar extends Car{
    public UselessCar() {
        super("useless", "Useless", 0, 0);
    }
    // No methods here
}



public class Main {

    public static void main(String[] args) {
	for(int i = 0;i<10;i++){
	    Car car = randomCar();
        System.out.println("Random number =="+i+"\n"+
                            "Car name =="+car.getName()+"\n"+"car Engine =="+car.getEngine()+"\n"+
                car.startEngine()+"\n"+
                car.accelerate()+"\n"+car.brake());

    }
    }
    public static Car randomCar(){
        int randomNumber =(int)(Math.random()*4)+1;
        switch (randomNumber){
            case 1:
                return new LandCruiser();
            case 2:
                return new Bentley();
            case 3:
                return new Ciaz();
            case 4:
                return new UselessCar();
        }
        return null;
    }
}
