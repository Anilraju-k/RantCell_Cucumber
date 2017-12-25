package gmail;


import java.util.concurrent.TimeUnit;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Irctc {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		String userName=RandomStringUtils.randomAlphanumeric(17).toUpperCase();
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Stuff\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf"); 
		
		
		//absolute xpath:html/body/div[4]/div[2]/div/div[2]/input
		//relative xpath:.//*[@id='demon_content']/div[2]/input
		
		driver.findElement(By.xpath(".//*[@id='demon_content']/div[2]/input")).click();
		
		//clicking on signup button -- linktext
		//driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[11]/form/div[1]/div[4]/div/ul/li[2]/a")).click();
		
		// using assertion
		String ref_Header=driver.findElement(By.id("userRegistrationForm:j_idt149_header")).getText();
		Assert.assertEquals("Individual Registration", ref_Header);
		
		driver.findElement(By.name("userRegistrationForm:userName")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:password']")).sendKeys("PassWord123");
		driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("PassWord123");
		
		//dropdown
		Select dropDown=new Select(driver.findElement(By.id("userRegistrationForm:securityQ")));
		dropDown.selectByVisibleText("Who was your Childhood hero?");
		
		driver.findElement(By.xpath("//input[@name='userRegistrationForm:securityAnswer'][@name='userRegistrationForm:securityAnswer']")).sendKeys("Pavan Kalyan");
		
		
		//clicking on radio button
		driver.findElement(By.name("userRegistrationForm:gender")).click();
		
		Thread.sleep(5000);
		
		Actions mouse_hover=new Actions(driver);
		mouse_hover.moveToElement(driver.findElement(By.id("irctc_tourism"))).build().perform();
		mouse_hover.moveToElement(driver.findElement(By.xpath("//*[@id='bluemenu']/ul/li[8]/ul/li[4]/a"))).click().build().perform();
		
		//By.linkText("Tour Packages")
		
		String Parent_Window = driver.getWindowHandle();
		System.out.println(Parent_Window);
		//Switch to new window opened
		for(String Child_Window : driver.getWindowHandles()){
			 System.out.println(Child_Window);
		    driver.switchTo().window(Child_Window);
		     // Performing actions on child window  
		     Thread.sleep(2000);
		     
		     driver.findElement(By.xpath("//*[@id='headerCenNewLook']/div[3]/div[1]/ul/li[1]")).click();  
		     driver.findElement(By.name("userName")).sendKeys("Sirisha");
		     driver.findElement(By.name("password")).sendKeys("Sirisha");
		     Thread.sleep(5000);
		}

		
		driver.close();

		//Switch back to original browser (first window)

		driver.switchTo().window(Parent_Window);
	     
	     driver.findElement(By.name("userRegistrationForm:firstName")).sendKeys("Sirisha");
		
	}

}
