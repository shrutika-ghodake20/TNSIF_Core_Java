package daythirteen.synchronization;

public class Account implement Bank {
	
	//data mebers 
	private int AccNo;
	private string name;
	private double Balance;
	
	//getter setter method
	public implement getBank() {
		return Bank;
	}
	public void setBank(implement bank) {
		Bank = bank;
	}
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public string getName() {
		return name;
	}
	public void setName(string name) {
		this.name = name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	//para constructore
	public Account() {
		super();
	}
	public Account(implement bank, int accNo, string name, double balance) {
		super();
		Bank = bank;
		AccNo = accNo;
		this.name = name;
		Balance = balance;
	}
	// non-para constructore
	public Account() {
		super();
	}
	
	@Override
	public String toString() {
		return "Account [AccNo=" + AccNo + ", Balance=" + Balance + ", getAccNo()=" + getAccNo() + ", getBalance()="
				+ getBalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

	
	
	
	
	
	

}
