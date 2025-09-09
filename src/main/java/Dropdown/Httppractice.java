package Dropdown;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
public class Httppractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source=screenshot.getScreenshotAs(OutputType.FILE);
        File destfile =new File("D:\\Web Automation Selenium with java - Rahul Shetty udemy paid course\\screenshot.png");
        FileUtils.copyFile(source, destfile);
        System.out.println("Screenshot saved Successfully");
        
	}

}
