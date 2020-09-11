import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//jkim//Documents//WebDrivers//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		// hit google.com 
		driver.get("https://google.com");
		
		// validate if your page title is correct
		System.out.println(driver.getTitle());
		
		// validate you are landed on correct url
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://yahoo.com");
		
		// navigate back to google
		driver.navigate().back();
		
		// navigate forward to yahoo
		driver.navigate().forward();
		
		
		driver.quit();
		
		
		
		
		
		
	}

}
