package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript {
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver","/home/ubuntu/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.in/");
	   Thread.sleep(2000);
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']")).click();
	   Thread.sleep(2000);
}
}
