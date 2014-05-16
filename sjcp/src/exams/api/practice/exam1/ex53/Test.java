package exams.api.practice.exam1.ex53;
import java.util.*;
import java.util.regex.Pattern;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String in = "1234,77777,689"; 
		   Scanner sc = new Scanner(in); 
		   sc.useDelimiter(Pattern.compile(","));
		   while(sc.hasNext()) 
		     System.out.print(sc.nextInt() + " "); 
		   while(sc.hasNext()) 
		     System.out.print(sc.nextShort() + " ");
	}

}
