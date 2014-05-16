package dump.q94;

 enum Title1 {
	MR("Mr."), MRS("Mrs."), MS("Ms.");
	private final String title;
	private Title1(String t) { title = t; }
	public String format(String last, String first) {
	return title + " " + first + " " + last;
	}
 }
public class Title {	
	public static void main(String[] args) {
		System.out.println(Title1.MR.format("Doe", "John"));
		}
	}