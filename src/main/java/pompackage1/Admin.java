package pompackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomUtility.ElementWait;

public class Admin 
{WebDriver driver;
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy(xpath="//span[text()='Job ']")
	private WebElement job;
	
	
	
	public Admin (WebDriver driver)
	{ 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyAminTab()
	{
		ElementWait.waitForElement("//span[text()='Admin']", 15, driver);
		admin.click();
		
	}
	
	
	public void verifyTheJob(String text)
	{
		job.click();
		driver.findElement(By.xpath("//a[text()='"+text+"']")).click();
	            
	            
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
