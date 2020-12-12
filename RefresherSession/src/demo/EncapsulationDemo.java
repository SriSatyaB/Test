package demo;

public class EncapsulationDemo {
	//Encapsulation implementation
	
	//private variables can not be accessed from outside of the class
	
	private String EmpName;//private variables
	private int EmpId;
	
	//getters and setters : to set and get the values of private variables.
	
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	
	
	
	

}
