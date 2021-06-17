package com.flowstatements;

public class Refrigerator {

    private String foodItem;
    private int waterBottles;
    private String beverages;

    public Refrigerator(String foodItem, int waterBottles, String beverages) {
        this.foodItem = foodItem;
        this.waterBottles = waterBottles;
        this.beverages = beverages;
    }
    public void OpenFridge(){
        System.out.println("open the fridge ");
        System.out.println(foodItem+" is the food item");
        System.out.println("the number of water bottles is "+waterBottles);
        System.out.println("the beverage item is "+beverages);
    }

    public String getFoodItem() {
        return foodItem;
    }

    public int getWaterBottles() {
        return waterBottles;
    }

    public String getBeverages() {
        return beverages;
    }
}
