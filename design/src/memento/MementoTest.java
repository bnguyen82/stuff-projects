package memento;

public class MementoTest {

	public static void main(String[] args) {
		StatusHandler handler = new StatusHandler();
		DataProcess process  = null;
		try {
			process = new DataProcess(handler.getMemento());
		
			process.process("memento.txt");
		}
		catch(Exception e){
			try {
			handler.saveMemento(process.getMemento());
			}catch(Exception e1){}
		}
		finally{
			
		}
	}
}
