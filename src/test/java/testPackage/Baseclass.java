package testPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testUtility.BrowserWait;
import testUtility.Screenshot;
import testUtility.Staticbrowser;

public class Baseclass {
 
	
	
	
  public static	ExtentReports  report;
  public static ExtentHtmlReporter extent;
  public static ExtentTest logger;
	
	
	
	static WebDriver driver;
	@Parameters({"browserName"})
	@BeforeTest
	public void beforetest(String browserName)
	{
		  report=new ExtentReports();
		extent=new ExtentHtmlReporter("test-output"+File.separator+"Reports"+File.separator+"HrmThread"+System.currentTimeMillis()+".html");
		report.attachReporter(extent);
		WebDriver driver=Staticbrowser.openbrowser(browserName, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		this.driver=driver;
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		BrowserWait.waitForWebPage(driver, 20);
	}
	
	

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException, InterruptedException
	{
	
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Thread.sleep(3000);
	//	String path=	Screenshot.capturePageScreenshot(driver);
	//	logger.fail("test cases is failed", MediaEntityBuilder.createScreenCaptureFromBase64String(path).build());
		
		
			String path=Screenshot.captureScreenshot(driver);
			
			
		logger.fail(" teat case is failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}
		else
		{
			logger.pass("test case is passed");
		}
		report.flush();// it is used to add the status or to update
		
	}
	
	
	
	
	
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
	
	
	
}
