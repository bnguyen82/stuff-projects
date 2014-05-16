package exams.oop.practice.exam4.ex40;
import exams.oop.practice.exam3.ex06.*;
interface Gadget { 
	int patent = 12345; 
	Gadget doStuff(); 
} 
public class TimeMachine extends MyClass implements Gadget { 
	int patent = 34567; 
	public static void main(String[] args) { 
		new TimeMachine().doStuff(); 
	} 
	TimeMachine doStuff() { 
		System.out.println( ++patent); 
		return new TimeMachine(); 
	} 
	// View modifier protected vs default
	public void ddd(){
		MyClass b = new MyClass();
		int c = instVar;
		int c = b.instVar;
		int c1 = instVar1;
	}
}