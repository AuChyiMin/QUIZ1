
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat Bombay = new Cat();
		Cat Ragdoll = new Cat();
		Cat Calico = new Cat();	

		Bombay.Breed = "Bombay";
		Bombay.Colour = "Black";
		Bombay.Size = "Medium";
		Bombay.Coat = "Short";
		
		Ragdoll.Breed = "Ragdoll";
		Ragdoll.Colour = "White-pointy";
		Ragdoll.Size = "Medium";
		Ragdoll.Coat = "Long";
		
		Calico.Breed = "Calico";
		Calico.Colour = "Tri-colour";
		Calico.Size = "Medium";
		Calico.Coat = "Short";
		
		System.out.println("Breed \t:" + Bombay.Breed );
		System.out.println("Colour \t:" + Bombay.Colour); 
		System.out.println("Size \t:" + Bombay.Size);
		System.out.println("Coat \t:" + Bombay.Coat + "\n");

		Bombay.walk();
		Bombay.eat();
		Bombay.sleep();
		Bombay.climb();		
		
		System.out.println();
		
		System.out.println("Breed \t:" + Ragdoll.Breed );
		System.out.println("Colour \t:" + Ragdoll.Colour); 
		System.out.println("Size \t:" + Ragdoll.Size);
		System.out.println("Coat \t:" + Ragdoll.Coat + "\n");
		
		Ragdoll.walk();
		Ragdoll.eat();
		Ragdoll.sleep();
		Ragdoll.climb();
		
		System.out.println();
		
		System.out.println("Breed \t:" + Calico.Breed );
		System.out.println("Colour \t:" + Calico.Colour); 
		System.out.println("Size \t:" + Calico.Size);
		System.out.println("Coat \t:" + Calico.Coat + "\n");
		
		Calico.walk();
		Calico.eat();
		Calico.sleep();
		Calico.climb();

	}

}
