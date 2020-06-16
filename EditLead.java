package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TestLeaf");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		
//		driver.findElementByXPath("//a[text()='10306']").click();
	    driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByXPath("//a[text()='Edit']").click();
		
	                   String attribute = driver.findElementById("updateLeadForm_companyName").getAttribute("Value");
		System.out.println(attribute);
		
	                   driver.findElementById("updateLeadForm_companyName").clear();
		
		driver.findElementById("updateLeadForm_companyName").sendKeys("Atos Syntel");
		
		driver.findElementByClassName("smallSubmit").click();
		
		String text = driver.findElementById("viewLead_companyName_sp").getText();
	                   System.out.println(text);	
	}
}
