package memento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;
import java.util.StringTokenizer;

public class DataProcess {
	private StatusMemento memento;
	private String currentID = "";
	public DataProcess(StatusMemento memento) {
		if (memento != null){
			currentID = memento.getID();
		}
	}
	public void setMemento(StatusMemento memento) {
		this.memento = memento;
	}

	public StatusMemento getMemento() {
		return memento;
	}
	public void process(String txtFileName) {
		try{
			BufferedReader br = new BufferedReader(new FileReader(txtFileName));
			String line = null;
		
			while ((line=br.readLine())!=null){
				StringTokenizer tk = new StringTokenizer(line, ",");
				
				currentID = tk.nextToken();
				
				String select = "SELECT * FROM A WHERE ID=" +
						currentID + " AND NAME=" + tk.nextToken();
						
			}
		}
		catch(Exception e){
			memento.setID(currentID);
		}
		
	}
	public class StatusMemento implements Serializable{
		private String ID;
		public StatusMemento(String id) {
			this.ID = id;
		}
		public void setID(String iD) {
			ID = iD;
		}

		public String getID() {
			return ID;
		}
	}
}
