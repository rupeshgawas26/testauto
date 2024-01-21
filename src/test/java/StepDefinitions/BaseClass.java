package StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BaseClass {

	public static Logger logger;
	
	public void setup() {
	    logger=LogManager.getLogger("LoggerDemo");
	}
}
	