package exams.flow.practice.exam1.ex44;

public class Later { 
	public static void main(String[] args) { 
		boolean earlyExit = new Later().test1(args); 
		if(earlyExit) assert false; 
		new Later().test2(args); 
	} 
	boolean test1(String[] a) {  
		if (a.length == 0) return false; 
		return true; 
	} 
	private void test2(String[] a) { 
		if (a.length == 2) assert false; 
	} 
}