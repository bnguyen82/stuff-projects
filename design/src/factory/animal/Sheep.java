package factory.animal;

import factory.simple.RegistAnimalFactory;

public class Sheep implements Animal{
	static {
		RegistAnimalFactory.getInstance().registerAnimal("Sheep", new Sheep());
	}
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Sheep";
	}
}
