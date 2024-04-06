package pagepkg;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Jiomart_homepage {
	
	WebDriver driver;
	
	By search=By.xpath("//*[@id=\"autocomplete-0-input\"]");
	By addbutton=By.xpath("/html/body/main/section/div[1]/div/div[2]/div[3]/div/div/ol/li[1]/a/div[2]/div[3]/div/div/button");
	By carticon=By.xpath("/html/body/header/section[1]/div/section[2]/div[2]/div/button");
		public Jiomart_homepage(WebDriver driver)
		{
			this.driver=driver;

}
		
		public void home() throws InterruptedException
		{
			driver.findElement(search).sendKeys("Biscuits",Keys.ENTER);
			
			Thread.sleep(1000);
		}
		
	public void cart() throws InterruptedException 
{
		
		if(driver.findElement(addbutton) != null)
		{
			driver.findElement(addbutton).click();
			System.out.println("Able to click Add button");
		}
		else
		{
			System.out.println("Not able to click Add button");
		}
		
		Thread.sleep(6000);
		
		if(driver.findElement(carticon).isDisplayed())
		{
			System.out.println("Cart icon is displayed");
			WebElement element = driver.findElement(carticon);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		}
		else
		{
			System.out.println("Cart icon is not found");
			
		}
		
		Thread.sleep(6000);
		
}
		
		
		
		
	
}
		
		

			
		
