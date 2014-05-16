package concurrency.lockorder;

public class LockOrderTest {
	public static void main(String[] args) {
		final FileSysUtil util = new FileSysUtil();
		final Directory dir1 = new Directory("Games");
		final Directory dir2 = new Directory("Data");

		Thread thread1 = new MoveDir(dir1, dir2);
		Thread thread2 = new MoveDir(dir2, dir1);
		thread1.start();
		thread2.start();
		
	}
	static class MoveDir extends Thread{
		Directory src;
		Directory dest;
		public MoveDir(Directory src, Directory dest) {
			// TODO Auto-generated constructor stub
			this.src = src;
			this.dest = dest;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			FileSysUtil util = new FileSysUtil();
			util.moveContents(src, dest);
		}
	}
}	
