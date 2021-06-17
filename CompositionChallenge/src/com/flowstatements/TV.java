package com.flowstatements;

public class TV {

    private String Manufacturer;

    public TV(String manufacturer) {

        this.Manufacturer = manufacturer;
    }

    public void turnItup(Boolean input){
        if(input){
            System.out.println("TV is ON .");
        }
    }






    public String getManufacturer() {
        return Manufacturer;
    }
}
