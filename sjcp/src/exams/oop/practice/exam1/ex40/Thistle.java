package exams.oop.practice.exam1.ex40;

class Weed { 
	protected static String s = ""; 
//	final void grow() { s += "grow "; } 
	void grow() { s += "grow "; } 
//	static final void growFast() { s += "fast "; } 
	void growFast() { s += "fast "; } 
} 
public class Thistle extends Weed { 
	void grow() { s += "t-grow "; } 
	void growFast() { s+= "t-fast "; } 
}