package com.flowstatements;

public class Monitor {
    private String model;
    private String manufacturer;
    private int resolution;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int resolution, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y , String colour){
        System.out.println(" The pixel is drawn at "+x+","+y+" in colour == "+colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getResolution() {
        return resolution;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
