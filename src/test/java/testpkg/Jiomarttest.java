package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagepkg.Jiomart_homepage;

public class Jiomarttest {
	
	WebDriver driver;
	
	@BeforeTest
	public void urlloading()
	{
		driver=new ChromeDriver();
		driver.get("https://www.jiomart.com/");
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	public void search() throws InterruptedException
	{
		Jiomart_homepage ob = new Jiomart_homepage(driver);
		ob.home();
		//addbutton();
	}
	@Test (priority=2)
	public void addbutton() throws InterruptedException
	{
		Jiomart_homepage ob1 = new Jiomart_homepage(driver);
		ob1.cart();
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
	
	
	
	
	


