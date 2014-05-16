package thread.selftest.ex16;

public class ChicksYack implements Runnable {
	   Chicks c;
//	   static Chicks c = new Chicks(); ;
//	   public ChicksYack(){
//		   c = new Chicks();
//	   }
	   public static void main(String[] args) {
	     new ChicksYack().go();
	   }   
	   void go() {
	     c = new Chicks();
	     new Thread(new ChicksYack()).start();
	     new Thread(new ChicksYack()).start();
	   }
	   public void run() {
	     c.yack(Thread.currentThread().getId());
	   }
	 }