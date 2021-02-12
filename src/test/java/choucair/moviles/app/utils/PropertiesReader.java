package choucair.moviles.app.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesReader {

	private static final Logger LOGGER = Logger.getLogger(PropertiesReader.class.getName());
	
	private static Properties properties;
	
	private PropertiesReader() {
	    throw new IllegalStateException("Utility class");
	  }
	
	public static String getPropiedad(String prop){
		return getProperties().getProperty(prop);
	}
	
	private static Properties getProperties()
	{
		if(properties == null)
		{
			properties = new Properties();
			try {
				properties.load(new FileReader("serenity.properties"));
			} catch (IOException e) {
				LOGGER.log(Level.WARNING,"IOException", e);
			}
		}
		return properties;
	}
}
