package commontest.test1;

import commontest.ClassA;

public class ClassB extends ClassA{
	private int b = 4;
	public void accessA(){
//		int c = super.a;
//		a = 5;
//		privateA();
	}
	class ClassB1{
		public void accessA(){
			int d = getA();
		}
	}
}
