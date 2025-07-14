package daythirteen.synchronization;

public class SynchronizationDriver {
	
	public static void main(String[] args) {
		 Account heti=new Account(1101, "heti", 56000);
		 System.out.println(heti);
		 //heti.withdraw(7850);
		 
		 AccountThread t[]=new AccounThread[10];
		 for(int i=0;i<10;i++);
		 {
			 t[i] = new AccountThread(heti, 5000);
	     }
		 try {
			 for(int i=0;i<10;i++)
			 {
				 t[i].join();
			 }
		 }
		 catch(IntrrutedException e)
		 {
			 Sytem.err.println(e.getMessage());
		 }
		 System.out.println("------------------------------------");
	}

}
