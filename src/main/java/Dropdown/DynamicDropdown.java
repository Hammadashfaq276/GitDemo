package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver =new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       System.out.println(driver.getTitle());
       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       driver.findElement(By.xpath("//a[@value='BLR']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
       
      
    //   a.ui-state-default.ui-state-highlight
       driver.findElement(By.cssSelector("a.ui-state-default.ui-state-active")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
        	System.out.println("Its enabled");
        	Assert.assertTrue(false);
        }
        else
        {
        	Assert.assertTrue(true);
        }
      
	}

}
