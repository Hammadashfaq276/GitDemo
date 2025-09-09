package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Complete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       System.out.println(driver.getTitle());
       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       driver.findElement(By.xpath("//a[@value='MAA']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
       driver.findElement(By.cssSelector("a.ui-state-default.ui-state-active")).click();
       driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
       if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
       {
    	   System.out.println("Its enabled");
    	   Assert.assertTrue(true);
       }
       else
       {
    	   Assert.assertTrue(false);
       }
       
       driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(2000);
       for(int i=1;i<5;i++)
       {
    	   driver.findElement(By.id("hrefIncAdt")).click();
       }
       driver.findElement(By.id("btnclosepaxoption")).click();
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
      WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
      Select select =new Select(dropdown);
      select.selectByIndex(3);
      System.out.println(select.getFirstSelectedOption().getText());
      select.selectByVisibleText("AED");
      driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
       
	}

}
