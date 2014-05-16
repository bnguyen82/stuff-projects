package prototype.products.hindu;


import abstractfactory.product.Pizza;
import abstractfactory.product.PizzaIngrements;

public class HinduPizza extends Pizza implements Cloneable{
	public boolean isRamadaFestival;
	
	
	public HinduPizza(boolean isRamada){
		isRamadaFestival = isRamada;
		if (!isRamada){
			ingrements.put(PizzaIngrements.Anchovy, 40);
			ingrements.put(PizzaIngrements.Pepperoni, 50);
			ingrements.put(PizzaIngrements.Vegetable, 10);
		}else{
			ingrements.put(PizzaIngrements.Pepperoni, 20);
			ingrements.put(PizzaIngrements.Vegetable, 80);
		}
	}
	public boolean isRamadaFestival() {
		return isRamadaFestival;
	}

	@Override
	public boolean isFat() {
		// TODO Auto-generated method stub
		if (isRamadaFestival) return false;
		return true;
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
