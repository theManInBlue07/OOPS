package com.flowstatements;
// using all the classes made til now in this class using Composition.
// As a PC has a monitor, motherboard,case.
// using composition we can extend to as many classes we want.
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    // Creating a public method to use the private fields

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Start Graphics like windows logo
        monitor.drawPixelAt(2500, 5400, "Grey");
    }
    public void rumProgram(){
        beginProgram();
        motherboard.loadProgram(" Apple I-Tunes");
        welcometext();
    }
    private void beginProgram(){
        System.out.println("The program starts soon");
    }
    private void welcometext(){
        System.out.println("Welcome to Apple I-Tunes");
    }

}
//Limitation of using inheritance .
// USing Inheritance we can only extend to one class. ex:- LandCruiser is only a car ; cannot be a car
// and a scooter at sametime.

// removing getters as they are private fields and can be used directly by the method






    // changing all the getters from public to private
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
    

//    public Case getTheCase() {
//        return theCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }


