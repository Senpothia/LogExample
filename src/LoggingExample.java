import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LoggingExample {
	
	static org.apache.logging.log4j.Logger logger = LogManager.getLogger(LoggingExample.class);
	
	private void loggerLevel(String message) {
		if (logger.isDebugEnabled()){
			logger.debug("this is set to debug: "+ message);
		}
		
		if (logger.isInfoEnabled()){
			logger.info("this is set to info: "+ message);
		}
		
		logger.warn("this is set to info: " + message);
		logger.error("this is set to error: " + message);
		logger.fatal("this is set to fatal: " + message);
	}

	public static void main(String[] args) {
		LoggingExample loggingExample = new LoggingExample();
		loggingExample.loggerLevel("mode");

	}

}
