package builder.factory;

import builder.components.BuilderConstants;
import builder.design.VehicleDesignForm;
import builder.products.Vehicle;

public abstract class BuilderFactory {
	protected Vehicle vehicle;
	protected VehicleDesignForm designForm;
	protected String factoryType;
	public VehicleDesignForm getDesignForm() {
		return designForm;
	}

	public void setDesignForm(VehicleDesignForm designForm) {
		this.designForm = designForm;
	}

	public static BuilderFactory getFactory(VehicleDesignForm design){
		BuilderFactory builder = null;
		if (BuilderConstants.CAR.equalsIgnoreCase(design.getVehicleType())){
			builder = new CarBuilderFactory();
		}
		else if (BuilderConstants.BIKE.equalsIgnoreCase(design.getVehicleType())){
			builder = new BikeBuilderFactory();
		}
		builder.setDesignForm(design);
		return builder;
	}
	
	public abstract void assemblyWheels();
	public abstract void assemblyChairs();
	public abstract void assemblyLights();
	public abstract void createVehicle();
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}

}
