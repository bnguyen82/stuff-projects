package exams.api.practice.exam1.ex41;

import java.util.regex.*; 
public class Test { 
  public static void main(String[] args) { 
    Pattern p = Pattern.compile("ab"); 
    Matcher m = p.matcher("abcdab"); 
    while(m.find()) 
      System.out.print(m.group() + " "); 
    	System.out.print(m.start() + " "); 
    	System.out.print(m.end() + " "); 
} }
