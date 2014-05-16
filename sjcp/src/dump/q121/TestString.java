package dump.q121;

import java.util.Locale;

public class TestString {
public static void main(String[] args) {
// insert code here
//	 String s = "123456789";
//	s = (s-"123").replace(1,3,"24") - "89";
//	 StringBuffer s = new StringBuffer("123456789");
//	s.delete(0,3).replace(1,3,"24").delete(4,6);
//	 StringBuffer s = new StringBuffer("123456789");
//	s.substring(3,6).delete(1,3).insert(1, "24");
//	 StringBuilder s = new StringBuilder("123456789");
//	s.substring(3,6).delete(1,2).insert(1, "24");
	 StringBuilder s = new StringBuilder("123456789");
	s.delete(0,3).delete(1,3).delete(2,5).insert(1, "24");
	System.out.println(s);
	Locale loc = Locale.getDefault();
	loc.getDisplayCountry(Locale.CANADA);
}
}

