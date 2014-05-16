package exams.flow.practice.exam4.ex31;

import java.io.*; 
public class Edgy {  
  public static void main(String[] args) { 
    try { 
      wow(); 
//       throw new IOException(); 
    } finally { 
       throw new Error(); 
      // throw new IOException(); 
    } 
  } 
  static void wow() { 
     throw new IllegalArgumentException(); 
    // throw new IOException(); 
} }