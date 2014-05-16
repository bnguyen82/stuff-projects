package thread.expand;

import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {
  public static void main(String args[]) {
    CountDownLatch cdl = new CountDownLatch(5);
    CountDownLatch cdl2 = new CountDownLatch(5);
    CountDownLatch cdl3 = new CountDownLatch(5);
    CountDownLatch cdl4 = new CountDownLatch(5);
    CountDownLatch cd2 = new CountDownLatch(5);
    ExecutorService es = Executors.newFixedThreadPool(1);
    try{
	    Class a = Class.forName("thread.expand.MyThread");
	    InetAddress inetAddress = 
	    	InetAddress.getByName("74.125.71.147");  
	    System.out.print("");
	    }catch(Exception e){
	    	System.out.print("");
	    }
	    
  
    es.execute(new MyThread(cdl, "A"));
    es.execute(new MyThread(cdl2, "B"));
    es.execute(new MyThread(cdl3, "C"));
    es.execute(new MyThread(cdl4, "D"));
    es.execute(new MyThread1(cd2, "E"));

//    try {
////      cdl.await();
////      cdl2.await();
////      cdl3.await();
////      cdl4.await();
//    } catch (InterruptedException exc) {
//      System.out.println(exc);
//    }

    es.shutdown();
  }
}

class MyThread implements Runnable {
  String name;

  CountDownLatch latch;

  MyThread(CountDownLatch c, String n) {
    latch = c;
    name = n;
    new Thread(this);
  }

  public void run() {
    for (int i = 0; i < 5; i++) {
      latch.countDown();
    }
    System.out.print(name);
  }
}

final class MyThread1 implements Runnable {
	  String name;

	  CountDownLatch latch;

	  MyThread1(CountDownLatch c, String n) {
	    latch = c;
	    name = n;

	    new Thread(this);
	  }

	  public void run() {
	    for (int i = 0; i < 5; i++) {
	      latch.countDown();
	    }
	    System.out.print(name);
	  }
	}