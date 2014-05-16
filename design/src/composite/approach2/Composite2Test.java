package composite.approach2;

import composite.approach2.DirComponent2;
import composite.approach2.FileComponent2;

public class Composite2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirComponent2 dir = new DirComponent2("root");
		DirComponent2 dir1 = new DirComponent2("sub");
		FileComponent2 file1 = new FileComponent2("file1",10);
		FileComponent2 file2 = new FileComponent2("file2",20);
		
		dir.addComponent(dir1);
		dir.addComponent(file1);
		dir1.addComponent(file2);
		
		int size1 = file1.getComponentSize();
		int size2 = dir1.getComponentSize();
		int size3 = dir.getComponentSize();
		file1.addComponent(file2);
	}

}
