package exams.declare.practice.exam2.ex26;

import java.util.ArrayList;
import java.util.List;

public class AClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Integer[][] la = {{1,2}, {3,4,5}};
	    Number[] na = la[1];
	    Number[] na2 = (Number[])la[0];
	    Object o = na2;
//	    la[1] = (Number[])o;
	    la[0] = (Integer[])o;
	}

}
