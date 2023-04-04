package testPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompackage1.Loginpage;
import testUtility.ReadFileData;



public class LoginTestClass   extends Baseclass
{
	
	Loginpage login;
	ReadFileData r;
	@BeforeClass
	public void beforeclass()
	{
      login =new Loginpage(driver);//before class is used for handling alert & create object
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
	
	}
	
	@Test(priority=0)
	public void verifyTheLogo()
	{    logger=report.createTest("verify the logo");
    boolean result= login.checkVisiblityOfLoginButton();
     Assert.assertTrue(result);
    
    }
	
	@Test(priority=1)
	public void verifyTitleOfLOginpage() 
	{
		logger=report.createTest("verify Title Of LOginpage");
        boolean result= login.verifytheTitleOfLogin("Login");
         Assert.assertTrue(result);
       
	}
	
	
	
	
	
	@Test(priority=2)
	public void verifyLoginFunctionalitywithoutcorrectdata() throws EncryptedDocumentException, IOException 
	{
	logger=report.createTest("verify Login Functionality without correctdata");
        
        login.sendusername(r.fetchDataFromExcelSheet(1, 0));
        login.sendpassword(r.fetchDataFromExcelSheet(1, 1));
        login.clickOnLoginButton();
        
    boolean result= login.checkVisiblityOfLoginButton();
     Assert.assertTrue(result);
     
    
	}
	
	@Test(priority=3)
	
	public void verifyLoginFunctionalitywithEmptyPassword() throws EncryptedDocumentException, IOException
	{
		logger=report.createTest("verify Login Functionality with invalid data");
		
		SoftAssert s=new SoftAssert();
	login.Clearbox();
	    login.sendusername(r.fetchDataFromExcelSheet(2, 0));
		try 
		{
			login.sendpassword(r.fetchDataFromExcelSheet(2, 1));
		}
	    catch(NullPointerException e)
		{
	    	System.out.println("you are trying to fetch null value");
		}
	    
		login.clickOnLoginButton();
		
	String	Expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String CurrentUrl=driver.getCurrentUrl();
	s.assertEquals(CurrentUrl, Expectedurl);
	
	s.assertAll();
	
	}
	

	@Test(priority=4)
	
	public void verifyLoginFunctionalitywithwrongPassworddata() throws EncryptedDocumentException, IOException 
	{
	logger=report.createTest("verify Login Functionality  with wrong password  data");
		
		SoftAssert s=new SoftAssert();
	    login.Clearbox();
	    login.sendusername(r.fetchDataFromExcelSheet(3, 0));
		login.sendpassword(r.fetchDataFromExcelSheet(3, 1));
		login.clickOnLoginButton();
		
	String	Expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String CurrentUrl=driver.getCurrentUrl();
//	s.assertEquals(CurrentUrl, Expectedurl);
	Assert.fail();
	s.assertAll();
	
	
	}
	@Test(priority=5)
	public void verifyLoginFunctionalitywithcorrectdata() throws EncryptedDocumentException, IOException 
	{
		logger=report.createTest("verify Login Functionality with correctdata");
		
		login.Clearbox();
        
        login.sendusername(r.fetchDataFromExcelSheet(4, 0));
        login.sendpassword(r.fetchDataFromExcelSheet(4, 1));
        login.clickOnLoginButton();
        
   boolean results= login.compareCurrentUrl();
   Assert.assertTrue(results);
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
