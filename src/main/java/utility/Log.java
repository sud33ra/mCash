package utility;

import org.apache.log4j.Logger;

public class Log {
	
private static Logger Log = Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String sTestCaseName){

		Log.info("****************************************************************************************");

		Log.info("****************************************************************************************");

		Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");

		Log.info("****************************************************************************************");

		Log.info("****************************************************************************************");

		}
	
	 public static void endTestCase(String sTestCaseName){

		 	Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+sTestCaseName+ "             XXXXXXXXXXXXXXXXXXXXXX");
		 
		 	Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");

			Log.info("X");

			Log.info("X");

			Log.info("X");

			Log.info("X");

	 	}
	 
	// Need to create these methods, so that they can be called 
	 
	 public static void info(String message) {

			Log.info(message);

			}

	 public static void warn(String message) {

	    Log.warn(message);

		}

	 public static void error(String mesaage) {

	    Log.error(mesaage);

		}

	 public static void fatal(String message) {

	    Log.fatal(message);

		}

	 public static void debug(String message) {

	    Log.debug(message);

		}
	 
	 public static void exception(String message, Exception e) {

		    Log.error(message, e);

			}
	 

}
