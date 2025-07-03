package tnsif.day.three.Loops.jumpstatement;

public class ContinueDemo {
	public static void main(String[] args) {
		
		for (int k=5; k<15; k++)
		{
			//odd or skipped
			 if(k%2 !=0)
				 continue;
			 //even number are printed
			 System.out.println(k + " ");
		}
	}

}
