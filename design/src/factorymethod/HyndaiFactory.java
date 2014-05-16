package factorymethod;

public abstract class HyndaiFactory {
	public abstract Product assemblyProduct(String productType);
	
	public void export(String productType){
		Product product = assemblyProduct(productType);
		product.setPassQC(true);
		System.out.println("Export an "+ product.getType()+" id " + product.getId());
	}
}
