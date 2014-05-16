package exams.api.assessment.test2.ex05;
import java.text.*; 
import java.util.*; 
public class Gazillon { 
  public static void main(String[] args) throws Exception { 
    String s = "123,456"; 
    NumberFormat nf = NumberFormat.getInstance(new Locale("us")); 
    System.out.println(nf.parse(s)); 
    nf.setMaximumFractionDigits(2);   
    System.out.println(nf.format(s));   
  } 
}