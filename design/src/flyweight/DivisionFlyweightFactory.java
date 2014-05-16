package flyweight;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

import domain.flyweight.IDivision;

public class DivisionFlyweightFactory {
	private Map<String, IDivision> listDivision;
	private static final DivisionFlyweightFactory factory = new DivisionFlyweightFactory();
	public static synchronized DivisionFlyweightFactory getDivisionFlyweightFactory(){
		return factory;
	}
	public DivisionFlyweightFactory() {
		listDivision = new HashMap<String, IDivision>();
	}	
	
	public synchronized IDivision getDivisionFlyweight(String name){
		if (IDivision.VN.equals(name)){
			if (listDivision.get(name)!=null) return listDivision.get(name);
			else {
				IDivision div = new Division("VN Offfice", "364 Cong Hoa", "HCMC", "TB", "70000");
				listDivision.put(name, div);
				return div;
			}
		}
		if (IDivision.CA.equals(name)){
			if (listDivision.get(name)!=null) return listDivision.get(name);
			else {
				IDivision div = new Division("CA Factory", "322 ABC Tower", "LA", "CA", "37733");;
				listDivision.put(name, div);
				return div;
			}
		}
		if (IDivision.PA.equals(name)){
			
			if (listDivision.get(name)!=null) return listDivision.get(name);
			else {
				IDivision div = new Division("PA Center", "77 Alexander", "PA", "NY", "93939");
				listDivision.put(name, div);
				return div;
			}
		}
		return null;
	}
	private class Division implements IDivision{
		private String division;
		private String address;
		private String city;
		private String state;
		private String zip;
		
		public Division(String division, String address, String city, String state, String zip) {
			this.division = division;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
		}
		public String toString(){
			return "Division:" + division + " "+ address + " " + city +  " " + state + " " + zip;
		}
		public String getDivision() {
			return division;
		}
		public String getAddress() {
			return address;
		}
		public String getCity() {
			return city;
		}
		public String getState() {
			return state;
		}
		public String getZip() {
			return zip;
		}
	}
}
