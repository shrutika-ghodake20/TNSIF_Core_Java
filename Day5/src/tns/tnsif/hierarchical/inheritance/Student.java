package tns.tnsif.hierarchical.inheritance;

public class Student extends Person{
	
	private String clas;
	private float percent;
	
	public Student() {
		System.out.println("student class defualt constructor ");
		class="FY";
		percentage=75f;
	}
	//para con
	public Student(String clas, float percent) {
		super();
		this.clas = clas;
		this.percent = percent;
	}
	
	//non para con
	public Student() {
		super();
	}
	
	//generate getter setter 
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	
	
	
	
	

}
