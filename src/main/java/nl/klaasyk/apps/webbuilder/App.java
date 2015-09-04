package nl.klaasyk.apps.webbuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final String APPNAME = "Appname";
	private static final String VERSION = "v0.0.1";
	
    public static void main( String[] args )
    {
    	Logger l = LoggerFactory.getLogger(App.class);
    	l.info("{} {}", APPNAME, VERSION);
        System.out.println( "Hello World!" );
    }

}
