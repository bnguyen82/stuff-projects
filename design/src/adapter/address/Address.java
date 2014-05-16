package adapter.address;

import java.util.Locale;

import adapter.address.validator.AddressValidator;

public abstract class Address implements AddressValidator{
	private String numberStreet;
	private String streetName;
	private String city;
	private Locale local;
	public String getNumberStreet() {
		return numberStreet;
	}
	public void setNumberStreet(String numberStreet) {
		this.numberStreet = numberStreet;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Locale getLocal() {
		return local;
	}
	public void setLocal(Locale local) {
		this.local = local;
	}
}
