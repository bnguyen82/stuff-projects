package oop.selftest.ex09;
public class Redwood extends Tree {
	   public static void main(String[] args) {
	     new Redwood().go();
	   }
	   void go() { 
//	     go2(new Tree(), new Redwood()); 
//	     go2((Redwood) new Tree(), new Redwood());
		   go2(new Redwood(), new Redwood()); 
	     go2((Tree) new Redwood(), new Redwood());
	  }
//	  void go2(Tree t1, Redwood r1){
//	     Redwood r2 = (Redwood)t1;
//	     Tree t2 = (Tree)r1;
//	  }
		  void go2(Tree t1, Redwood r1){
//	     Redwood r2 = (Redwood)t1;
//	     Tree t2 = (Tree)r1;
			  System.out.println("go2 Tree");
	  }
	  void go2(Redwood t1, Redwood r1){
//		     Redwood r2 = (Redwood)t1;
//		     Tree t2 = (Tree)r1;
		  System.out.println("go2 Redwood");

	  }
	}
	class Tree { }