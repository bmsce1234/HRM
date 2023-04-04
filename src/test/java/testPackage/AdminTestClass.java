package testPackage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompackage1.Admin;
import pompackage1.Loginpage;

public class AdminTestClass extends Baseclass {

	 Admin ad ;

	
	
	public void beforeclass()

	{
		
    //ad =new Admin (driver);//before class is used for handling alert & create object
	
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		
	}
	
	@Test(priority=0)
	public void verifyTheJoblist() throws InterruptedException
	{    logger=report.createTest("verify the job list");
	SoftAssert s=new SoftAssert();
	  ad =new Admin (driver);
	 ad.verifyAminTab();
     ad.verifyTheJob("Pay Grades");
 Thread.sleep(3000);
     ad.verifyTheJob("Job Titles");
     Thread.sleep(3000);
    ad.verifyTheJob("Employment Status");
     
    
   String  Expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/admin/employmentStatus";
   String CurrentUrl=driver.getCurrentUrl();
    
    s.assertEquals(CurrentUrl,  Expectedurl);
    
    s.assertAll();
    
    }
	
	
	
	
	
	
	
}
