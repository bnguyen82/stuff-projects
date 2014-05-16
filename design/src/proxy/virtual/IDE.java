package proxy.virtual;

public abstract class IDE {
	private Runner runner;
	private Compilor compiler;
	public IDE() {
		compiler = new Compilor();
		runner = new Runner();
		// TODO Auto-generated constructor stub
	}
	public void run(){
		runner.run();
	}
	public void compile() {
		// TODO Auto-generated method stub
		compiler.compile();
	}
	abstract String generateJavadoc();
}
