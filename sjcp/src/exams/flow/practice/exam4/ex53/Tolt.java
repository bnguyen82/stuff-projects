package exams.flow.practice.exam4.ex53;

public class Tolt { 
	public static void checkIt(int a) {  
		if(a == 1)  throw new IllegalArgumentException();  
	} 
	public static void main(String[] args) { 
		for(int x=0; x<2; x++)  
			try {  
				System.out.print("t ");  
				checkIt(x);  
				System.out.print("t2 ");  
			} 
		finally { System.out.print("f "); }     
	} }
