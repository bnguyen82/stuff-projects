package proxy.virtual;

public class ProxyIDE extends IDE{
	private RealIDE realIDE;
	@Override
	public String generateJavadoc() {
		if (realIDE == null) {
			realIDE = new RealIDE();
		}
		return realIDE.generateJavadoc();
	}
}
