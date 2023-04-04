package testUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	
	    public static String capturePageScreenshot(WebDriver driver) throws IOException
	  {
		String path="test-output"+File.separator+"Screenshots"+File.separator+System.currentTimeMillis()+".png";
		String source=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		File dest=new File(path);
		//FileHandler.copy(source, dest);
		
		 return source;
	  }
	
	
	
	              //           OR
	
	
	public static  String captureScreenshot(WebDriver driver) throws IOException
	{//C:\Users\Administrator\eclipse-workspace\HRM==System.getProperty("user.dir")
		
		String path=System.getProperty("user.dir")+File.separator+"test-output"+File.separator+"Screenshots"+File.separator+System.currentTimeMillis()+".png";
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		FileHandler.copy(source, dest);
		
		 return path;
	}
	
	
	
	
	
	
	
}
