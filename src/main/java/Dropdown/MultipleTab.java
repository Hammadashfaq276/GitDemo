package Dropdown;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
public class MultipleTab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        System.out.println(driver.getTitle());
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> it=handles.iterator();
        String Parentwindow=it.next();
        String Childwindow=it.next();
        driver.switchTo().window(Childwindow);
        driver.get("https://rahulshettyacademy.com/");
        String CourseName=driver.findElement(By.xpath("//a[contains(text(),'Core java for Automation Testers + Interview Progr')]")).getText();
        driver.switchTo().window(Parentwindow);
        WebElement name=driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(CourseName);
        File screenshot=name.getScreenshotAs(OutputType.FILE);
        File destination =new File("D:\\Web Automation Selenium with java - Rahul Shetty udemy paid course\\element-screenshot.png");
        FileHandler.copy(screenshot, destination);
        System.out.println("Screenshot saved successfully");
        
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());
	}

}
