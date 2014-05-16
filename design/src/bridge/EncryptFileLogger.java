package bridge;


public class EncryptFileLogger extends FileLogger{
	@Override
	public void log(String msg) throws Exception{
		String encryptedMsg = msg+"eeeee";
		super.log(encryptedMsg);
	}
}
