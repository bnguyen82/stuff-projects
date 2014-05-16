package thread.theory;
public class DeadLock extends Thread{
	static Thread t1 ;
	static ObjectOP ob1,ob2;
	public void run(){
	   if (Thread.currentThread() == t1) 
		   ob1.methodA(ob2);
	   else 
		   ob2.methodB(ob1);
	}
	public static void main(String[] args) {
		DeadLock dead = new DeadLock();
		 ob1 = new ObjectOP();
		 ob2 = new ObjectOP();
		t1 = new Thread(dead);
		Thread t2 = new Thread(dead);
		t1.start();
		t2.start();
	}
}
class ObjectOP{
	public synchronized void methodA (ObjectOP ob1){
		ob1.methodB(ob1);
	}
	public synchronized void methodB (ObjectOP ob2){
		ob2.methodA(ob2);
	}
}
