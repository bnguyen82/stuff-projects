package exams.api.practice.exam1.ex45;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "1234"; 
		 StringBuilder sb =  
		   new StringBuilder(s1.substring(2).concat("56").replace("7","6")); 
		 System.out.println(sb.append("89").insert(3,"x"));
		 
		 String s = ""; 
		 if(011 == 9) s += 4; 
		 if(0x11 == 17) s += 5; 
		 Integer I = 12345; 
		 Integer I1 = 12; 
		 if(I.intValue() == Integer.valueOf("12")) s += 6; 
		 System.out.println(s);
	}

}
