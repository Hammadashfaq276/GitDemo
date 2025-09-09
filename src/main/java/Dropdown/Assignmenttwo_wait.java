package Dropdown;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Assignmenttwo_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ChromeOptions options = new ChromeOptions();

        // Disable password manager
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        // Optional: start in incognito mode
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));
        Select select =new Select(dropdown);
        select.selectByValue("consult");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
        List<WebElement> products=driver.findElements(By.cssSelector("card-footer btn-info"));
        for(int i=0;i<products.size();i++)
        {
        	products.get(i).click();
        }
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='nav-link btn btn-primary']")));
        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-success")));
        driver.findElement(By.cssSelector("button.btn.btn-success")).click();
	}

}
