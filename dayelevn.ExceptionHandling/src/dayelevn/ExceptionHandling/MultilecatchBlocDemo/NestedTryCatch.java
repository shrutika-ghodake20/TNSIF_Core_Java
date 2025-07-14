package dayelevn.ExceptionHandling.MultilecatchBlocDemo;

public class NestedTryCatch {
	
	public static void check()
	{
		String str="TNS";
		int slength=str.length(); //int sl=3
		System.out.println("String Length:"+ slength);
		
		String anotherString= null;
		
		int y=6;
		
		try {
			//Inner tyr block
			try {
				System.out.println(str.CharAt(y));
			}
			catch(StringIndexOutOfBoundException e)
			{
				System.out.println("String Length : "+anotherstring.length());
			}
			catch(NullPointOfException e)
			{
				System.out.println(e.getMessgae);
			}
		}
	}

}
