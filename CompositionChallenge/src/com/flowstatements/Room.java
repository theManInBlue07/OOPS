package com.flowstatements;

public class Room {
    private Bed bed;
    private TV tv;
    private Refrigerator fridge;

    public Room(Bed bed, TV tv, Refrigerator fridge) {
        this.bed = bed;
        this.tv = tv;
        this.fridge = fridge;
    }
    public void turnOnTV(){
        tv.turnItup(true);
        welcomeMessage();
    }
    private void welcomeMessage(){
        System.out.println("The TV named "+tv.getManufacturer()+" is on.");
    }
    public void thefridge(){
        fridge.OpenFridge();
        additem("Curd");

    }
    private void additem(String item){
        System.out.println("The item "+item+" can be added");
    }

//    //public void theSHeets(){
//        bed.BedSheetChange("Red");
//    }


    public Bed getBed() {
        return bed;
    }

    public TV getTv() {
        return tv;
    }

    public Refrigerator getFridge() {
        return fridge;
    }
}
