package builder.factory;

import builder.components.BuilderConstants;
import builder.components.chairs.BikeChair;
import builder.components.chairs.Chair;
import builder.components.lights.BikeLight;
import builder.components.lights.Light;
import builder.components.wheels.BikeWheel;
import builder.components.wheels.Wheel;
import builder.products.Bike;

public class BikeBuilderFactory extends BuilderFactory {
	public BikeBuilderFactory() {
		factoryType = BuilderConstants.BIKE;
		vehicle = new Bike() ;
	}
	@Override
	public void assemblyWheels() {
		// TODO Auto-generated method stub
		int numwheels = designForm.getComponentsInfo().get(BuilderConstants.WHEEL);
		Wheel[] wheels = new Wheel[numwheels];
		for (int i = 0; i < numwheels; i++) {
			wheels[i] = new BikeWheel();
		}
		vehicle.setWheels(wheels);
	}

	@Override
	public void assemblyChairs() {
		// TODO Auto-generated method stub
		int numwheels = designForm.getComponentsInfo().get(BuilderConstants.LIGHT);
		Chair[] wheels = new Chair[numwheels];
		for (int i = 0; i < numwheels; i++) {
			wheels[i] = new BikeChair();
		}
		vehicle.setChairs(wheels);
	}

	@Override
	public void assemblyLights() {
		// TODO Auto-generated method stub
		int numwheels = designForm.getComponentsInfo().get(BuilderConstants.LIGHT);
		Light[] wheels = new Light[numwheels];
		for (int i = 0; i < numwheels; i++) {
			wheels[i] = new BikeLight();
		}
		vehicle.setLights(wheels);
	}

	@Override
	public void createVehicle() {
		// TODO Auto-generated method stub
		assemblyChairs();
		assemblyWheels();
		assemblyLights();

	}

}
