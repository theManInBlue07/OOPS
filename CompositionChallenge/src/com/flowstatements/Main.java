package com.flowstatements;

public class Main {

    public static void main(String[] args) {
	TV newTV = new TV("One Plus TV ");
	Refrigerator myFridge = new Refrigerator("Chicken ",5,"Mango Shake");
	Bed myBed = new Bed("Flowers",2);

	Room myRoom = new Room(myBed,newTV,myFridge);
	myRoom.thefridge();
	myRoom.turnOnTV();
	myRoom.getBed().BedSheetChange("Voilet");


    }
}
