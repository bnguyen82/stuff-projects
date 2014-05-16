package innerclass.theory;

public class Outer {
	private int outva;
	static Inner in3;
	public static void main(String[] args){
		new Outer().method2();
		System.out.print("a");
		new Outer().method(new Outer().new Inner2(){public void methodIn(){
			//int c=outva;
			}});
		}
	
	public void methodA(){
		Inner in = new Outer().new Inner();
		method(new Inner2());
		Thread t = new Thread (new Runnable(){
				public void run(){
					int d = outva;
				}
			});
	}

	public void method(Inner2 inner){
		Inner in1 = new Inner();
	}
	public void method2(){
		final Inner in1 = new Inner();
		class Inner3 extends Inner{
			Inner in = in1;
		} ;
		 in3 = new Inner3();
	}
	
	class Inner2{
		private int a=3;
		public  void methodIn(){
			int c = outva;
		}
	}
	
	class Inner{
		private int a=3;
		public  void methodIn(){
			int c = outva;
		}
	}
	static class Nest{
		public void staticNest(){
//			int e = outva;
		}
	}
}
