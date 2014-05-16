package abstractfactory.restaurant;

public class RestaurantMaker {
	public static PizzaRestaurant getRestaurant(String type){
		if ("US".equalsIgnoreCase(type)) return new USPizzaRestaurant();
		else if ("VN".equalsIgnoreCase(type)) return new VNPizzaRestaurant();
		return null;
	}
}
