package tns.tnsif.hierarchical.inheritance;

public class Person {
	
	private String Name;
	private String city;
	
	//default constructor
	
	public Person() {
		System.out.println("person class defualt value ");
		name="Amit";
		city="name";
		
		
	}
	//parameterized con

	public Person(String name, String city) {
		super();
		Name = name;
		this.city = city;
	}
	//non para
	public Person() {
		super();
	}
	
	

}
