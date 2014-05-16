package factorymethod;

public class SeoulFactory extends HyndaiFactory{
	@Override
	public Product assemblyProduct(String productType) {
		// TODO Auto-generated method stub
		if (productType.endsWith("Car"))
			return new Car();
		else if (productType.endsWith("Bus"))
			return new Bus();
		return null;
	}
}
