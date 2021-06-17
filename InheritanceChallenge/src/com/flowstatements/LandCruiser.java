package com.flowstatements;

public class LandCruiser extends Car{
    private int roadServiceMonth;

    public LandCruiser(int roadServiceMonth) {
        super("Land Cruiser", "7 seater,4WD ", 5, 5, 7, false );
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate) {
    int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity==0){
        Stop();
        changingGears(1);
        }else if(newVelocity>0 && newVelocity<=20){
            changingGears(1);
        }else if(newVelocity>20 && newVelocity<=60){
            changingGears(2);
        }else if(newVelocity>60 && newVelocity<=80){
            changingGears(3);
        }else if (newVelocity>80 && newVelocity<=100){
            changingGears(4);
        }else if(newVelocity>100 && newVelocity<=140){
            changingGears(5);
        }else if (newVelocity>140 && newVelocity <200 ){
            changingGears(6);
        }else if(newVelocity == 200){
            System.out.println("Top Velocity attained ");
        }else{
            changingGears(-1);
            System.out.println("Land Cruiser is in reverse Gear");
        }


        if(newVelocity>0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
