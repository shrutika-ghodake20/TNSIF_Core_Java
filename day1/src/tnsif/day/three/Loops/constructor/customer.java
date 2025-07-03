package tnsif.day.three.Loops.constructor;

public class customer {
	
	private String customerName;
	private int customerId;
	private String customerCity;
	
	
	//default constructor
	public customer()
	{
		System.out.println("hello this is my default construtor---------");
	}

    //para constructor
	public customer(String customerName, int customerId, String customerCity) {
		//this ()
; //calling default constructor		// remove super kwyword super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
// getter setter method
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	//to string
	
	
	

}
