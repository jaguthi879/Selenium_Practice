package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/ubuntu/Downloads/chromedriver");
		
	    WebDriver driver=new ChromeDriver();      
       driver.get("http://demo.guru99.com/test/ajax.html");
       Thread.sleep(2000);
       driver.findElement(By.id("yes")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("buttoncheck")).click();
       Thread.sleep(2000);
       driver.quit();
       

}
}
