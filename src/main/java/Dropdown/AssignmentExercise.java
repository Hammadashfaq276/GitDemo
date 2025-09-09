package Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AssignmentExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("checkBoxOption2")).click();
        String dynamictext = driver.findElement(By.cssSelector("label[for='benz']")).getText();
        System.out.println(dynamictext);
        Select dropdown =new Select(driver.findElement(By.id("dropdown-class-example")));
        dropdown.selectByVisibleText(dynamictext);
        WebElement textdata=driver.findElement(By.id("name"));
        textdata.sendKeys(dynamictext);
        driver.findElement(By.id("alertbtn")).click();
        String text=driver.switchTo().alert().getText();
        if(text.contains(dynamictext))
        {
        	System.out.println("Alert message success");
        }
        else
        {
        	System.out.println("Something went wrong with execution");
        }
	}

}
