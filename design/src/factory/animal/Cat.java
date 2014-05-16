package factory.animal;

import factory.simple.RegistAnimalFactory;

public class Cat implements Animal {
	static {
		RegistAnimalFactory.getInstance().registerAnimal("Cat", new Cat());
	}
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Cat";
	}
}
