package abstractfactory.restaurant;

import abstractfactory.product.Beverage;
import abstractfactory.product.Pizza;

public abstract class PizzaRestaurant {
	public abstract Pizza deliverPizza();
	public abstract Beverage deliverBeverage();
}
