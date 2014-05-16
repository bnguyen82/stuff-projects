package builder.factory;

import builder.components.BuilderConstants;
import builder.components.chairs.CarChair;
import builder.components.chairs.Chair;
import builder.components.lights.CarLight;
import builder.components.lights.Light;
import builder.components.wheels.CarWheel;
import builder.components.wheels.Wheel;
import builder.products.Car;
import builder.products.Vehicle;

public class CarBuilderFactory extends BuilderFactory {

	public CarBuilderFactory() {
		factoryType = BuilderConstants.CAR;
		vehicle = new Car() ;
	}
	@Override
	public void assemblyChairs() {
		int numwheels = designForm.getComponentsInfo().get(BuilderConstants.CHAIR);
		Chair[] wheels = new Chair[numwheels];
		for (int i = 0; i < numwheels; i++) {
			wheels[i] = new CarChair();
		}
		vehicle.setChairs(wheels);
	}

	@Override
	public void assemblyLights() {
		// TODO Auto-generated method stub
		int numwheels = designForm.getComponentsInfo().get(BuilderConstants.LIGHT);
		Light[] wheels = new Light[numwheels];
		for (int i = 0; i < numwheels; i++) {
			wheels[i] = new CarLight();
		}
		vehicle.setLights(wheels);
	}

	@Override
	public void assemblyWheels() {
		// TODO Auto-generated method stub
		int numwheels = designForm.getComponentsInfo().get(BuilderConstants.WHEEL);
		Wheel[] wheels = new Wheel[numwheels];
		for (int i = 0; i < numwheels; i++) {
			wheels[i] = new CarWheel();
		}
		vehicle.setWheels(wheels);

	}
	@Override
	public void createVehicle() {
		assemblyWheels();// call in an order
		assemblyChairs();
		assemblyLights();
	}

}
