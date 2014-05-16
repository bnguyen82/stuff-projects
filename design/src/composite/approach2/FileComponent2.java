package composite.approach2;

public class FileComponent2 extends FileSystemComponent2 {
	private int size;
	public FileComponent2(String name, int size) {
		super(name);
		this.size = size;
	}
	@Override
	public int getComponentSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
