package tns.tnsif.hierarchical.inheritance;

public class Employee extends Person {
	
	//data members
	
	private int empId;
	private float salary;
	private String Dept;
	
	public Employee() {
		
		System.out.println("emp class default constructor ");
		empId=100;
		salary=2000000f;
		dept="IT";
	}
//para
	public Employee(int empId, float salary, String dept) {
		super( empId, salary, dept);
		this.empId = empId;
		this.salary = salary;
		Dept = dept;
	}
	//non para
   public Employee() {
	super();
}
   //getter setter
   public int getEmpId() {
	return empId;
   }
   public void setEmpId(int empId) {
	this.empId = empId;
   }
   public float getSalary() {
	return salary;
   }
   public void setSalary(float salary) {
	this.salary = salary;
   }
   public String getDept() {
	return Dept;
   }
   public void setDept(String dept) {
	Dept = dept;
   }
	
   
   
	

}
