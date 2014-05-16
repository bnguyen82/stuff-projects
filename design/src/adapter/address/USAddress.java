package adapter.address;


public class USAddress extends Address {

	@Override
	public boolean isAddressValidate() {
		if (!"us".equals(getLocal().getLanguage())) return false;
		try {
			Integer.parseInt(getStreetName());
		}catch (NumberFormatException ex){
			return false;
		}
		return true;
	}

}
