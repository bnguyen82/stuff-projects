package exams.collection.practice.exam4.ex39;
public class Organic<E> { 
	void react(E e) { } 
	static void main(String[] args) { 
//		 Organic<? extends Organic> compound = new Aliphatic<Organic>(); 
		 Organic<? super Aliphatic> compound = new Aliphatic<Organic>(); 
//		compound.react(new Organic());    
		compound.react(new Aliphatic());  
		compound.react(new Hexane());  
	} } 
class Aliphatic<F> extends Organic<F> { } 
class Hexane<G> extends Aliphatic<G> { }
