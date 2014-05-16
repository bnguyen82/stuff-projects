package exams.flow.practice.exam4.ex38;

public class Gauntlet { 
	   public static void main(String[] args) { 
	     String r = "0"; 
	     int x = 3, y = 4; 
	     boolean test = false; 
	     if((x > 2) || (test = true)) 
	     if((y > 5) || (++x == 4)) 
	     if((test == true) || (++y == 4)) 
	     r += "1"; 
	     else if(y == 5) r += "2"; 
	     else r += "3"; 
	     else r += "4"; 
	     // else r += "5"; 
	     System.out.println(r); 
	     if (test = true){
	    	 y++;
	     }
	 } 
}