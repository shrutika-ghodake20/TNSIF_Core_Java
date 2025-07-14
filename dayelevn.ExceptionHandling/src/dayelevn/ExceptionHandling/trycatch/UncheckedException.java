package dayelevn.ExceptionHandling.trycatch;

public class UncheckedException {
	
	public static void main(String[] args) {
		 int x[];
		 try {
			 x= new int[] (1,2,3,4,5,6)// 0 to 5
					 System.out.println(x[2]);
		 }
		 catch(ArrayIndexOutOfBoundException e)
		 System.out.println("specific index does not exist:"+ e.getMessage);
	}

}
