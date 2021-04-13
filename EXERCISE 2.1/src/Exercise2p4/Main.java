package Exercise2p4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop Apple = new Laptop();
		Laptop HP = new Laptop();
		Laptop Huawei = new Laptop();
		
		System.out.println("Apple Laptop ");
		System.out.println("-----------------------------");
		Apple.setBrand("Apple");
		Apple.setModel("MacBook Pro");
		Apple.setDisplaysize(16);
		Apple.setProcessortype("Intel Core i7");
		Apple.setCommunicate("can communicate with other people");
		Apple.setSearch("searching some information from the net");
		Apple.setEntertain("play game, watch films, doenload music from the net");
		
		System.out.println("Brand : " + Apple.getBrand());
		System.out.println("Model : " + Apple.getModel());
		System.out.println("Display size : " + Apple.getDisplaysize());
		System.out.println("Processor Type : " + Apple.getProcessortype());
		System.out.println("Function for communication is " + Apple.getCommunicate());
		System.out.println("Function for search is " + Apple.getSearch());
		System.out.println("Function for Entertain is " + Apple.getEntertain());
		
		System.out.println();
		
		System.out.println("HP Laptop ");
		System.out.println("-----------------------------");
		HP.setBrand("HP");
		HP.setModel("Pavilion 15");
		HP.setDisplaysize(15.6);
		HP.setProcessortype("Intel Core i5");
		HP.setCommunicate("can communicate with other people");
		HP.setSearch("searching some information from the net");
		HP.setEntertain("play game, watch films, doenload music from the net");
		
		System.out.println("Brand : " + HP.getBrand());
		System.out.println("Model : " + HP.getModel());
		System.out.println("Display size : " + HP.getDisplaysize());
		System.out.println("Processor Type : " + HP.getProcessortype());
		System.out.println("Function for communication is " + HP.getCommunicate());
		System.out.println("Function for search is " + HP.getSearch());
		System.out.println("Function for Entertain is " + HP.getEntertain());
		
		System.out.println();
		
		System.out.println("Huawei Laptop ");
		System.out.println("-----------------------------");
		Huawei.setBrand("Huawei");
		Huawei.setModel("Matebook D15");
		Huawei.setDisplaysize(15.6);
		Huawei.setProcessortype("AMD Ryzen 5");
		Huawei.setCommunicate("can communicate with other people");
		Huawei.setSearch("searching some information from the net");
		Huawei.setEntertain("play game, watch films, doenload music from the net");
		
		System.out.println("Brand : " + Huawei.getBrand());
		System.out.println("Model : " + Huawei.getModel());
		System.out.println("Display size : " + Huawei.getDisplaysize());
		System.out.println("Processor Type : " + Huawei.getProcessortype());
		System.out.println("Function for communication is " + Huawei.getCommunicate());
		System.out.println("Function for search is " + Huawei.getSearch());
		System.out.println("Function for Entertain is " + Huawei.getEntertain());

	}

}
