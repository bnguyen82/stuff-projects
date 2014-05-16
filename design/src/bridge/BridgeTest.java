package bridge;

import bridge.apply.EncryptedLogging;
import bridge.apply.MessageLogging;


public class BridgeTest {
	public static void main(String[] args) throws Exception{
		String text = "Bao";
		MessageLogger logger = new FileLogger();
		MessageLogging logging = new EncryptedLogging(logger);
		logging.log(text);
			
	}
}
