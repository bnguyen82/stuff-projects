package adapter.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import adapter.address.Address;
import adapter.address.HomeAddress;
import adapter.address.USAddress;
import adapter.address.VNAddress;
import adapter.address.VietAddress;
import adapter.address.validator.AddressValidator;

public class AdapterTest {
	public static void main(String[] args) {
		List<AddressValidator> addrList = new ArrayList<AddressValidator>();
		Address addr = new USAddress();
		addr.setNumberStreet("21A");
		addr.setStreetName("9");
		addr.setLocal(Locale.US);
		addrList.add(addr);
		
		//Adapt to use VN style address using Object Adapter
		HomeAddress homeAddr = new HomeAddress();
		homeAddr.setStreet("Quang Trung");
		homeAddr.setCity("HCM");
		VNAddress addr2 = new VNAddress(homeAddr);
		addrList.add(addr2);

		//Adapt to use VN style address using Object Adapter
		VietAddress addr3 = new VietAddress();
		addr3.setCity("HN");
		addr3.setStreet("Pho Hue");
		addrList.add(addr3);
		
		Business bus = new Business();
		System.out.println(bus.checkValidAddress(addrList));
		
	}
}
