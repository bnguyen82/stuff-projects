package exams.oop.practice.exam1.ex08;

class SuperCool { 
	   static String os = ""; 
	   void doStuff() { os += "super "; } 
	 } 
	 public class Cool extends SuperCool {   
	   public static void main(String[] args) { 
	     new Cool().go(); 
	   } 
	   void go() { 
	     SuperCool s = new Cool();    
	     Cool c = (Cool)s;    
	     // insert code here 
	   } 
	   void doStuff() { os += "cool "; } 
	 }