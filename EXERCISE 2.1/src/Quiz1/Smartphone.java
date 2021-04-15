package Quiz1;

import java.util.*;

public class Smartphone {
	
	String brand;
	String model;
	String operatingsystem;
	String processortype;
	
	Scanner sc = new Scanner(System.in);
	
	public void setBrand() {
		System.out.println("Enter Brand : ");
		brand = sc.nextLine();
	}
	
	public void setModel() {
		System.out.println("Enter Model : ");
		model = sc.nextLine();
	}
	
	public void setOperatingsystem() {
		System.out.println("Enter Operating System : ");
		operatingsystem = sc.nextLine();
	}
	
	public void setProcessortype() {
		System.out.println("Enter Processor Type : ");
		processortype = sc.nextLine();
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getOperatingsystem() {
		return operatingsystem;
	}
	
	public String getProcessortype() {
		return processortype;
	}
	
	public void displayInfo() {
		setBrand();
		System.out.println("You entered " + this.getBrand());
		
		setModel();
		System.out.println("You entered " + this.getModel());
		
		setOperatingsystem();
		System.out.println("You entered " + this.getOperatingsystem());
		
		setProcessortype();
		System.out.println("You entered " + this.getProcessortype());
		
	}

}
