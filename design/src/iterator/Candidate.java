package iterator;

public class Candidate {
	private String name;
	public String getName() {
		return name;
	}
	public String getCertificate() {
		return certificate;
	}
	public String getState() {
		return state;
	}
	private String certificate;
	private String state;
	public Candidate(String name, String certificate, String state) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.certificate = certificate;
		this.state = state;
	}
}
