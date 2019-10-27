import org.openqa.selenium.By;
//import com.Opps.Collections.*;
import com.Opps.Collections.ListExample;

public class Automation_AciTime extends ListExample
{
	public static void Login()
	{
		launchBrowser("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		
	}

}
