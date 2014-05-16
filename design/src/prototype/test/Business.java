package prototype.test;

import prototype.restaurant.hindu.RestaurantMaker1;
import abstractfactory.human.Employee;
import abstractfactory.product.Beverage;
import abstractfactory.product.Pizza;
import abstractfactory.restaurant.PizzaRestaurant;

public class Business {
	public void deliverProduct(Employee employee){
		PizzaRestaurant res = RestaurantMaker1.getRestaurant(employee.getLocal().getLanguage());
			Beverage bev = res.deliverBeverage();
			Pizza pi = res.deliverPizza();
			System.out.println("Deliver " + employee.getLocal().getLanguage().toUpperCase() + " package style");
			bev.displayContents();
			pi.displayContents();
			
//			Beverage bev1 = res.deliverBeverage();
//			Pizza pi1 = res.deliverPizza();
//			System.out.println("Deliver " + employee.getLocal().getLanguage().toUpperCase() + " package style");
//			bev1.displayContents();
//			pi1.displayContents();
		}
}
