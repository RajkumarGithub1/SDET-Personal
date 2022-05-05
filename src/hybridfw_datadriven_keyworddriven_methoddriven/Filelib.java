package hybridfw_datadriven_keyworddriven_methoddriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Filelib 
{
	public String readPropertyData(String path, String key) throws Throwable
	{
		//OPen File in Read mode
		FileInputStream fis=new FileInputStream(path);
	
		//Create an Object of properties class
		Properties prop=new Properties();
		
		//take Control of File
		prop.load(fis);
		
		//Give the Key to its value
		String propValue = prop.getProperty(key, "Incorrect Key");
		
		 //return property value to method
		return propValue;
		
		
		
	}
}
