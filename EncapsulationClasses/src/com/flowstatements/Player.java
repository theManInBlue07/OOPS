package com.flowstatements;

public class Player {
    private String name;
    private int hitPoints;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if(health>0&&health<=100){
            this.hitPoints = health;
        }else{
            System.out.println("the given input for health is out of range ." +
                    "Health parameter for the player "+name+" should be between 0 to 100. ");
        }

        this.weapon = weapon;
    }
    public void loosehealth(int damage){
        hitPoints = hitPoints -damage;
        if(hitPoints <= 0){
            System.out.println("Player Knocked out");
        }
    }
    public void remainingHealth(){
        System.out.println("the remaining health is "+ hitPoints);
    }

    public int getHealth() {
        return hitPoints;
    }

}


// changing the health field to hitpoint using refractor .
// everything from health has been changed to hit points.
// even after the change we can still use the gethealth() getter without any problem .
// protecting the method or field from outside class and code like main class here.
//possible only with Encapsulation.


