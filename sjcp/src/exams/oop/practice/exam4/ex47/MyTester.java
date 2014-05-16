package exams.oop.practice.exam4.ex47;

class MySuper { 
	protected MySuper() { 
		System.out.print("ms "); 
	} 
} 
public class MyTester extends MySuper { 
	private MyTester() { 
		System.out.print("mt "); } 
	public static void main(String[] args) { 
		new MySuper();     
		class MyInner { 
			private MyInner() { 
				System.out.print("mi "); 
			} 
			{ 
				new MyTester(); 
			} 
			{ 
				new MySuper(); 
			} 
		} 
		new MyInner(); 
	} 
}