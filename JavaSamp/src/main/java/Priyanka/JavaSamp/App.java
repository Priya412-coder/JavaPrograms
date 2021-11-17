package Priyanka.JavaSamp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String message = "Hello World!";
    	LOG.debug(message + "will be printed on Debug");
    	LOG.info(message + "will be printed on Info");
    	LOG.warn(message + "will be printed on Warn");
    	LOG.error(message + "will be printed on Error");
    	LOG.fatal(message + "will be printed on Fatal");
    	LOG.info("Appending string: {}.", message);
    	System.out.println(message);
    }
}
