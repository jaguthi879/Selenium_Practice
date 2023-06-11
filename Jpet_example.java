package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpet_example {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/ubuntu/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
       driver.get("https://petstore.octoperf.com/");
	
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Enter the Store")).click();
		 Thread.sleep(2000);
         driver.findElement(By.linkText("Sign In")).click();
         Thread.sleep(2000);
         driver.findElement(By.name("username")).sendKeys("jagruthi");
         Thread.sleep(2000);
         driver.findElement(By.name("password")).clear();
         Thread.sleep(2000);
         driver.findElement(By.name("password")).sendKeys("Abc@123");
         Thread.sleep(2000);
         driver.findElement(By.name("signon")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id='QuickLinks']/a[5]/img")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\'Catalog\']/table/tbody/tr[3]/td[1]/a")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("Add to Cart")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\'Cart\']/a")).click();
         Thread.sleep(2000);
         driver.navigate().back();
         Thread.sleep(1000);
         driver.findElement(By.linkText("Sign Out")).click();
         Thread.sleep(2000);
         
         driver.quit();
        
	}
}




