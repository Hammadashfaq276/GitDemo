package Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Relativelocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
	    System.out.println(driver.getTitle());
	    WebElement Editbox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(Editbox)).getText());
		WebElement dateofBirth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
		WebElement creamlabels=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(creamlabels)).click();
		WebElement rdb=driver.findElement(By.id("inlineRadio1"));
		driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText();
		
		
	}

}
