package locatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/ubuntu/Downloads/chromedriver");
		
	    WebDriver driver=new ChromeDriver();      
       driver.get("http://demo.guru99.com/test/newtours/register.php");
       Thread.sleep(2000);
       Select drpcountry= new Select(driver.findElement(By.name("country")));
       drpcountry.selectByVisibleText("India");
       
       Thread.sleep(2000);
       driver.quit();

}
}
