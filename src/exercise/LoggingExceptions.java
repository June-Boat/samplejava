/**
 * 
 */
package exercise;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author June-Boat
 *
 */
class LoggingException extends Exception {
	private static Logger log= Logger.getLogger("LoggingException");
	public LoggingException() {
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		log.severe(trace.toString());
	}
}

public class LoggingExceptions{
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		}catch(LoggingException e) {
			System.err.println("Caught "+e);
		}
		try {
			throw new LoggingException();
		}catch(LoggingException e) {
			System.err.println("Caught "+e);
		}
	}
}
