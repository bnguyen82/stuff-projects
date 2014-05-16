package prototype.restaurant.hindu;

import java.util.HashMap;

import prototype.products.hindu.HinduBeverage;
import prototype.products.hindu.HinduPizza;

import abstractfactory.product.Beverage;
import abstractfactory.product.Pizza;
import abstractfactory.restaurant.PizzaRestaurant;



public abstract class HinduPizzaRestaurant extends PizzaRestaurant {
	public HinduBeverage bev;
	public HinduPizza piz;
	
	public HinduPizzaRestaurant(HinduBeverage bev, HinduPizza pizza){
		this.bev = bev;
		this.piz = pizza;
	}
	@Override
	public Beverage deliverBeverage() {
		// TODO Auto-generated method stub
		return (Beverage) bev.clone();
	}

	@Override
	public Pizza deliverPizza() {
		// TODO Auto-generated method stub
		return (Pizza) piz.clone();
	}

}
