package dump.q130;
interface A { public void aMethod(); }
interface B { public void bMethod(); }
interface C extends A,B { public void cMethod(); }
class D implements B {
	private void sound(){};
public void bMethod(){System.out.print("D");}
}
class E extends D implements C {
	private static int sound(){return 1;};
	public void aMethod(){}
	public void bMethod(){System.out.print("E");}
	public void cMethod(){}
}
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D a = new D();a.bMethod();
		D b = (D)new E();b.bMethod();
		new Thread() {
			public void run() { ; }
			}.start();
	}

}
