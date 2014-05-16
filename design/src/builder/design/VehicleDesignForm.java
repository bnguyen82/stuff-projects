package builder.design;

import java.util.Map;


public class VehicleDesignForm extends DesignForm {
	private Map<String, Integer> componentsInfo;
	private String vehicleType;
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public void setComponentsInfo(Map<String, Integer> componentsInfo) {
		this.componentsInfo = componentsInfo;
	}

	public Map<String, Integer> getComponentsInfo() {
		return componentsInfo;
	}
	
}
