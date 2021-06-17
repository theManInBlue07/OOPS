package com.flowstatements;

public class Motherboard {
    private String model;
    private String maufacturer;
    private int ramSLots;
    private int cardSlots;
    private String  bios;

    public Motherboard(String model, String maufacturer, int ramSLots, int cardSlots, String bios) {
        this.model = model;
        this.maufacturer = maufacturer;
        this.ramSLots = ramSLots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programmName){
        System.out.println("the program named "+programmName+" is loading now.. ");
    }

    public String getModel() {
        return model;
    }

    public String getMaufacturer() {
        return maufacturer;
    }

    public int getRamSLots() {
        return ramSLots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
