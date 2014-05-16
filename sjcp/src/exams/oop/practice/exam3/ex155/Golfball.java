package exams.oop.practice.exam3.ex155;

class Ball { 
	static String s = ""; 
	void doStuff() { s += "bounce "; } 
} 
class Basketball extends Ball { 
	void doStuff() { s += "swish "; } 
} 
public class Golfball extends Ball { 
	public static void main(String[] args) { 
		Ball b = new Golfball(); 
		Basketball bb = (Basketball)b; 
		b.doStuff(); 
		bb.doStuff(); 
		System.out.println(s);    
	} 
	void doStuff() { s += "fore "; } 
}