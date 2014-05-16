package exams.fundamentals.practice.exam2.ex18.pack1;

import exams.fundamentals.practice.exam2.ex18.pack2.*; 
public class Launcher extends Utils{ 
  public static void main(String[] args) { 
    //not same package
	Utils u = new Utils(); 
    u.do1(); 
    u.do2();
    do2();
    u.do3(); 
    
    //same package
    Utils1 u1= new Utils1();
    u1.do1();
    u1.do2();
    u1.do3();
} 
  public void main1(String[] args) { 
	    Utils u = new Utils(); 
	    u.do1();
	    u.do2();
	    do2(); 
	    u.do3(); 
	    do4();
	}
}
