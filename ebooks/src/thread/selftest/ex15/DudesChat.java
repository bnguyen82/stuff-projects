package thread.selftest.ex15;

public class DudesChat implements Runnable {
	   static Dudes d;
	   public static void main(String[] args) {
	     new DudesChat().go();
	   }
	   void go() {
	     d = new Dudes();
	     new Thread(new DudesChat()).start();
	     new Thread(new DudesChat()).start();
	   }
	   public void run() {
	     d.chat(Thread.currentThread().getId());
	   }
	 }