package factory.simple;

import factory.animal.Animal;
import factory.animal.Cat;
import factory.animal.Dog;
import factory.animal.Sheep;

public class AnimalFactory {
	private static AnimalFactory instant;
	public static AnimalFactory getInstance() {
		if (instant == null) {
			return new AnimalFactory();
		}
		return instant;		
	}
	
	public Animal createAnimal(String type){
		if (type.equals("Dog")){
			return new Dog();
		}
		else if (type.equals("Cat")){
			return new Cat();
		}
		else if (type.equals("Sheep")){
			return new Sheep();
		}
		return null;
	}
}
