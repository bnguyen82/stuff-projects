package factorymethod.test;

import factorymethod.HyndaiFactory;
import factorymethod.SeoulFactory;

public class Business {
	public void exportSeoulProduct(){
		HyndaiFactory creator = new SeoulFactory();
		creator.export("Car");
		creator.export("Bus");
	}
}
