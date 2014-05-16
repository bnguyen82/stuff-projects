package exams.api.practice.exam2.ex08;
import java.io.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  try { 
			    File file = new File("myFile.txt"); 
//			    FileWriter w1 = new FileWriter(file);
//			    w1.write("Bao");
//			    w1.flush();
//			    w1.close();
			    FileReader fr=new FileReader(file);
			    BufferedReader bf = new BufferedReader(fr);
			    String a = bf.readLine();
			    FileOutputStream ot = new FileOutputStream(file);
			    PrintWriter pw = new PrintWriter(ot);
			    System.out.print(file.exists());
//			    FileWriter w = new FileWriter(file);
//			    BufferedWriter bw = new BufferedWriter();
			    pw.println("line 1"); 
			    pw.close(); 
			    PrintWriter pw2 = new PrintWriter("myFile.txt"); 
			    pw2.println("line 2"); 
			    pw2.close(); 
			  } catch (IOException e) { }
	}

}
