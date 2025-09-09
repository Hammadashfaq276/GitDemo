package Dropdown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		// count rows
	   WebElement table = driver.findElement(By.id("product"));
	   List<WebElement> cols=table.findElements(By.tagName("tr"));
	   int colcount = cols.size();
	   
	   List<WebElement> row=cols.get(0).findElements(By.tagName("th"));
	   int rowcount=row.size();
	   System.out.println("Rows=" + rowcount);
	   System.out.println("Columns=" + colcount);
	   
	   List<WebElement> rows = table.findElements(By.tagName("tr"));

	// Second data row is at index 2 (since index 0 = header, index 1 = first data row)
	List<WebElement> secondRowCells = rows.get(2).findElements(By.tagName("td"));

	// Print second column (index 1) of second data row
	System.out.println("Second row, second column: " + secondRowCells.get(0).getText());
	System.out.println("Second row, second column: " + secondRowCells.get(1).getText());
	System.out.println("Second row, second column: " + secondRowCells.get(2).getText());
	}

}
