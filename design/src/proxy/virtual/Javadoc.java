package proxy.virtual;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Javadoc {
	private File file ;
	public Javadoc(String fileName) {
		// TODO Auto-generated constructor stub
		try{
			file = new File(fileName);
		}
		catch(Exception e){
			
		}
	}
	public String printIt() {
		// TODO Auto-generated method stub
		StringBuffer content = new StringBuffer();
		String line ="";
		try{
			BufferedReader  reader = new BufferedReader(new FileReader(file));
			while ((line=reader.readLine())!=null){
				content.append(line);
			}
		}catch(Exception e){
			System.out.print(e);
		}
		return content.toString();
	}

}
