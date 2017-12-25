






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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Gmaail {
public static void main(String[] args) throws InterruptedException {
		
		//WebDriver web=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Stuff\\Drivers\\chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
		
		
		//web.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
	   WebElement emailid = driver.findElement(By.xpath("//input[@type='email']"));
	   emailid.sendKeys("anilraju.kk");
	   WebElement next = driver.findElement(By.id("identifierNext"));
	   next.click();  
	   Thread.sleep(5000);
	   WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	   password.sendKeys("AnilWow143");
	   
		WebElement submit = driver.findElement(By.id("passwordNext"));
		submit.click();
		
		Thread.sleep(10000);
		Actions actions = new Actions(driver);
		for(int i=0;i<50;i++){
			
		WebElement menu=driver.findElement(By.cssSelector(".J-J5-Ji.J-JN-M-I-JG"));
	
		actions.moveToElement(menu).click().build().perform();
		
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=':ym']/div"));
		//WebElement subMenu = driver.findElement(By.id(":z9"));
		actions.moveToElement(subMenu).click().build().perform();
					
		
		Thread.sleep(3000);
	    WebElement delete = driver.findElement(By.cssSelector(".T-I.J-J5-Ji.nX.T-I-ax7.T-I-Js-Gs.ar7"));
	    delete.click();
	    Thread.sleep(5000);
	    /*if(i==3||i==10||i==20||i==30||i==40){
	    	
	    	WebElement menu1=driver.findElement(By.cssSelector(".J-J5-Ji.J-JN-M-I-JG"));
	    	
			actions.moveToElement(menu1).click().build().perform();
			
			WebElement subMenu1 = driver.findElement(By.xpath("//*[@id=':z9']/div"));
			//WebElement subMenu = driver.findElement(By.id(":z9"));
			actions.moveToElement(subMenu1).click().build().perform();
	    	
			driver.findElement(By.xpath("//*[@id=':2m']/div[1]/div")).click();
			driver.findElement(By.xpath("//input[@maxlength='225'][@type='text']")).sendKeys("inoxx");
			
			driver.findElement(By.xpath("//input[@maxlength='225'][@type='text']")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
	    }*/
	    if(i==10){
	    	System.out.println("Waiting for move");
	    	Thread.sleep(10000);
	    }
	    
	    i=i++;
		}
	}

	
	
	}
