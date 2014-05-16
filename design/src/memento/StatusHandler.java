package memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StatusHandler {
	public DataProcess.StatusMemento memento;
	public DataProcess.StatusMemento getMemento() throws Exception{
		//TODO read file to build memento
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("save-memento.txt"));
		return (DataProcess.StatusMemento)is.readObject();
	}
	public void saveMemento(DataProcess.StatusMemento memento) throws Exception{
		//TODO save memento to file
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("save-memento.txt"));
		os.writeObject(memento);
	}
}
