package exams.thread.practice.exam2.ex16;

public class Stubborn implements Runnable { 
	static Thread t1; 
	static int x = 2; 
	public void run() { 
		if(Thread.currentThread().getId() == t1.getId()) 
			shove(); 
		else 
			push(); 
	} 
	static synchronized void push() { 
		shove(); } 
	static void shove() { 
		synchronized(Stubborn.class) { 
			System.out.print(x-- + " "); 
			try { Thread.sleep(2000); } catch (Exception e) { ; } 
			if(x > 0) push(); 
		} } 
	public static void main(String[] args) { 
		t1 = new Thread(new Stubborn()); 
		t1.start(); 
		new Thread(new Stubborn()).start(); 
	} }