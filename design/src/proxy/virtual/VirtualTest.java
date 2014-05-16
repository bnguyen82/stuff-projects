package proxy.virtual;

public class VirtualTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDE ide = new ProxyIDE();
		ide.compile();
		ide.run();
		String aaa = ide.generateJavadoc();
		
		IDE ide1 = new ProxyIDE();
		String abc = ide1.generateJavadoc();
	}

}
