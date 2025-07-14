package tnsid.day4.firstpackage;

public class Executor {
	
	public static void main (String[] args) {
		
		//accessing a same package class
		base b1=new Base();
		b1.methodDefault();
		b1.methodprotected();
		b1.methodpublic();
		//b1.methodPrivate();	
		
		b1.varDefault=11;
		b1.methodDefault(); //default value checked 
		
		b1.varProtected=100;
		b1.methodprotected();
		
		
	}

}
