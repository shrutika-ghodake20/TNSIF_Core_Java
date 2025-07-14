package tnsif.day4.secoundpackage;

import tnsid.day4.firstpackage.base;



public class Executor {
	
	public static void main(String[] args) {
		
		//accessing different package class
		
		base b1 = new base();
		
		//private ,default,protected and public
		
		b1.methodpublic();
		b1.varPublic=2344;
		b1.methodpublic();
		
		b1.varDefault=23225;
		
	}

}
