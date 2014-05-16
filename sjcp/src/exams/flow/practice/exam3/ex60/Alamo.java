package exams.flow.practice.exam3.ex60;

public class Alamo { 
	public static void main(String[] args) { 
		try { 
			assert(!args[0].equals("x")): "kate"; 
		} catch(Error e) { System.out.print("ae "); } 
		finally { 
			try { 
				assert(!args[0].equals("y")): "jane"; 
			} catch(Exception e2) {
				go();
				System.out.print("ae2 "); 
			} 
			finally { 
//				throw new IllegalArgumentException(); 
			}
		} 
	}
	public static void go(){
		int a = 1;
	}
}