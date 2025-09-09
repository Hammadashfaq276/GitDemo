package Dropdown;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.FluentWait;
public class FluentWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("#start button")).click();
     // Create FluentWait instance
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(30))           // total wait time
            .pollingEvery(Duration.ofSeconds(5))           // polling interval
            .ignoring(NoSuchElementException.class);        // ignore exception

        WebElement element = wait.until(driver1 -> {
            WebElement el = driver1.findElement(By.cssSelector("#finish h4"));
            if (el.isDisplayed()) {
                return el;
            } else {
                return null; // continue waiting
            }
        });

        System.out.println("Element text: " + element.getText());
	}

}
