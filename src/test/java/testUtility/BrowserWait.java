package testUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class BrowserWait {

	
	public static void waitForWebPage(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
