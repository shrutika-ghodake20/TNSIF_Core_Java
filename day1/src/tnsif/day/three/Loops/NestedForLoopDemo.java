package tnsif.day.three.Loops;

public class NestedForLoopDemo {
	
	public static void main(String[] args) {
		
		//program to print the multiplication tables
		//int a given range by using nested forloop
		
		int beg=5;
		int end=20;
		
		for (int i=beg; i<=end; i++);//outer loop
		{
			for(int j=1; j<=10; j++); //inner loop
			{
				System.out.println(i + "*" + j+ "="+ i * j);
				
			}
			System.out.println();
		}
	}

}
