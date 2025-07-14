package daythirteen.synchronization;

public class AccountThread  extends Thread{
	 private Account acc;
	 private.amt = amt;
	 
	 
	 //para constructore

	 public AccountThread(Account acc) {
		super();
		this.acc = acc;
		this.amt = amt;
		start();
		
	 } 
	 @overide
	 public void run()
	 {
		 try {
			 acc.withdraw(amt);
		 }
		 catch(){
			 
		 }
	 }
	 
	 
	 

}
