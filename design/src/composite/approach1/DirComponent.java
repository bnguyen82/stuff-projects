package composite.approach1;

import java.util.Enumeration;
import java.util.Vector;

public class DirComponent implements FileSystemComponent1 {
	private Vector<FileSystemComponent1> vector;
	public DirComponent() {
		vector = new Vector<FileSystemComponent1>();
	}
	public void addComponent(FileSystemComponent1 compo){
		vector.add(compo);
	}
	public FileSystemComponent1 getComponent(int loc){
		return vector.elementAt(loc);
	}
	@Override
	public int getComponentSize() {
		int size = 0;
		for (Enumeration<FileSystemComponent1> enum1 = vector.elements();enum1.hasMoreElements();) {
			FileSystemComponent1 compo = (FileSystemComponent1)enum1.nextElement();
			size += compo.getComponentSize();
		}
		return size;
	}

}
