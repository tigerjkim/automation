import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;


public class Kiwi {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "//Users//jkim//Documents//WebDrivers//chromedriver");
				WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("https://kiwidisk.com");
				WebDriverWait d = new WebDriverWait(driver, 20);
				d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[1]//a[1]//span[1]")));
				driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();
				d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("userid")));
				driver.findElement(By.name("userid")).sendKeys("jkmgmiami1");
				driver.findElement(By.name("userpw")).sendKeys("cf4de3");
				driver.findElement(By.name("userpw")).sendKeys(Keys.RETURN);		
				Thread.sleep(4000);
				
				//Instantiate Action Class        
		        Actions actions = new Actions(driver);
		        //Retrieve WebElement drop down menu to perform mouse hover 
		        WebElement menuOption = driver.findElement(By.xpath("//div[@class='my_club select-box']//h1"));
		        //Mouse hover menu
		        actions.moveToElement(menuOption).perform();
		        //Select item from menu drop down
		        WebElement subMenuOption = driver.findElement(By.linkText("대표클럽아미고★─＊"));
		        //Mouse hover menuOption and select
		        actions.moveToElement(subMenuOption).perform();
		        driver.findElement(By.linkText("대표클럽아미고★─＊")).click();
		        
		        
			}

}
