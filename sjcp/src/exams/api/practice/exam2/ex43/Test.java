package exams.api.practice.exam2.ex43;

import java.text.DateFormat;
import java.util.Calendar;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Calendar c = Calendar.getInstance();
	    DateFormat df =  DateFormat.getDateInstance(DateFormat.SHORT);
	    df.format(c.getTime());
	    c.set(1999,11,25); 
	    c.roll(Calendar.MONTH, 3); 
	    c.add(Calendar.DATE, 10); 
	    System.out.println(c.getTime()); 
	}

}
