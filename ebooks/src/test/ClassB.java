package test;

public class ClassB extends ClassA{
	 public int a=8;
	 public static final void in1(){
		 System.out.print("A");
		 
	 }
	 public void in(){
		 int d = a+c;
		 System.out.print("B");
	 }
	 public static void main(String[] args) {
		ClassA b = (ClassA)new ClassB();
		System.out.print(b.a);
		
		b.in();
		ClassC d = new ClassC();
		
		d.an();
		ClassA a = new ClassA(){

			@Override
			public void in() {
				// TODO Auto-generated method stub
				int d = c;
			}
			
		};
		ClassB e = (ClassB)a;
		ClassC f = (ClassC)e;
		ClassA dd=(ClassA)f;
	 }
}
