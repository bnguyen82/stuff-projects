package abstractfactory.restaurant;

import abstractfactory.product.Beverage;
import abstractfactory.product.Pizza;
import abstractfactory.product.us.USBeverage;
import abstractfactory.product.us.USPizza;

public class USPizzaRestaurant extends PizzaRestaurant {

	public Beverage deliverBeverage() {
		return new USBeverage();
	}

	@Override
	public Pizza deliverPizza() {
		return new USPizza();
	}

}
