package thread.theory;

public class WaitNotify extends Thread{
	static Integer in = 1;
	/**
	 * @param args
	 */
	public void run(){
		synchronized (in) {
			try{
			in.wait();
			System.out.print("wakeup");
			}catch (Exception e){}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new WaitNotify());
		Thread t2 = new Thread(new WaitNotify());
		t1.start();t2.start();
		synchronized (in) {
			in.notifyAll();
			System.out.print("notify");
		}
	}

}
