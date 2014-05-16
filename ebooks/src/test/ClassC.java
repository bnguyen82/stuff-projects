package test;

public class ClassC extends ClassB{
	public int f;
	public void an(){
		final int e = 4;
		ClassA a = new ClassA(3){
			public int t=c;
			@Override
			public void in() {
				// TODO Auto-generated method stub
				int d = e+c;
			}
		};
		a.in();
		a.in1();
	}
	public class ClassD{
		int e=f;
	}
}
