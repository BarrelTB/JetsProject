package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	// F I E L D S
	
	private Airfield airfield;
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		
		app.launch();
		app.displayUserMenu();

	}
	public void launch() {
		airfield = new Airfield();
	}
	
	public void displayUserMenu() {
		
		System.out.println("                        Please choose from the following menu: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1: List All Jets In Fleet");
		System.out.println("2: Fly All Jets");
		System.out.println("3: View Fastest Jet");
		System.out.println("4: View Jet With Longest Range");
		System.out.println("5: Load All Cargo Planes");
		System.out.println("6: Dogfight!");
		System.out.println("7: Add A Jet To The Fleet");
		System.out.println("8: Remove A Jet From The Fleet");
		System.out.println("9: Quit The Program : Any Number Chosen Besides Those Listed Result In Quitting The Program");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		while(!kb.hasNextInt()) {
			System.out.println("That is not a valid choice.");
			System.out.println("Please enter a valid choice 1-9.");
			kb.nextLine();
		}
		int userInput = kb.nextInt();
		kb.nextLine();
		switch (userInput) {
			case 1:
				listFleet();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				fastestJet();
				break;
			case 4:
				longestRange();
				break;
			case 5:
				loadCargos();
				break;
			case 6:
				dogFight();
				break;
			case 7:
				addJet();
				break;
			case 8:
				removeJet();
				break;
			case 9:
			default:
				exitProgram();
				break;
					
		}
		
		
	}
	public void listFleet() {
		airfield.listJets();
		displayUserMenu();
		
	}
	public void flyAllJets() {
		airfield.flyAllJets();
		displayUserMenu();
		
	}
	
	public void fastestJet() {
		airfield.fastestJet();
		displayUserMenu();
	}
	public void longestRange() {
		airfield.longestRange();
		displayUserMenu();
	}
	public void loadCargos() {
		airfield.loadCargos();
		displayUserMenu();
	}
	public void dogFight() {
		airfield.listJets();
		System.out.println("Please input which jet you would like to fight via Jet Number: ");
		while(!kb.hasNextInt()) {
			System.out.println("That is not a valid choice.");
			System.out.println("Please enter a valid choice.");
			kb.nextLine();
		}
		int choice = kb.nextInt();
		kb.nextLine();
		airfield.dogFight(choice - 1);
		displayUserMenu();
	}
	public void addJet() {
		System.out.println("Would you like to add a Jet? [Yes] [No]");
		String uChoice1 = kb.next();
		if (uChoice1.equals("Yes")) {
			System.out.println("Would you like to add a [Regular] Jet, [Fighter] Jet or a [Cargo] Jet?");
			String uChoice2 = kb.next();
			if (uChoice2.equals("Regular") || uChoice2.equals("Regular")) {
				System.out.println("Please enter a model: ");
				String uModel = kb.next();
				System.out.println("Please enter a speed: ");
				double uSpeed = kb.nextDouble();
				kb.nextLine();
				System.out.println("Please enter a range: ");
				double uRange = kb.nextDouble();
				kb.nextLine();
				System.out.println("Please enter a price: ");
				long uPrice = kb.nextLong();
				kb.nextLine();
				JetImpl uJet = new JetImpl(uModel, uSpeed, uRange, uPrice);
				airfield.addJet(uJet);	
			}
			if (uChoice2.equals("Fighter") || uChoice2.equals("fighter")) {
				System.out.println("Please enter a model: ");
				String uModel = kb.next();
				System.out.println("Please enter a speed: ");
				double uSpeed = kb.nextDouble();
				kb.nextLine();
				System.out.println("Please enter a range: ");
				double uRange = kb.nextDouble();
				kb.nextLine();
				System.out.println("Please enter a price: ");
				long uPrice = kb.nextLong();
				FighterJet uJet = new FighterJet(uModel, uSpeed, uRange, uPrice);
				airfield.addJet(uJet);	
			}
			if (uChoice2.equals("Cargo") || uChoice2.equals("cargo")) {
				System.out.println("Please enter a model: ");
				String uModel = kb.next();
				System.out.println("Please enter a speed: ");
				double uSpeed = kb.nextDouble();
				kb.nextLine();
				System.out.println("Please enter a range: ");
				double uRange = kb.nextDouble();
				kb.nextLine();
				System.out.println("Please enter a price: ");
				long uPrice = kb.nextLong();
				CargoPlane uJet = new CargoPlane(uModel, uSpeed, uRange, uPrice);
				airfield.addJet(uJet);	
			}
			
		} else {
			displayUserMenu();
		}
		displayUserMenu();
	}
	public void removeJet() {
		airfield.listJets();
		System.out.println("Please enter the number of the Jet you would like to remove: ");
		int uRemove = kb.nextInt();
		kb.nextLine();
		airfield.removeJet(uRemove - 1);
		System.out.println("Jet " + uRemove + " has been removed.");
		displayUserMenu();
	}
	public void exitProgram() {
		System.out.println("Thank you for playing!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Programmer: Caleb Whitford");
		System.out.println("Donations can go to: Teachers of SkillDistillery");
		
	}

}
