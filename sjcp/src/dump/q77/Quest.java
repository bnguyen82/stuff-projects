package dump.q77;

import java.util.*;
public class Quest {
public static void main(String[] args) {
	String[] colors = {"blue", "red", "green", "yellow", "orange"};
	Arrays.sort(colors);
	Bao[] baos = {new Bao("b"), new Bao("a")};
//	Arrays.sort(baos);
	Arrays.sort(baos,new Com());
	int s1 = Arrays.binarySearch(baos, new Bao("b"));
	int s2 = Arrays.binarySearch(colors, "orange");
	int s3 = Arrays.binarySearch(colors, "giolet");
	System.out.println(s2 + " " + s3);
}
}
class Bao implements Comparable<Bao>{
	
	public String a;
	public Bao(String a){
		this.a = a;
	}
	public int compareTo(Bao o) {
		// TODO Auto-generated method stub
		return a.compareTo(o.a);
	}
}
class Com implements Comparator<Bao>{
	@Override
	public int compare(Bao o1, Bao o2) {
		// TODO Auto-generated method stub
		return o1.a.compareTo(o2.a);
	}
}