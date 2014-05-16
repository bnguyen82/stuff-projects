package exams.api.practice.exam2.ex05;

public class Self extends Thread { 
	   public static void main(String[] args) { 
	     try { 
	       Thread t = new Thread(new Self()); 
//	       t.start(); 
	       Thread t2 = new Thread (new Self(), "bao");
	       t2.setPriority(Thread.MAX_PRIORITY);
	       t.setPriority(Thread.MIN_PRIORITY);
	       t.start(); 
	       t2.start();
	       
	     } catch (Exception e) { System.out.print("e "); } 
	   } 
	   public void run() { 
	     for(int i = 0; i < 2; i++)    
	       System.out.print(Thread.currentThread().getName() + " "); 
	 } }