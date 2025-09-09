package Dropdown;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentWindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("a[href='/windows']")).click();
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
      Set<String> windows =  driver.getWindowHandles();
      Iterator<String> it = windows.iterator();
      String ParentId = it.next();
      String ChildId = it.next();
      driver.switchTo().window(ChildId);
      System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
      driver.switchTo().window(ParentId);
      System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	}

}
