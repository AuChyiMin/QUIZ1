package Exercise2p3;

import java.util.*;

public class Mouse {
	
	Scanner sc = new Scanner (System.in);
	
	void printChar() {
		System.out.println("Enter Breed, Colour, Size and Coat: ");
		String b = sc.nextLine();
		String c = sc.nextLine();
		char s = sc.next().charAt(0);
		char C = sc.next().charAt(0);
		
		System.out.println("Breed : " + b);
		System.out.println("Colour :" +c);
		System.out.println("Size :" +s);
		System.out.println("Coat :" +C);
	}
	
	void TypeOfTail() {
		System.out.println("Is it a long-tailed mouse?");
		if (sc.nextBoolean()== true) {
			System.out.println("It has long tail.");
		}
		else {
			System.out.println("It has short tail.");
		}
	}
	
	void CostOfFood() {
		String f = sc.next();
		double price = sc.nextDouble(); 
		double total = price/30; 
		switch (f) {
		case "fruits" :System.out.println("It like to eat " + f + ".");
				 	   System.out.printf("Cost of food for a day is RM%.2f", total);
				 	   break;
		case "insects" :System.out.println("It like to eat " + f + ".");
				 		System.out.printf("Cost of food for a day is RM%.2f", total);
				 		break;
		case "grains" :System.out.println("It like to eat " + f + ".");
				 	   System.out.printf("Cost of food for a day is RM%.2f", total);
				 	   break;
		}

	}
	
	void calcPrice() {
		double price = sc.nextDouble();
		int n = sc.nextInt();
		double total = price*n;
		System.out.printf("Total price for " + n + " cat of this type is RM%.2f", total);
	}

}
