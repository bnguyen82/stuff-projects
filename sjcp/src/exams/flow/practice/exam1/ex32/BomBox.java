package exams.flow.practice.exam1.ex32;

import java.util.ArrayList;
import java.util.List;

class Stereo { void makeNoise() { assert false; } } 
public class BomBox extends Stereo { 
	public static void main(String[] args) { 
		new BomBox().go(args); 
	} 
//	static int[] e;
	void go(String[] args) {
////		String a1 = (String)a.get(0);
//		List a = new ArrayList<Integer>(); 
//		int[] b  = new int[8];
//		String[] c = new String[8];
//		int[] d;
////		String bd=c[0];
//		int ef = e.length;
//		a.size();
////		a.get(0);
		if(args.length > 0)  makeNoise(); 
		if(!args[0].equals("x")) System.out.println("!x"); 
	} 
}