package exams.fundamentals.practice.exam3.ex50;

import java.util.*; 
public class Foggy extends Murky { 
  public static void main(String[] args) { 
    final List<String> s = new ArrayList<String>();
    s.add("a");  s.add("f");  s.add("a"); 
    new Foggy().mutate(s); 
    System.out.println(s); 
  } 
  List<String> mutate(List<String> s) { 
    List<String> ms = s; 
    ms.add("c"); 
    return s; 
  } 
}   
class Murky { 
  final void mutate(Set s) { } 
}