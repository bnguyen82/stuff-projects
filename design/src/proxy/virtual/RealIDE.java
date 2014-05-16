package proxy.virtual;

public class RealIDE extends IDE {
	private Javadoc javaDoc;
	public RealIDE() {
		javaDoc = new Javadoc("proxy-javadoc.txt");
	}	
	@Override
	public String generateJavadoc() {
		return javaDoc.printIt();
	}

}
