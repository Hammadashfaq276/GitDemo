package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Checkbox_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver =new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      System.out.println(driver.getTitle());
     WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
     checkbox.click();
      Assert.assertTrue( checkbox.isSelected(),"Check should be checked");
      Thread.sleep(1000);
      checkbox.click();
      Assert.assertFalse(checkbox.isSelected(),"Check box should be unchecked");
      
      List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
      int count=checkboxes.size();
      System.out.println("No of checkboxes " + count);
      
      
   //   Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
   //   System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
  //    driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
   //   System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
  //    Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
  //    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
  //    Assert.assertEquals(1, 1);
      
      
      
	}

}
