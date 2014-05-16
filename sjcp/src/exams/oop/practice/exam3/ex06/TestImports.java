package exams.oop.practice.exam3.ex06;

import static exams.oop.practice.exam3.ex06.MyClass.*;  
public class TestImports { 
  public static void main(String[] args) {  
    System.out.print(myConstant + " "); 
    howdy(); 
    System.out.print(mc.instVar + " "); 
    System.out.print(instVar + " "); 
} 
 public void ddd(){
	 MyClass a = new MyClass();
	 int d = a.instVar;
	 int d1 = a.instVar1;
	 
 }
}
