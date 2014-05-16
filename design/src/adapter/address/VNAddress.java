package adapter.address;

public class VNAddress extends Address {
	private HomeAddress homeAddr;
	public VNAddress(HomeAddress addr){
		homeAddr = addr;
	}
	@Override
	public boolean isAddressValidate() {
		// TODO Auto-generated method stub
		return homeAddr.isValid();
	}

}
