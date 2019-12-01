package com.skilldistillery.jets;

public class FighterJet extends Jet {
	// F I E L D S

	// C O N S T R U C T O R S
	public FighterJet(String model, double speed, double range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	// M E T H O D S
	@Override
	public void fight() {
		System.out.println("FIGHTER JET: " + super.getModel() + " PREPPING FOR FLIGHT");
		super.fly();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("ENEMY FIGHTER SPOTTED");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("MANEUVERING TO ENGAGE");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("REQUESTING PERMISSION TO FIRE");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~ PERMISSION GRANTED ~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("FIRING ~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		boolean fight = true;
		while (fight) {
			int chance = (int) (Math.random() * 11);
			if (chance <= 5) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("YOU'VE BEEN SHOT DOWN BY THE ENEMY");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				fight = false;
			} else {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("YOU'VE OVERCOME THE ENEMY!");
				System.out.println("GOOD JOB PILOT!");
				fight = false;
			}

		}
		System.out.println();

	}

}
