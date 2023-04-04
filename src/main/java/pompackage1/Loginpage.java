package pompackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomUtility.ElementWait;

public class Loginpage
{

	WebDriver driver;
    
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//div[@class='orangehrm-login-slot']//button")
	private WebElement loginbutton;
	
	@FindBy(xpath="//div[@id='app']//h5")
	private WebElement logintext;
	
	@FindBy(xpath="//img[@alt='company-branding']")
	private WebElement image;
	
	public Loginpage (WebDriver driver)
	{
		this.driver=driver; //this. driver represent globally
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean verifytheTitleOfLogin(String text)
	{
		String Title=logintext.getText();
		//String expectedtext="LOGIN";
		boolean result=text.equals(Title);
		   return result;
	}
	
	
	public void sendusername(String uName)
	{
		
		ElementWait.waitForElement("//input[@name='username']", 10, driver);
		username.sendKeys(uName);
	}
	
	public void sendpassword(String pwd)
	{
		
	ElementWait.waitForElement("//input[@placeholder='Password']", 10, driver);
	
	password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		loginbutton.click();
		
	}
	
	
	public String fetchCurrentUrl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	
	
	public boolean compareCurrentUrl()
	{String  expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String Currenturl=driver.getCurrentUrl();
		boolean result=expectedurl.equals(Currenturl);
		return result;
	}
	
	public boolean  checkVisiblityOfLoginButton()
	{
		return loginbutton.isDisplayed();
		
	}
	
	public void clearThedata()
	{
		username.clear();
		password.clear();
	}
	
	
	public void Clearbox()
	{for(int i=0; i<=10;i++)
	{
		username.sendKeys(Keys.BACK_SPACE);
		password.sendKeys(Keys.BACK_SPACE);
	}
	}
	
	
	public boolean checkTheVisiblityOfLogo() 
	{
	 return 	image.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
