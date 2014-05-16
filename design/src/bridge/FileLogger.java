package bridge;

import java.io.File;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;

public class FileLogger implements MessageLogger {

	@Override
	public void log(String msg) throws Exception{
		FileUtils.writeStringToFile(new File("log.txt"), msg, "unicode");
	}

}
