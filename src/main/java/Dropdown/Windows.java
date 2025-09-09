package Dropdown;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String ParentId = it.next();
        String ChildId=it.next();
        driver.switchTo().window(ChildId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        String EmailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(ParentId);
        driver.findElement(By.id("username")).sendKeys(EmailId);
	}

}
