package keyWordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertyData 
{

	public static void main(String[] args) throws Throwable 
	{
          
		//OPen File in Read mode
		FileInputStream fis=new FileInputStream("./data/config.properties");
        
		//Create an Object of properties class
		Properties prop=new Properties();
		
		//take Control of File
	    prop.load(fis);
	    
	    //Give the Key to its value
	    //String propValue=prop.getProperty("trainer_name");     //it has single argument
	    String propValue=prop.getProperty("user", "Incorrect key");  //two arguments
	    
	    //print it
	    System.out.println(propValue);
           
           
	}

}
