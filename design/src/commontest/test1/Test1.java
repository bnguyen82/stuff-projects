package commontest.test1;

public class Test1 {
	public static void main(String[] args) {
		ClassB classB = new ClassB();
		int bbbbb = classB.getA();
		
		ClassB.ClassB1 classB1 = (new ClassB()).new ClassB1();
		classB1.accessA();
	}
}
