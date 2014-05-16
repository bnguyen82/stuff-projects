package exams.oop.practice.exam4.ex60;

class Explode { 
	static String s = ""; 
	static { s += "sb1 "; } 
	Explode() { 
		s += "e "; } 
} 
public class C4 extends Explode {   
	C4() { 
		s += "c4 "; 
		new Explode(); 
	} 
	static {  
		new C4(); 
		System.out.print(s); 
	} 
	{ s += "i "; } 
	public static void main(String[] args) { } 
}