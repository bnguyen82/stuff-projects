package exams.thread.assessment.test2.ex08;

public class Salmon extends Thread { 
	   public static long id; 
	   public void run() { 
	     for(int i = 0; i < 4; i++) { 
	       // insert code here 
	    	if(i == 2 ) {
	         new Thread(new Salmon()).start(); 
	         throw new Error(); 
	       }  
	       System.out.print(i + " ");   
	   } } 
	   public static void main(String[] args) throws Exception{  
	     Thread t1 = new Salmon(); 
	     id = t1.getId(); 
	     t1.start(); 
	     t1.sleep(300);
	 } }