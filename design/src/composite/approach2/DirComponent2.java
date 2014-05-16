package composite.approach2;

import java.util.Enumeration;
import java.util.Vector;

public class DirComponent2 extends FileSystemComponent2 {
	private Vector<FileSystemComponent2> vector;
	public DirComponent2(String name) {
		super(name);
		vector = new Vector<FileSystemComponent2>();
	}
	@Override
	public void addComponent(FileSystemComponent2 component2){
		vector.add(component2);
	}
	@Override
	public FileSystemComponent2 getComponent(int loc){
		return vector.elementAt(loc);
	}
	@Override
	public int getComponentSize() {
		// TODO Auto-generated method stub
		int size = 0;
		for (Enumeration<FileSystemComponent2> enum2 = vector.elements(); enum2.hasMoreElements();) {
			FileSystemComponent2 compo = enum2.nextElement();
			size += compo.getComponentSize();
		}
		return size;
	}

}
