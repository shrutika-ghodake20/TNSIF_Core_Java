package tns.tnsif.hierarchical.inheritance;

public class hierarchicalDriver {
	
	public static void main(String[] args) {
		 
		Person p1=new Person();
		System.out.println("-------person details--------");
		System.out.println(p1);
		
		
		//to create student object
		
		//Student s=new Student();
		Person p;
		p=new Person("shrutika", "Pune");//used dyamic binding i can save my memory space
		System.out.println("personal detailas  "+p);
		
		p=new Student ("Sunil", "Nashik", "SY", 69.89f);
		System.out.println("student detailas" +p);
		
		p=new Employee("isha", "Nagar", "1002", "45000" "devlopmemt");
		System.out.println("employee detailas " +p);
		
		
		
	}

}
