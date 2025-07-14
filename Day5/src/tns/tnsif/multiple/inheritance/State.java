package tns.tnsif.multiple.inheritance;

//child of country
public class State  extends Country{
	
	//data members
	private String StateName;
	private String language;
	
	
	//getter setter method;
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	//to string to select inherit
	@Override
	public String toString() {
		return "State [StateName=" + StateName + ", language=" + language + ", getCountryname()=" + getCountryname()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	
	
	

}
