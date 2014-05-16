package prototype.restaurant.hindu;

import prototype.products.hindu.HinduBeverage;
import prototype.products.hindu.HinduPizza;
import prototype.products.hindu.my.MalayHinduBeverage;
import prototype.products.hindu.my.MalayHinduPizza;
import prototype.restaurant.hindu.malaysia.MalayHinduPizzaRestaurant;
import abstractfactory.restaurant.PizzaRestaurant;
import abstractfactory.restaurant.USPizzaRestaurant;
import abstractfactory.restaurant.VNPizzaRestaurant;

public class RestaurantMaker1 {
	public static PizzaRestaurant getRestaurant(String type){
		if ("US".equalsIgnoreCase(type)) return new USPizzaRestaurant();
		else if ("VN".equalsIgnoreCase(type)) return new VNPizzaRestaurant();
		else if ("MY".equalsIgnoreCase(type)) {
				//get information from webservice to detemine isRamada
				boolean isRamada = false;
				MalayHinduBeverage bev = new MalayHinduBeverage(isRamada);
				MalayHinduPizza piz = new MalayHinduPizza(isRamada);
				return new MalayHinduPizzaRestaurant(bev, piz);
		}
		return null;
		}
}
