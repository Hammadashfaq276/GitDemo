package Dropdown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentFourAuto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("autocomplete")).sendKeys("Uni");
        Thread.sleep(3000);
        List<WebElement> suggestions=driver.findElements(By.className("ui-menu-item"));
        for(WebElement suggest : suggestions)
        {
        	String text = suggest.getText();
        	if(text.equalsIgnoreCase("United Kingdom (UK)"))
        	{
        		suggest.click();
        		break;
        	}
        }
        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
