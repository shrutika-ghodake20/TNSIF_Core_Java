package tns.tnsif.multiple.inheritance;

public class Country {
	//parent
	private String countryname;
	private String capital;
	
	//para con
	public Country(String countryname, String capital) {
		super();
		this.countryname = countryname;
		this.capital = capital;
		
		
	}
	
	//non para
	public Country() {
		super();
	}


	//getter setter method
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
    // to string
	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", capital=" + capital + "]";
	}
	
	
	
	
	
	

}
