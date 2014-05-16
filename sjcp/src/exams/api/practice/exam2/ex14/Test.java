package exams.api.practice.exam2.ex14;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "x1t23#"; 
		 String[] tokens = s.split("\\d"); 
		 for(String o: tokens) 
		   System.out.print(o + " "); 
		 System.out.print("  "); 
		 tokens = s.split("\\."); 
		 for(String o: tokens) 
		   System.out.print(o + " ");
		 Pattern p = Pattern.compile("(\\d)+");
		 Matcher m = p.matcher(s);
		 while (m.find()){
			 System.out.print(m.group() + " ");
		 }
		 String[] a = {"a","b"};
		 String b = (a.length>0)?a[0]:null;
	}

}
