package com.flowstatements;

import java.util.Locale;

public class Car {
    // Fields / Member variables in Java
    // State of the Software object
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
// creating a new method in java
    // setter
    // Validating the type of data we want to use inside out Model --> using the concept of encapsulation.
    // so that no data or object or type of variable can effect our class processing.
    public void setModel(String model){
        String ValidateModel  = model.toLowerCase();
        if(ValidateModel.equals("continental gt") || ValidateModel.equals("720d")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }
    // getter
    public String getModel(){
        return this.model;
    }


}
