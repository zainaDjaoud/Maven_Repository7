package simple_code7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uber {
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://uber.com");
		driver.manage().window().maximize();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://uber.com");
		driver1.manage().window().maximize();
		
	
		driver.quit();
		driver1.quit();

	}

}
