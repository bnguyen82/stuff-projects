package builder.test;

import java.util.HashMap;
import java.util.Map;

import builder.components.BuilderConstants;
import builder.design.VehicleDesignForm;


public class BuilderTest {
	public static void main(String[] args) {
		VehicleDesignForm design = new VehicleDesignForm();
		
		Director director = new Director();
		//Car
		Map<String, Integer> details = new HashMap<String, Integer>();
		details.put(BuilderConstants.WHEEL, 5);
		details.put(BuilderConstants.CHAIR, 4);
		details.put(BuilderConstants.LIGHT, 4);
		design.setVehicleType(BuilderConstants.CAR);
		design.setComponentsInfo(details);
		director.createVehicle(design);
		//Bike
		VehicleDesignForm design1 = new VehicleDesignForm();
		Map<String, Integer> details1 = new HashMap<String, Integer>();
		details1.put(BuilderConstants.WHEEL, 5);
		details1.put(BuilderConstants.CHAIR, 4);
		details1.put(BuilderConstants.LIGHT, 4);
		design1.setVehicleType(BuilderConstants.BIKE);
		design1.setComponentsInfo(details1);
		director.createVehicle(design1);

	}
}
