package Exercise2p3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse GoldenHamster = new Mouse();
		Mouse Roborovskii = new Mouse();
		Mouse Chinchilla = new Mouse();
		Mouse SugarGlider = new Mouse();
		
		System.out.println("Golden Hamster Characteristic");
		GoldenHamster.printChar();
		GoldenHamster.TypeOfTail();
		GoldenHamster.CostOfFood();
		GoldenHamster.calcPrice();

		System.out.println();
		System.out.println("-----------------------------------------");
		
		System.out.println("Roborovskii Characteristic");
		Roborovskii.printChar();
		Roborovskii.TypeOfTail();
		Roborovskii.CostOfFood();
		Roborovskii.calcPrice();
		
		System.out.println();
		System.out.println("-----------------------------------------");
		
		System.out.println("Chinchilla Characteristic");
		Chinchilla.printChar();
		Chinchilla.TypeOfTail();
		Chinchilla.CostOfFood();
		Chinchilla.calcPrice();
		
		System.out.println();
		System.out.println("-----------------------------------------");
		
		System.out.println("Sugar Glider Characteristic");
		SugarGlider.printChar();
		SugarGlider.TypeOfTail();
		SugarGlider.CostOfFood();
		SugarGlider.calcPrice();
	}

}
