package day2;

public class PrimitiveDataTypeDemo {
	public static void main (String[] args) {
		//range
		//byte takes 1 byte
		//1 byte = 8 byte  // 2^8
		//256/2
		//128
		
		byte byteMax=127;
	    byte byteMin=-128;
	    
	    System.out.println("Min range of byte is : "+ byteMin+ " Max range of byte is "+ byteMax);
	    
	    //short ------- 2 byte
	    short shortMax=  32767;
	    short shortMin= -32768;
	    System.out.println("Min range of short is : "+ byteMin+ " Max range of short is "+ shortMax);
	    
	    //int---- 4byte=32bits 2^32/2 = 
	    
	    
	    int maxInt=2147483647;
	    int minInt=-2147483648;
	    
	    //long 8*8= 64 2^64/2
	    
	    long maxLong=922337203654775808L;
	    long minLong=-922337203654775808L;
	    
	    float f=3234.141243278345f;
	    double d=3456.1416628393586806593484785f;
	    
	    boolean flag=false;
	    boolean flag2=true;
	}

}
