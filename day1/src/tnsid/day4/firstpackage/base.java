package tnsid.day4.firstpackage;

public class base {
	
	//declare default,private,protected and public variable
	
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30; // private data member only with in the same class
	protected int varProtected = 40;
	
	//declare default,protected,public and private method
	void methodDefault()
	{
		System.out.println("default access base class");
		System.out.println("public variable : "+ varDefault);
		
	}
	
	public void methodpublic()
	{
	System.out.println("default access base class");
	System.out.println("public variable : "+ varDefault);
	}
	
	private void methodPrivate()
	{
		System.out.println("default access base class");
		System.out.println("public variable : "+ varDefault);
	}
	protected void methodprotected()
	{
		System.out.println("default access base class");
		System.out.println("public variable : "+ varDefault);
	}

}
