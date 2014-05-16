package adapter.address;

public class HomeAddress {
	private String street;
	private String town;
	private String city;
	public boolean isValid(){
		try{
			Integer.parseInt(city);
			Integer.parseInt(town);
		}
		catch (NumberFormatException ex){
			return false;
		}
		return true;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
