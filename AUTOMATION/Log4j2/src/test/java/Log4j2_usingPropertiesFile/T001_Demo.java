package Log4j2_usingPropertiesFile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class T001_Demo {
	private static final Logger logger = LogManager.getLogger(T001_Demo.class);
	
    public static void main(String[] args) {
        logger.trace("This is a TRACE message");
        logger.debug("This is a DEBUG message");
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");
        logger.fatal("This is a FATAL message");
        
        //Note: If logs not created on 'logs/app222.log' just rename 'log4j2.xml' file to 'lllllog4j2.xml'
        System.out.println("@@@@Check 'logs/app222.log' file"); //specified this path in 'log4j2.properties' file
        //Note: If logs not created on 'logs/app222.log' just rename 'log4j2.xml' file to 'lllllog4j2.xml'
    }
}
