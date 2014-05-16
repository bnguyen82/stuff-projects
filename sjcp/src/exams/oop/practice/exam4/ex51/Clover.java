package exams.oop.practice.exam4.ex51;
public class Clover extends Harrier { 
	String bark() { return "feed me "; } 
	public static void main(String[] args) { 
		Dog[] dogs = new Dog[3]; 
		dogs[0] = new Harrier(); 
		dogs[1] = (Dog)new Clover(); 
		dogs[2] = (Dog)new Harrier(); 
		for(Dog d: dogs)  System.out.print(d.bark()); 
	} } 
class Dog { String bark() { return "bark "; } } 
class Harrier extends Dog { String bark() { return "woof "; } }