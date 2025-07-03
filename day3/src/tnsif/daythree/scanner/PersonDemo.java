package tnsif.daythree.scanner;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String[] args) {
		
		//scanner objects to accept user input
		Scanner ob=new Scanner (System.in); //ob = are the reference
		
		String name;
		System.out.println("Enter person name :");//next it will accept to the till data 
		name= ob.next();
		System.out.println("Enter age :");
		int gae =ob.nextInt();
		System.out.println("enter gender :");
		String gender = ob.next();
		
		System.out.println("Enter the mobile number ");
		long mobileNumber=ob.nextLong();
		System.out.println("enter income ");
		int income =ob.nextInt();
		
		//person object and initaalized value using setter 
		Person person=new person();
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		person.setMobileNumber(mobileNumber);dd
		
		//by using getter method i m reading the data
		System.out.println(person.getName() );
		System.out.println(person.getGender);
		System.out.println(person.Age);
		
		//display person detailas using tostring() method
		System.out.println(person);
		
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person);
		System.out.println("After calculation of the tax:");
		
		
	}

}
