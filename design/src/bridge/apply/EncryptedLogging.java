package bridge.apply;

import bridge.MessageLogger;

public class EncryptedLogging implements MessageLogging {
	MessageLogger logger;
	public EncryptedLogging(MessageLogger logger) {
		this.logger = logger;
	}

	@Override
	public void log(String msg) throws Exception {
		String encryptedMsg = encryptMsg(msg) ;
		logger.log(encryptedMsg);	
			
	}

	private String encryptMsg(String msg) {
		return msg+ "heeehaa";
	}

}
