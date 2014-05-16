package abstractfactory.test;

import abstractfactory.human.Employee;
import abstractfactory.product.Beverage;
import abstractfactory.product.Pizza;
import abstractfactory.restaurant.PizzaRestaurant;
import abstractfactory.restaurant.RestaurantMaker;

public class Business {
	public void deliverProduct(Employee employee){
		PizzaRestaurant res = RestaurantMaker.getRestaurant(employee.getLocal().getLanguage());
			Beverage bev = res.deliverBeverage();
			Pizza pi = res.deliverPizza();
			System.out.println("Deliver " + employee.getLocal().getLanguage().toUpperCase() + " package style");
			bev.displayContents();
			pi.displayContents();
		}
}
