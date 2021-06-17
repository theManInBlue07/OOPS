package com.flowstatements;

public class Bed {
    private String BedSheet;
    private int Pillows;

    public Bed(String bedSheet, int pillows) {
        BedSheet = bedSheet;
        Pillows = pillows;
    }
//    public void Bedding(String colour){
//        System.out.println(" The Bedding has a "+colour+ " colour.");
//    }
    public void BedSheetChange(String color){
        System.out.println("the bedsheet is of "+ BedSheet + "Pattern. ");
        System.out.println("the bed has "+Pillows+" pillows.");
        System.out.println("the bed set has "+color+ " colour.");
    }

    public String getBedSheet() {
        return BedSheet;
    }

    public int getPillows() {
        return Pillows;
    }
}
