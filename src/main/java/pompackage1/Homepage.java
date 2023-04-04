package pompackage1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

WebDriver driver;
	

    @FindBy(xpath="//input[@placeholder='Search']")
    private WebElement SearchTab;
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement Admin;
	
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement Pim;
	
	
	
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement Leave;
	
	
	@FindBy(xpath="//span[text()='Time']")
	private WebElement Time;
	
	
	@FindBy(xpath="//span[text()='Recruitment']")
	private WebElement Recruitment;
	
	@FindBy(xpath="//span[text()='My Info']")
	private WebElement MyInfo;
	
	
	@FindBy(xpath="//span[text()='Performance']")
	private WebElement Performance;
	
	
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement Dashboard;
	
	
	@FindBy(xpath="//span[text()='Directory']")
	private WebElement Directory;
	
	
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Maintenance;
	
	

	@FindBy(xpath="//span[text()='Buzz']")
	private WebElement Buzz;
	
	
	public Homepage (WebDriver driver)
	{  this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean checkTheVisiblityOfAdminTab()
	{
		return Admin.isDisplayed();
	}
	

	public boolean checkTheVisiblityOfpimTab()
	{
		return Pim.isDisplayed();
	}
	
	
	public boolean checkTheVisiblityOfleaveTab()
	{
		return Leave.isDisplayed();
	}
	

	public boolean checkTheVisiblityOftimeTab()
	{
		return Time.isDisplayed();
	}
	
	
	
	public boolean checkTheVisiblityOfrecruitmentTab()
	{
		return Recruitment.isDisplayed();
	}
	

	public boolean checkTheVisiblityOfMyInfoTab()
	{
		return MyInfo.isDisplayed();
	}
	
	
	public boolean checkTheVisiblityOfperformanceTab()
	{
		return Performance.isDisplayed();
	}
	

	public boolean checkTheVisiblityOfdashboardTab()
	{
		return Dashboard.isDisplayed();
	}
	
	
	
	public boolean checkTheVisiblityOfdirectoryTab()
	{
		return Directory.isDisplayed();
	}
	
	
	public boolean checkTheVisiblityOfmaintenanceTab()
	{
		return Maintenance.isDisplayed();
	}
	

	public boolean checkTheVisiblityOfbuzzTab()
	{
		return Buzz.isDisplayed();
	}
	
	
	public boolean checkTheVisiblityOfSearchBox()
	{
		return SearchTab.isDisplayed();
	}
	
	
	
	public void verifyTheSearchTab(String tabsname) throws InterruptedException
	{
		SearchTab.sendKeys(tabsname);
		Thread.sleep(1000);
		
		for(int i=1;i<=14; i++)
		{
		SearchTab.sendKeys(Keys.BACK_SPACE);
		}
	
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
