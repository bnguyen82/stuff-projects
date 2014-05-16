package dump.q63;
 class Foo {
	 public int a = 3;
	 public void addFive() { 
		 a += 5;
		 System.out.print("f "); 
		}
 }
 class Bar extends Foo {
	 public int a = 8;
	 public void addFive() { 
		 this.a += 5; 
		 System.out.print("b " );
	}
 }
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Foo f = new Bar();
			f.addFive();
			System.out.println(f.a);
	}

}
