package exams.oop.assessment.test2.ex07;

class Game { 
	static String s = "-"; 
	String s2 = "s2"; 
	Game() { 
		s += ""; } 
	static {
		s+="st";
	}
} 
public class Go extends Game { 
	Go() { 
		s="end"; } 
	{ 
		s += "i "; 
	} 
	public static void main(String[] args) { 
		new Go(); 
		System.out.println(s); 
	} 
	static { 
		s += "sb "; } 
}