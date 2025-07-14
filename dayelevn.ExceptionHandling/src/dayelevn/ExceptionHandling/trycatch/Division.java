package dayelevn.ExceptionHandling.trycatch;

public class Division {
	//example of a multiple ctch blocks
	public static void divide ()
	
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers: ");
		
		try {
			a.sc.nextInt();
			b=scnextInt();
	
			c=a/b;
			
			System.out.println("Divsion is : "+c);
			
		}
		catch (InputMismatchException e)
		{
			System.err.println(e.getMessgae());
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundary)
		{
			System.err.println(e.getMessgae());
		}
		catch (Exception e)
		{
			System.err.println(e.getMessgae());
		}
		finally {
			System.out.println("Finally is and end of the program : ");
			//to used to open sources are also be close in the end isally used to close the all the resouces
			
		}
	}

}
