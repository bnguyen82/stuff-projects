package abstractfactory.product;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class Pizza {
	protected Map<PizzaIngrements, Integer> ingrements = new HashMap<PizzaIngrements, Integer>();
	public void displayContents(){
		System.out.println(isFat()?"Fat Pizza":"Nonfat Pizza");
		Set<PizzaIngrements> ingSet = ingrements.keySet();
		for (PizzaIngrements ing : ingSet){
			System.out.println(ing.toString() + " " + ingrements.get(ing).intValue() + "%");
		}
	}
	public abstract boolean isFat();
}
