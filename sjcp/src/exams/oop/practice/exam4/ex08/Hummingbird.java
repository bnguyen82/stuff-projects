package exams.oop.practice.exam4.ex08;
class Bird { 
	public static String s = ""; 
	public static void fly() { s += "fly "; } 
	public int hashCode(){
		return 1;
	}
} 
public class Hummingbird extends Bird { 
	public static void fly() { s += "hover "; } 
	public static void main(String[] args) { 
		Bird b1 = new Bird(); 
		Bird b2 = new Hummingbird(); 
		Bird b3 = (Hummingbird)b2; 
		Hummingbird b4 = (Hummingbird)b2; 

		b1.fly();  b2.fly();  b3.fly();  b4.fly(); 
		System.out.println(s);   
	}
}