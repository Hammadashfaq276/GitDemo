package Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // Direct iframe page


        
     // Click on the date field to open the calendar
      //  driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
      //  Thread.sleep(2000); // wait for calendar to appear
	   System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
       driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
       System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
       if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
       {
    	   System.out.println("Its enabled");
    	   Assert.assertTrue(true);
       }
       else
       {
    	   Assert.assertTrue(false);
       }
      
	}

}
