package tns.tnsif.single.inheritance;
 
//parent class
public class student extends Citizen {
	
	//data members
	
	// private String studentname;
	// private String adharNo;
	// private String address;
	// private long phoneno;
	 private int rollno;
	 private String collegeName;
	 //by using inheritance we dont need to write the this data .
	 
	 //non para constructor
	
	 public student() {
		super();
	 }
	 
	 //para meterized constructor
	 public student(String name, String adharNo, String address, long phone) {
		super( name,  adharNo, address,  phone);
		this.rollno = rollno;
		this.collegeName = collegeName;
	 }
 
	 //getter and setter method
	 public int getRollno() {
		 return rollno;
	 }

	 public void setRollno(int rollno) {
		 this.rollno = rollno;
	 }

	 public String getCollegeName() {
		 return collegeName;
	 }

	 public void setCollegeName(String collegeName) {
		 this.collegeName = collegeName;
	 }
      // to string
	 @Override
	 public String toString() {
		return "student [rollno=" + rollno + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	 }
	 
	 
	 
	 
	 

}
