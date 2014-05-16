package exams.oop.practice.exam2.ex47;
class GardenTool { 
	static String s = ""; 
	String name = "Tool "; 
	GardenTool(String arg) { 
		this(); 
		s += name; } 
	GardenTool() { 
		s += "gt "; } 
} 
public class Rake extends GardenTool { 
	{ name = "Rake "; } 
	Rake(String arg) {
		super("Bao");
		s += name; } 
	public static void main(String[] args) { 
		new GardenTool("hey "); 
		new Rake("hi "); 
		System.out.println(s); 
	} 
	{ name = "myRake "; } 
} 