package factory.simple;

import java.util.HashMap;
import java.util.Map;

import factory.animal.Animal;

public class RegistAnimalFactory {
	Map<String, Animal> animalMap = new HashMap<String, Animal>();
	private static RegistAnimalFactory instant;
	public static RegistAnimalFactory getInstance() {
		if (instant == null) {
			return new RegistAnimalFactory();
		}
		return instant;		
	}
	public void registerAnimal(String type, Animal animal){
		animalMap.put(type, animal);
	}
	public Animal createAnimal(String type){
		return animalMap.get(type);
	}
}
