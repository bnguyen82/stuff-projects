package factorymethod.animal;

import factory.animal.Animal;
import factory.animal.Dog;

public class DogMethodFactory extends MethodFactory {

	@Override
	public Animal layAnimal() {
		// TODO Auto-generated method stub
		return new Dog();
	}

}
