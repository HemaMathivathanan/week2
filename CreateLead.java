package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		WebElement eleUsername = driver.findElementById("username");		
		eleUsername.sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementByXPath("//input[@id='createLeadForm_companyName' ]").sendKeys("TestLeaf");
		
		driver.findElementByXPath("//input [@id='createLeadForm_firstName']" ).sendKeys("Hema");
		
		driver.findElementByXPath("//input [@id='createLeadForm_lastName']").sendKeys("Mathivathanan");
		
		WebElement eleDD1 = driver.findElementById("createLeadForm_dataSourceId");
	    Select dd = new Select (eleDD1);
		dd.selectByValue("LEAD_COLDCALL");
	
     	// inspect on the web element box 
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("10000000");
		
		driver.findElementById("createLeadForm_industryEnumId").sendKeys("Computer Software");
		
		WebElement eleOwnership = driver.findElementById("createLeadForm_ownershipEnumId");
	    Select dd1 = new Select(eleOwnership);
	    dd1.selectByVisibleText("S-Corporation");
	    
	    driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("Selenim Automation Tester");
	    
	    WebElement eleDD2 = driver.findElementById("createLeadForm_marketingCampaignId");
	    Select dd2 = new Select(eleDD2);
	    dd2.selectByIndex(6);
	    
	    WebElement eleDD3 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
	    Select dd3 = new Select(eleDD3);
	    dd3.selectByValue("TX");
	 
	    
	    driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("hemamathi96@gmail.com");
	    
	    driver.findElementByXPath("(//input[@name='primaryPhoneNumber'])[4]").sendKeys("8939346669");
	    
	    driver.findElementByXPath("//input[@class='smallSubmit']").click();
	    
	    
	    
	}
	
	
}
