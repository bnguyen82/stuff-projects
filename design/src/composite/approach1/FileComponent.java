package composite.approach1;

public class FileComponent implements FileSystemComponent1 {
	private int size;
	public FileComponent(int size) {
		this.size = size;
	}
	@Override
	public int getComponentSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
