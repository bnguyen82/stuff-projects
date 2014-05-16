package composite.approach1;

public class Composite1Test {
	public static void main(String[] args) {
		DirComponent dir = new DirComponent();
		DirComponent dir1 = new DirComponent();
		FileComponent file1 = new FileComponent(10);
		FileComponent file2 = new FileComponent(20);
		
		dir.addComponent(dir1);
		dir.addComponent(file1);
		dir1.addComponent(file2);
		
		int size1 = file1.getComponentSize();
		int size2 = dir1.getComponentSize();
		int size3 = dir.getComponentSize();
		
	}
}
