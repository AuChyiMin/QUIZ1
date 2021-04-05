package Exercise22;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat Bombay = new Cat();
		Cat Ragdoll = new Cat();
		Cat Iriomote = new Cat();	
		Cat Caracal = new Cat();
		
		System.out.println("Bombay Characteristic");
		Bombay.printChar("Bombay","Black", 'M', 'S');
		Bombay.calcDailyFood(100,3);
		Bombay.calcWeight(7, 8);
		Bombay.calcPrice(2800, 2);
		System.out.println("\n---------------------------");
		System.out.println();
		
		System.out.println("Ragdoll Characteristic");
		Ragdoll.printChar("Ragdoll", "White-pointy", 'M', 'L');
		Ragdoll.calcDailyFood(120, 3);
		Ragdoll.calcWeight(9, 6);
		Ragdoll.calcPrice(1200, 3);
		System.out.println("\n---------------------------");
		System.out.println();

		System.out.println("Iriomote Characteristic");
		Iriomote.printChar("Iriomote", "Brown with dark markings", 'B', 'S');
		Iriomote.calcDailyFood(200, 4);
		Iriomote.calcWeight(5, 5);
		Iriomote.calcPrice(20000, 4);
		System.out.println("\n---------------------------");
		System.out.println();
		
		System.out.println("Caracal Characteristic");
		Caracal.printChar("Ragdoll", "White-pointy", 'M', 'L');
		Caracal.calcDailyFood(250, 4);
		Caracal.calcWeight(12, 3);
		Caracal.calcPrice(28000, 2);

	}

}
