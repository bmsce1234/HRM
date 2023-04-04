package testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompackage1.Homepage;

public class HomepageTestclass extends Baseclass {
	Homepage home;
	

	@BeforeClass
	public void beforeclass()
	{
		home=new Homepage(driver);
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{  
	
	}
	
	
	
	@Test(priority=1)
	public void verifyTabPresentOnHomepage()
	{
		logger=report.createTest("verify the tab present on home page");
		
		SoftAssert s=new SoftAssert();
		

		boolean result1=home.checkTheVisiblityOfAdminTab();
		s.assertTrue(result1);
		
		
		boolean result2=home.checkTheVisiblityOfpimTab();
		s.assertTrue(result2);
		

		boolean result3=home.checkTheVisiblityOfleaveTab();
		s.assertTrue(result3);
		
		
		
		boolean result4=home.checkTheVisiblityOftimeTab();
		s.assertTrue(result4);
		
		
		

		boolean result5=home.checkTheVisiblityOfMyInfoTab();
		s.assertTrue(result5);
		
		
		

		boolean result6=home.checkTheVisiblityOfperformanceTab();
		s.assertTrue(result6);
		
		

		boolean result7=home.checkTheVisiblityOfdashboardTab();
		s.assertTrue(result7);
		
		

		boolean result8=home.checkTheVisiblityOfdirectoryTab();
		s.assertTrue(result8);
		
		
		boolean result9=home.checkTheVisiblityOfdirectoryTab();
		s.assertTrue(result9);
		
		
		boolean result10=home.checkTheVisiblityOfdirectoryTab();
		s.assertTrue(result10);
		
		boolean result11=home.checkTheVisiblityOfSearchBox();
		s.assertTrue(result11);
		
		s.assertAll();
		
		
	}
	
	
	
	@Test(priority=2)
	public void validateTheSearchTab() throws InterruptedException 
	{
		logger=report.createTest("validate the search tab");
		home.verifyTheSearchTab("Admin");
		
		home.verifyTheSearchTab("Pim");
		
		home.verifyTheSearchTab("Leave");
	
		home.verifyTheSearchTab("Time");
		
		home.verifyTheSearchTab("Recruitment");
		
		home.verifyTheSearchTab("My Info");
		
		home.verifyTheSearchTab("Performance");
		
		home.verifyTheSearchTab("Dashboard");
		
		home.verifyTheSearchTab("Directory");
		
		home.verifyTheSearchTab("Maintenance");
		
	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

