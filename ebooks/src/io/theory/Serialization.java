package io.theory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	 public static void main(String[] args){
		Bao c = Bao.TO;
		 try {
//			 FileWriter fw = new FileWriter("a.txt");
			 Bo bo = new Bo(new Integer(5));
			 bo.c="An"	;
			 FileOutputStream fos = new FileOutputStream("a.txt");
			 ObjectOutputStream os = new ObjectOutputStream(fos);
			 os.writeObject(bo);
			 os.close();
			 
			 FileInputStream fis = new FileInputStream("a.txt");
			 ObjectInputStream is = new ObjectInputStream(fis);
			 Bo bo1 = (Bo)is.readObject();
			 System.out.print("ddd");
		 }
		 catch (Exception e){
			 
		 }
		 
	 }

}
enum Bao {
	TO(2), NHO(1);
	private int c;
	Bao(int a){
		c=a;
	}
}
class  Bi {
	private int d;
	public String c;
	Bi(){
		System.out.print("");
	}
}
class Bo extends Bi implements Serializable{
	 private transient Integer a;
	 private int b=3;
	 Bo(Integer b){
		 a=b;
	 }
}
