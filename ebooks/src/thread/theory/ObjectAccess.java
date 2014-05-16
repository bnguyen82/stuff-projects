package thread.theory;

public class ObjectAccess extends Thread{
	static ObjectOOP o = new ObjectOOP();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread (new ObjectAccess());
		Thread t2 = new Thread (new ObjectAccess());
		t1.start();
		t2.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		o.getA();
		o.setA(3);
	}
 
}
class ObjectOOP {
	private int a;

	public static synchronized int getA() {
//		System.out.print("");
		return 3;
	}

	public static synchronized void setA(int a) {
//		this.a = a;
		System.out.print("");
	}
	
}
