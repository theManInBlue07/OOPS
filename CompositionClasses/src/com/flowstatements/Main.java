package com.flowstatements;

public class Main {

    public static void main(String[] args) {
    Dimensions dimensions = new Dimensions(25,25,10);
    Case newCase = new Case("552A","Apple","258V",dimensions);

    Monitor theMonitor = new Monitor("Apple222B","Apple",2160,new Resolution(2160,1080));
    Motherboard motherboard = new Motherboard("Apple I MAC","Apple",2,2,
            "Macintosh Processor");
    PC ApplePC = new PC(newCase,theMonitor,motherboard);
    // using the draw pixel at method in main with Class PC.
   // ApplePC.getMonitor().drawPixelAt(54,97,"voliet");


    //ApplePC.getMotherboard().loadProgram("GOOGLE ");
    //
        //ApplePC.getTheCase().pressPowerButton();
ApplePC.powerUp();
ApplePC.rumProgram();
    }
}


// Composition in OOPS work on ( has a relationship ). ex:- Computer has a Motherboard
// unlike Inheritance work on (is a ) relationship. ex:- Car is a Vehicle. LandCrusier is a Car which is a vehicle.
