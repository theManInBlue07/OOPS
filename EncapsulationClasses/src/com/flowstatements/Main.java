package com.flowstatements;

public class Main {

    public static void main(String[] args) {
	Player Satyam = new Player("satyam",100,"Akk47");
	Satyam.loosehealth(80);
	Satyam.remainingHealth();
		System.out.println("the updated health at end is =="+Satyam.getHealth());

    }
}
