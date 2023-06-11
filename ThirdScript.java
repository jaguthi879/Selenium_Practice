package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdScript {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
         driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/"); 
		
		Thread.sleep(2000);
		
		String title1 = driver.getTitle();
		
		System.out.println(title1);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();

	}
		

	}


