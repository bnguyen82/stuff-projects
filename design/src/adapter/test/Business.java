package adapter.test;

import java.util.List;

import adapter.address.validator.AddressValidator;

public class Business {
	public boolean checkValidAddress(List<AddressValidator> addrList){
		for (AddressValidator address : addrList) {
			if (!address.isAddressValidate()) return false;
		}
		return true;
	}
}
