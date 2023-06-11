package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathexample {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/ubuntu/Downloads/chromedriver");
		
	    WebDriver driver=new ChromeDriver();      
       driver.get("https://demo.guru99.com/test/selenium-xpath.html");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\'java_technologies\']/li[4]/a")).click();
       Thread.sleep(2000);
       driver.quit();
}    
}
