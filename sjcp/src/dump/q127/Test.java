package dump.q127;

public class Test {
//	 static final int[] a = { 100,200 };
//	 static final int[] a; static { a=new int[2]; a[0]=100; a[1]=200; }
//	 static final int[] a = new int[2]{ 100,200 };
	   int[] a; 
//	 static void init() { a = 1; }
Test(){
	int[] b=a;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] b;
		new Test().go();
//		b=a;
//		int a =b;
		// TODO Auto-generated method stub
		 String test = "This is a test";
//		 String[] tokens = test.split("\s");
//		 System.out.println(tokens.length);
	}
	public void go(){
		int[] b =a;
	}

}
