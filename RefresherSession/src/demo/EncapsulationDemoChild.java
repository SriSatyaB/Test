package demo;

public class EncapsulationDemoChild extends EncapsulationDemo{
	
	
	//here we accessing the private variables of EncapsulationDemo class from EncapsulationDemoChild class 
	//using setters and getters.
	
	public static void main(String[] args) {
		
		EncapsulationDemo ed=new EncapsulationDemo();
		ed.setEmpId(111223);
		ed.setEmpName("pradeep");
		System.out.println("emp id is"  +  ed.getEmpId());
		System.out.println("emp name is"  + ed.getEmpName());
 
 }
	
		
		
	
}

