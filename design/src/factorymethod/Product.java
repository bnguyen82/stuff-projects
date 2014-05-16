package factorymethod;

public class Product {
	private boolean passQC;
	private int id;
	protected String type;

	public void setPassQC(boolean passQC) {
		this.passQC = passQC;
	}

	public boolean getPassQC() {
		return passQC;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
}
