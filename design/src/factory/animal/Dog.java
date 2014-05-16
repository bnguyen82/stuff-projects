package factory.animal;

import factory.simple.RegistAnimalFactory;

public class Dog implements Animal{
	static {
		RegistAnimalFactory.getInstance().registerAnimal("Dog", new Dog());
	}
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Dog";
	}
}
