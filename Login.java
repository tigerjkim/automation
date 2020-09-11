import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "//Users//jkim//Documents//WebDrivers//chromedriver");
				WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("https://staging.datafinch.com");
				driver.findElement(By.id("Username")).clear();
				driver.findElement(By.id("Username")).sendKeys("st6.kim");
				driver.findElement(By.id("Password")).clear();
				driver.findElement(By.id("Password")).sendKeys("Temp123!");
				driver.findElement(By.id("Password")).sendKeys(Keys.RETURN);
				Thread.sleep(5000);
//				driver.navigate().back();
				driver.close();
		
	}

}
