package exams.thread.practice.exam2.ex30;

public class Zingseng extends Thread { 
	public static void main(String[] args) { 
		Thread t1 = new Thread(new Zingseng()); 
		Thread t2 = new Thread(){
			public void run(){
				for(int i = 0; i < 10; i++)
				System.out.print(Thread.currentThread().getName());
			}
		};
		
		t1.start(); 
//		t2.start();
//		t2.setPriority(9);
		System.out.print("done t2")	;
//		t2.sleep(10000);
		System.out.print("sleep t2")	;
		// insert code here 
//		t1.join();
//		t1.yield();
//		t1.sleep(1s000); 
		for(int i = 0; i < 10; i++)  // Loop #1 
			System.out.print(Thread.currentThread().getName() + " B"); 
	} 
	public void run() { 
		for(int i = 0; i < 10; i++)  // Loop #2 
			System.out.print(Thread.currentThread().getName() + " "); 
	} }