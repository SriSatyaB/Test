package demo;

public class InheritAppliance extends InheritanceDemo {
	InheritanceDemo id=new InheritanceDemo();
	String Employer;
	public void setEmp(String name) {
		id.EmpName = name;
	}
	public String getEmp() {
		Employer = id.EmpName;
		return Employer;
	}
	
	
	public static void main(String[] args) {
		InheritAppliance ia=new InheritAppliance();
		ia.setEmp("pradeep");
	System.out.println("employer name is" + ia.getEmp());
	
 
 }

}
