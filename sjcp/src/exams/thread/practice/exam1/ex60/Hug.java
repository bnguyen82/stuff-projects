package exams.thread.practice.exam1.ex60;
public class Hug implements Runnable { 
	   static Thread t1; 
	   static Hold h, h2; 
	   public void run() { 
	     if(Thread.currentThread().getId() == t1.getId()) 
	    	 h.adjust(); 
	     else 
	    	 h2.view(); 
	   } 
	   public static void main(String[] args) { 
	     h = new Hold(); 
	     h2 = new Hold();
	    Hug hug = new Hug();
	     t1 = new Thread(hug); 
	     t1.start(); 
	     new Thread(hug).start(); 
	   } } 
	   class Hold { 
	     static int x = 2; 
	      synchronized void adjust(Hold h) {    
	       System.out.print(x-- + " "); 
	       try { Thread.sleep(400); } catch (Exception e) { ; } 
	       h.view(h); 
	     } 
	      synchronized void view(Hold h) { 
	       try { Thread.sleep(200); } catch (Exception e) { ; } 
	       if(x > 0) adjust(h); 
	   } }