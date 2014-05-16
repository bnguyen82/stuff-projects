package exams.api.practice.exam2.ex25;
import java.util.*;
import java.text.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Date d = new Date(); 
		  DateFormat df = DateFormat.getDateInstance(DateFormat.LONG); 
		  Locale[] la = {new Locale("it", "IT"), new Locale("pt", "BR")};  
		  for(Locale l: la) { 
//		    df.setLocale(l); 
		    System.out.println(df.format(d)); 
		  }
	}

}
