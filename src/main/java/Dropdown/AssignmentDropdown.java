package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AssignmentDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("name")).sendKeys("Hammad Ashfaq");
        driver.findElement(By.name("email")).sendKeys("Hammadashfaq341@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Hammad100");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select select =new Select(dropdown);
        select.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.name("bday")).sendKeys("03/09/1995");
        driver.findElement(By.cssSelector("input[type='submit'][value='Submit']")).click();
     // Locate the success message div
        WebElement successMessage = driver.findElement(By.cssSelector(".alert-success"));

        // Get the text content
        String messageText = successMessage.getText();

        // Print the message
        System.out.println("Success Message: " + messageText);
        
	}

}
