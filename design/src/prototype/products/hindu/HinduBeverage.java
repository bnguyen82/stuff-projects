package prototype.products.hindu;

import abstractfactory.product.Beverage;

public class HinduBeverage extends Beverage implements Cloneable{
	public boolean isRamadaFestival;
	public HinduBeverage(boolean isRamada){
		isRamadaFestival = isRamada;
		if (isRamada) type = "Water";
		else type ="Cola";
	}
	
	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
