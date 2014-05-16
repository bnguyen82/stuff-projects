package exams.api.practice.exam1.ex02;

public class Dec26 { 
	   public static void main(String[] args) { 
	     short a1 = 6; 
	     int b = 3;
	     new Dec26().go(a1); 
	     new Dec26().go(b); 
	     new Dec26().go(new Integer(7)); 
	     new Dec26().go(new Long(7)); 
	   } 
//	   void go(Short x) { System.out.print("S "); } 
	   void go(Long x) { System.out.print("L "); } 
//	   void go(int x) { System.out.print("i "); }  
	   void go(Number n) { System.out.print("N "); } 
	 }