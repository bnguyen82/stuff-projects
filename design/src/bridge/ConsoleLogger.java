package bridge;

public class ConsoleLogger implements MessageLogger {

	@Override
	public void log(String msg) {
		System.out.print(msg);
	}

}
