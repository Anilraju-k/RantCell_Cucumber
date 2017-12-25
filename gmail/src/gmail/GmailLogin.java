package gmail;
/*package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteMail {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver web=new FirefoxDriver();
		//web.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Stuff\\chromedriver.exe");
		// Initialize browser.
		WebDriver web=new ChromeDriver();
		
		web.get("https://www.gmail.com");
		//web.manage().window().maximize();
		Thread.sleep(10000);
		WebElement username = web.findElement(By.xpath("//*[@id='Email']"));
		
		              username.clear();
		
		              username.sendKeys("anilraju93");
		              web.findElement(By.xpath("//*[@id='next']")).click();
		
		              
		

			              WebElement password = web.findElement(By.id("//*[@id='Passwd']"));
			              password.clear();
			              password.sendKeys("AnilWow143");
			              
			              web.findElement(By.id("//*[@id='signIn']]")).click();
			              System.out.println("Gmail Logged in successfully.");
			              web.findElement(By.xpath("//*[@id=':2b']/div[1]/div")).click();
			              web.findElement(By.xpath("//*[@id=':yx']/div")).click();
			              web.findElement(By.xpath("//*[@id=':5']/div/div[1]/div[1]/div/div/div[2]/div[3]/div/div")).click();
			              
			              
		
		
	
		              System.out.println("Deleted successfully.");
		

		
		
	}

}*/



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class GmailLogin {
public static void main(String[] args) throws InterruptedException {
		
		//WebDriver web=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Stuff\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		
		
		//web.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		
	   WebElement emailid = driver.findElement(By.id("Email"));
	   emailid.sendKeys("anilraju93");
	   WebElement next = driver.findElement(By.id("next"));
	   next.click();
	   WebElement password = driver.findElement(By.id("Passwd"));
	   password.sendKeys("AnilWow143");
	   
		WebElement submit = driver.findElement(By.id("signIn"));
		submit.click();
		
		//Thread.sleep(10000);
		Actions actions = new Actions(driver);
		WebElement menu=driver.findElement(By.cssSelector(".J-J5-Ji.J-JN-M-I-JG"));
		actions.moveToElement(menu).click().build().perform();
		
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=':z9']/div"));
		actions.moveToElement(subMenu).click().build().perform();
			

	    WebElement delete = driver.findElement(By.cssSelector(".T-I.J-J5-Ji.nX.T-I-ax7.T-I-Js-Gs.ar7"));
	    delete.click();
	}

	
	
	}





