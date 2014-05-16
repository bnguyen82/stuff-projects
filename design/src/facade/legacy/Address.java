package facade.legacy;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class Address {
	private static final String ADDRESS_FILE = "facade-address.txt";
	private String street;
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	private String city;
	private String state;
	public Address(String street, String city, String state) {
		// TODO Auto-generated constructor stub
		this.street= street;
		this.state = state;
		this.city = city;
	}
	public boolean isValid() {
		return state.trim().length() == 2; 
	}
	public boolean save() {
		String line = getState() + " " + getCity() + " " + getStreet();
		try {
			FileUtils.writeStringToFile(new File(ADDRESS_FILE), line, "unicode");
			return true;
		}catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}
}
