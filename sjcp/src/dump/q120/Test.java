package dump.q120;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {
//public static Iterator reverse(List list) {
//	Collections.reverse(list);
//	return list.iterator();
//}
public static ArrayList reverse(ArrayList list) {
	Collections.reverse(list);
	return  list;
//	return list.iterator();
}
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("1"); list.add("2"); list.add("3");
	for (Object obj: reverse(list))
		System.out.print(obj + ", ");
	}
}
