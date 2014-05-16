package adapter.address;

import adapter.address.validator.AddressValidator;

public class VietAddress extends HomeAddress implements AddressValidator{
	@Override
	public boolean isAddressValidate() {
		// TODO Auto-generated method stub
		return super.isValid();
	}
}
