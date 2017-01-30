package fortuneteller;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		
		String firstName;
		String lastName;
		int age = 0;
		int siblings = 0;
		String birthMonth = "October";
		String color = "Blue";
		int retireYears = 0;
		double retirementFund = 0.0d;
		String vacationHome = "Michigan";
		String transportation = "SUV";
		String playAgain = " ";
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			System.out.println("What is your first name?");
			firstName = scanner.next();
			
			System.out.println("What is your last name?");
			lastName = scanner.next();
			
			System.out.println("How old are you?");
			age = scanner.nextInt();
			
			System.out.println("How many siblings do you have?");
			int numberSiblings = scanner.nextInt();
			
			System.out.println("In what month you were born?\n\n"
					+ "Please enter your full birth month"
					+ "\n January/February/March"
					+ "\n April/May/June"
					+ "\n July/August/September"
					+ "\n October/November/December");
			birthMonth = scanner.next().toLowerCase();
			
			System.out.println("Which of the ROYGBIV color is your favourite?\n "
							+ "if you dont know what ROYGBIV is, enter \"Help\"");
			color = scanner.next().toUpperCase();
			
			
			//if users age is even or odd
			if (age % 2 == 0) {
				retireYears = 25;
			}else {
				retireYears = 15;
			}
			
			// users siblings
			if(siblings == 0) {
				vacationHome = "Michigan";
			}else if (siblings == 1) {
				vacationHome = "San Diego";
			}else if (siblings == 2) {
				vacationHome = "Indiana";
			}else if (siblings == 3) {
				vacationHome = "Las Vegas";
			}else if (siblings > 3) {
				vacationHome = "Denver";
			}
			
			// users favorite color
			switch (color) {
			case "HELP":
				System.out.println("\n Please enter a letter of your Favorite Color"
						+ " \nR for Red \nO for Orange \nY for Yellow"
						+ "\nG for Green \nB for Blue \nI for Indigo \nV for Violet");
				color = scanner.next().toUpperCase();
				
				//compares the color user choose on a help menu.
				 if (color.equals("R")) {
					 transportation = "Bus";
				 }else if (color.equals("O")) {
					 transportation = "Plane";
				 }else if (color.equals("Y")) {
					 transportation = "Sedan";
				 }else if (color.equals("G")) {
					 transportation = "Motorcycle";
				 }else if (color.equals("B")) {
					 transportation = "Lexus";
				 }else if (color.equals("I")) {
					 transportation = "Boat";
				 }else if (color.equals("V")) {
					 transportation = "Private Jet";
				 }else{
					 transportation = "SUV";
				 }
				
				break;
				
			case "R": transportation = "Bus";
			break;
				
			case "O": transportation = "Plane";
			break;
			
			case "Y": transportation = "Sedan";
			break;
			
			case "G": transportation = "Motorcycle";
			break;
			
			case "B": transportation = "Lexus";
			break;
			
			case "I": transportation = "Boat";
			break;
			
			case "V": transportation = "Private Jet";
			break;
			
			default: transportation = "SUV";
				break;
			}
			
			//if first, second or third letter 
			//of a birth month is contained in either first name or last name
			
			String fullName = firstName + lastName;
		
			if(fullName.contains(birthMonth.substring(0,1))) {
				retirementFund = 5000;
			}else if(fullName.contains(birthMonth.substring(1,2))){
				retirementFund = 12000;
			}else if(fullName.contains(birthMonth.substring(2,3))){
				retirementFund = 450000;
			}else{
				retirementFund = 60000;
			}
			
			
			
			System.out.println("\n\n" + firstName + " " + lastName
					+ " will retire in " + retireYears + " Years\n"
					+ "with $ " +  retirementFund + " in the bank\n"
					+ "A vacation home in " + vacationHome + " and a " + transportation + ".\n\n");
			
			System.out.println("Would you like to play again? "
					+ "Enter Yes to continue or enter any Key to quit.");
			playAgain = scanner.next();
			
			
		}while(playAgain.equalsIgnoreCase("Yes"));
		System.out.println("Goodbye");
		
		scanner.close();
		
	}

}    	