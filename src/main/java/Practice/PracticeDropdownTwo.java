package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PracticeDropdownTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        
     // ✅ Get selected value from origin (parent dropdown)
        WebElement origin = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        System.out.println("Selected Origin: " + origin.getAttribute("value"));

        // ✅ Get selected value from destination (child dropdown)
        WebElement destination = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
        System.out.println("Selected Destination: " + destination.getAttribute("value"));
        
        
	}

}
