package bridge.apply;

import bridge.MessageLogger;

public class TextLogging implements MessageLogging {
	MessageLogger logger;
	public TextLogging(MessageLogger logger){
		this.logger = logger;
	}
	@Override
	public void log(String msg) throws Exception{
		logger.log(msg);
	}

}
