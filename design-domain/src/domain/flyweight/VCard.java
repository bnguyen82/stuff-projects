package domain.flyweight;

public class VCard {
	private String name;
	private String title;
	private IDivision div;
	public VCard(String name,String  title,IDivision div) {
		this.name = name;
		this.title = title;
		this.div = div;
	}
	@Override
	public String toString() {
		return name + " - " + title + " " + div.toString();
	}
}
