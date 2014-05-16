package abstractfactory.product;

public abstract class Beverage {
	protected String type;
	public void displayContents(){
		System.out.println(type);
	}
}
