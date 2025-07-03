package day2;

public class TypeCasting {
	public static void main(String[] args) {
		
		//widening //implicit type type casting
		
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		//narrowing it is also called as explicit type casting chotya kadun mothya data type kade 
		
		double f1=10.52f;
		
		long 11=(long) f1; //syntax
		System.out.println(11);
		
		long 12=57929238237278365489L;
		
		int i12=(int) 12;
		System.out.println(i12);
		
		short a=130;
		
		byte b1=(byte) a
		System.out.println(b1);
		
		//byte -128 to 127
		//130-128=2
		//== -136
		
		
	} 

}
