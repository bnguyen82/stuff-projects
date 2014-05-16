package facade.legacy;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class CreditCard {
	private static final String CREDIT_CARD_FILE = "facade-cc.txt";
	private String number;
	private String type;
	private String expDate;
	public CreditCard(String number, String type, String expDate) {
		this.number = number;
		this.type = type;
		this.expDate = expDate;
	}
	public String getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String getExpDate() {
		return expDate;
	}
	public boolean isValid() {
		if ("VISA".equals(type) ) return number.length() == 16;
		if ("MASTER".equals(type) ) return number.length() == 15;
		return false;
	}
	public boolean save() {
		String line = getNumber() + " " + getType() + " " + getExpDate();
		try {
			FileUtils.writeStringToFile(new File(CREDIT_CARD_FILE), line, "unicode");
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
