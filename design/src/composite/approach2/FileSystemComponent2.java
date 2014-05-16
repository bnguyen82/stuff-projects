package composite.approach2;

public abstract class FileSystemComponent2 {
	private String name;
	public FileSystemComponent2(String name) {
		this.name = name;
	}
	public abstract int getComponentSize();
	public void addComponent(FileSystemComponent2 compo) throws RuntimeException{
		throw new RuntimeException("Doesn't support");
	}
	public FileSystemComponent2 getComponent(int location) throws RuntimeException{
		throw new RuntimeException("Doesn't support");
	}
}
