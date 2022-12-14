package twowheelwer;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.findElement(By.id("username")).sendKeys("Democsr");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.partialLinkText("Create")).click() ;   
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("K");
	
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Launch Browser");
	
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Anwesh");
	
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("7/03/2000");
	
	}
	


	
	
	
	
	
	
	
	

	
		// TODO Auto-generated constructor stub
	}

}
