import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkillsAcquisition {

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

				WebDriverWait d = new WebDriverWait(driver, 20);
				d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("skillAquistionTab")));
				driver.findElement(By.id("skillAquistionTab")).click();
				driver.findElement(By.xpath("//a[@class='add']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[@itemType='programCategory']")).sendKeys("Automated");
				driver.findElement(By.id("latestTasks")).click();
				Thread.sleep(4000);				
				
	}

}