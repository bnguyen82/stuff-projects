package oop.selftest.ex02;

class Top {
	  public Top(String s) { System.out.print("B"); }
	}
	public class Bottom2 extends Top {
	  public Bottom2(String s) { 
		  super("C");
	  System.out.print("D"); }
	  public static void main(String [] args) {
	    new Bottom2("C");
	    System.out.println(" ");
	} }