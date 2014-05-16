package factorymethod.animal;

import factory.animal.Animal;

public abstract class MethodFactory {
	public abstract Animal layAnimal();
	public static MethodFactory getFactory(String type){
		if ("cat".equalsIgnoreCase(type)) return new CatMethodFactory();
		else if ("dog".equalsIgnoreCase(type)) return new DogMethodFactory();
		return null;
			
	}
}
