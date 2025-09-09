package Dropdown;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PracticeDropdownOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.getTitle());
;        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i=1;i<5;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
	}

}
