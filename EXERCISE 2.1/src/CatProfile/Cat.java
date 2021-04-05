package CatProfile;

public class Cat {
	String Breed;
	String Colour;
	char Size;
	char coat;
	
	void printChar(String B, String C, char S, char c) {
		System.out.println("Breed :" + B);
		System.out.println("Colour :" + C);
		System.out.println("Size :" + S);
		System.out.println("Coat :" + c);
	}
	
	void calcDailyFood(int g, int times) {
		int t = g * times;
		System.out.println("Cat eat " + t + "g of cat food a day.");
	}
	
	void calcWeight(int w, int n) {
		int totalweight = w*n;
		System.out.println("Total weight for " + n + " cat of this type is " + totalweight + "kg.");
	}
	
	void calcPrice(int p, int n) {
		int t = p*n;
		System.out.print("Total price for " + n + " cat of this type is RM" + t + ".");
	}


}
