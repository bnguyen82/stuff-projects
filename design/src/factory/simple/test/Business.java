package factory.simple.test;

import factory.animal.Animal;
import factory.simple.AnimalFactory;
import factory.simple.RegistAnimalFactory;

public class Business {
	public String doSomething(String type) {
//		AnimalFactory fac = AnimalFactory.getInstance();
		RegistAnimalFactory fac = RegistAnimalFactory.getInstance();
		Animal ani = fac.createAnimal(type);
		return ani.sound();
	}
}
