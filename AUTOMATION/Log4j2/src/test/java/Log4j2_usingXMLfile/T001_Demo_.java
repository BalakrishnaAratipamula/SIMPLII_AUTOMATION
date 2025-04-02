package Log4j2_usingXMLfile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class T001_Demo_ {
	private static final Logger logger = LogManager.getLogger(T001_Demo_.class);
	
	//Log levels Hierarchy: TRACE < DEBUG < INFO < WARN < ERROR < FATAL < OFF
	public static void main(String[] args) {
		logger.trace("This is a TRACE message");
		logger.debug("This is a DEBUG message");
		logger.info("This is an INFO message");
		logger.warn("This is a WARN message");
		logger.error("This is an ERROR message");
		logger.fatal("This is a FATAL message");
		
		//Note: If logs not created on 'logs/app111.log' just rename 'log4j2.properties' file to 'lllllog4j2.properties'
		System.out.println("@@@@Check 'logs/app111.log'"); //specified this path in 'log4j2.xml' file
		//Note: If logs not created on 'logs/app111.log' just rename 'log4j2.properties' file to 'lllllog4j2.properties'
	}
}
