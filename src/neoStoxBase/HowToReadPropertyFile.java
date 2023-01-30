package neoStoxBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HowToReadPropertyFile
{
public static void main(String[] args) throws IOException
{
	Properties prop=new Properties();
	FileInputStream myFile=new FileInputStream("C:\\Users\\A\\eclipse-workspace\\20_Aug_Evening_Selenium\\myProperty.properties");
	prop.load(myFile);
	String value = prop.getProperty("urlqa");
    System.out.println(value);
    System.out.println(prop.getProperty("mobile"));
	
}
}
