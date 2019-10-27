package com.Opps.Collections;

import java.awt.event.ActionEvent;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
//

public class ListExample {


	public static WebDriver driver;

	public static void listWithGeneric() {
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Selenium");
		ls.add("Sam");
		for (String m : ls) {

			System.out.println(m);
		}
	}

	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(url);
	}

	public static void facebookLogin() throws InterruptedException {

		
		
		
		launchBrowser("http://www.fb.com");
		driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		/*
		 * driver.getCurrentUrl(); System.out.println(driver.getTitle());
		 * 
		 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
		 * "saifulislam478@yahoo.in");
		 * driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("lenovo123");
		 * driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		 * 
		 * WebDriver.Options wo=new driver.manage(); WebDriver.Window ww=new
		 * wo.window();
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * Thread.sleep(2000); driver.manage().window().fullscreen();
		 * Thread.sleep(2000); Dimension d = new Dimension(400, 300);
		 * driver.manage().window().setSize(d); Thread.sleep(2000); Point p =new
		 * Point(200,300); driver.manage().window().setPosition(p);
		 */

		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Saiful");
		;
		action.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Saiful");
		;
		
		action.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9739449935");
		;
		action.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password");
		;
		action.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("11");
		action.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("23");
		action.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2001");
		 action.sendKeys(Keys.TAB).perform();
	//	action.sendKeys(Keys.CONTROL).keyDown(Keys.DOWN).build().perform();
		action.sendKeys(Keys.TAB).perform();
		//action.sendKeys(Keys.SPACE).perform();
		driver.findElement(By.xpath("//button[@name='websubmit']"));
		action.sendKeys(Keys.ENTER).perform();
		// ww.maximize();
		
		
		//driver.quit();
	}

	
	
	public static void actionsClassDragAndDrop() throws InterruptedException{
		
		  launchBrowser("https://marcojakob.github.io/dart-dnd/basic/");
		  
		 // driver.switchTo().frame("iframeResult");
		
		  Actions action = new Actions(driver);
		  
		  Thread.sleep(2000);
		  
		  
		 List<WebElement> source = driver.findElements(By.xpath("//div[@class='container']/img[1]"));
		  
		 String xpath="//div[@class='container']/img[--Index--]";
		//  action.contextClick(source).perform();
		  
		 // action.keyDown(Keys.CONTROL).sendKeys(Keys.RIGHT).build().perform();
		  
		  
		  
		  WebElement dest = driver.findElement(By.xpath("//div[@class='trash']"));
		
		  for(int x=1;x<source.size();x++)
		  {
			  String xpath1=xpath.replace("--Index--",String.valueOf(x));
			  System.out.println(xpath1);
			  WebElement source1 = driver.findElement(By.xpath(xpath1));
			  System.out.println(source1);
			  action.dragAndDrop(source1, dest).perform();
		  }
		 
	}
}
