package facade.legacy;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class Account {
	private String firstName;
	private String lastName;
	public static final String ACCOUNT_FILE = "facade-account.txt";
	public Account(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean save() {
		String line = getFirstName() + " " + getLastName();
		try {
			FileUtils.writeStringToFile(new File(ACCOUNT_FILE), line, "unicode");
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
