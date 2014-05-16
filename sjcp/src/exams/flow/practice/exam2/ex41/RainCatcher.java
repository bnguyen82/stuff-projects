package exams.flow.practice.exam2.ex41;

class RainCatcher { 
	static StringBuffer s = new StringBuffer(); 
	public static void main(String[] args) { 
		Integer i = new Integer(42); 
		for(int j = 38; j < i; i--) 
			switch(i) { 
			case 40: s.append("40 "); 
			case 41: s.append("41 "); 
			case 42: s.append("42 "); 
			default: s.append("def "); 
			} 
		System.out.println(s); 
	} 
}
