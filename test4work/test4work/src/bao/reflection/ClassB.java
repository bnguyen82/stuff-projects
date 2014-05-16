package bao.reflection;

import java.lang.reflect.Field;

public class ClassB extends ClassA {
	private String a = "Bao1";
	public String getPrivateField(String fieldName)throws Exception{
		Class<ClassA> clA = ClassA.class;
		Field f = clA.getDeclaredField(fieldName);
//		f.setAccessible(true);
		return (String) f.get(this);
	}
	public static void main(String[] args) throws Exception{

		ClassB clB = new ClassB();
		String priField = clB.getPrivateField("a");
	}
}
