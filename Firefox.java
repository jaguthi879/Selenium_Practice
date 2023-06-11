package firefoxexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/home/ubuntu/Downloads/geckodriver");  
		WebDriver driver=new FirefoxDriver();
		

        driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
	
		driver.navigate().to("https://demo.guru99.com/test/newtours/"); 
		
		String title1 = driver.getTitle();
		
		System.out.println(title1);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.quit();

}
}
