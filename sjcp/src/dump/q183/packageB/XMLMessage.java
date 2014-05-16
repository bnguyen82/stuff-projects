package dump.q183.packageB;

public class XMLMessage extends dump.q183.packageA.Message {
	String getText() { return "<msg>text</msg>";}
	public static void main(String[] args) {
	System.out.println(new XMLMessage().getText());
	}}
