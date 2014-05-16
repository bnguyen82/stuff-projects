package exams.api.assessment.test2.ex03;

import java.io.*; 
import java.util.*; 
import static java.lang.Short.*; 
import static java.lang.Long.*; 
public class MathBoy { 
  public static void main(String[] args) { 
    long x = 123456789; 
    short y = 22766;  // maximum value of a short is 32767 
    float z = -33.2f;
//    System.out.printf("%1$+10d %2$010d ", x, 32767 - y); 
    System.out.printf("%1$+10d bao %2$010d ", x,  y); 
//    System.out.println(new Date()); 
  } 
}