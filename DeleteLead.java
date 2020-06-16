package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
			
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByXPath("//a[text() = 'Find Leads']").click();
		
		driver.findElementByXPath("//span[text()='Email']").click();
		
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("hemamathi96@gmail.com");	
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
	//	driver.findElementByXPath("//a[text()='10719']").click();
		
	//	driver.findElementByLinkText("10712").click();
	
	//	driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
		Thread.sleep(3000); 
			
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		driver.findElementByXPath("//a[text()='Delete']").click();
		
		driver.findElementByXPath("//a[text() = 'Find Leads']").click();	
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("10724");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		
		
		
		
		
		
		
		
		
		
	}
}
