package tns.tnsif.association.hasa;

public class Person {

	private String name;
	private Address address;
	
	//para constructor
	public Person(String name, Address address) {
		//super();
		this.name = name;
		this.address = address;
		
	}
  // generate getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	//method to display person unfo
	public void displayInfo();
	{
		System.out.println("Namr :"+ name);
		System.out.println("Address : + "address.getStreet()+", "address.getcity()+", 
				"address.getstate()+" ,  "address.getpostalcode()");
	}
	//to string
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	
	
	
}
