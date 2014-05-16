package factorymethod.animal;

import factory.animal.Animal;
import factory.animal.Cat;

public class CatMethodFactory extends MethodFactory {

	@Override
	public Animal layAnimal() {
		// TODO Auto-generated method stub
		return new Cat();
	}

}
