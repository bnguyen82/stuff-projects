package facade;

import facade.legacy.Account;
import facade.legacy.Address;
import facade.legacy.CreditCard;

public class CustomerFacade {
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private String ccNumber;
	private String ccType;
	private String ccExpDate;
	
	public boolean saveCustomer() {
		boolean isValidData = true;
		Account acc = new Account(firstName, lastName);
		if (!acc.isValid()){
			isValidData = false;
			System.out.print("Account fail");
		}
		CreditCard cc = new CreditCard(ccNumber, ccType, ccExpDate);
		if (!cc.isValid()){
			isValidData = false;
			System.out.print("Account fail");
		}
		Address add = new Address(street, city, state);
		if (add.isValid()){
			isValidData = false;
			System.out.print("Account fail");
		}
		if (isValidData) {
			if (acc.save() && add.save() && cc.save()) return true;
		}
		return false;
	}
	
	//stuff
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	public void setCcType(String ccType) {
		this.ccType = ccType;
	}
	public void setCcExpDate(String ccExpDate) {
		this.ccExpDate = ccExpDate;
	}
}
