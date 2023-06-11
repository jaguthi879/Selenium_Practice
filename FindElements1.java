package locatorsPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/ubuntu/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();      
       driver.get("http://omayo.blogspot.com/");
         List<WebElement> elements = driver.findElements(By.name("samename"));  
         for(WebElement element:elements) {
        	 System.out.println(element.getText());
         }
       System.out.println("Number of elements:" +elements.size()); 
       driver.quit();

}
}
