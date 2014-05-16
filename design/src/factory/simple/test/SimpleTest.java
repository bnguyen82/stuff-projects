package factory.simple.test;

import factory.animal.Animal;
import factory.simple.AnimalFactory;

public class SimpleTest {
	public static void main(String[] args) {
		String type = "Sheep";
		Business business = new Business();
		String sound = business.doSomething(type);
		System.out.print(sound);
	}
}
