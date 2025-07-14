package DayTwelve.Multithreading;

public class ThreadMethodsDemo {
	
	ChildThread t1=new ChildThread(5, "first");
	ChildThread t2=new ChildThread(5, "Secound");
	
	t1.start();
	t2.start();
	
	Thread.cureentThread().setName("parent Thread");//
	Thread.cureentThread().setPriority(Thread("parent Thread");//
	
	
	System.out.println("Cureent Thread ; "+Thread.current);
	

}
