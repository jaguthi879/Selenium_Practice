package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_scenario {

	public static void main(String[] args) {
		//set the path 
		System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		//get title
		String title = driver.getTitle();      
		System.out.println("Title of the page is : " + title); 
		//grt title length
		int titleLength = driver.getTitle().length();  
		System.out.println("Length of the title is : "+ titleLength); 
		//get pagesource
		String pageSource = driver.getPageSource();       
		int pageSourceLength = pageSource.length();           
		System.out.println("Total length of the Page Source is : " + pageSourceLength);  
		//get current url
		String actualUrl = driver.getCurrentUrl();  
	       
		if (actualUrl.equals("https://www.selenium.dev/")){  
		System.out.println("The correct Url is opened.");  
		}  
		else{  
		  
		System.out.println("The incorrect Url is opened.");  
		 }  
		
        driver.quit();
		
		
	}
}
