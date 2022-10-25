package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//2.Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//3.Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//4.Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//5.Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
		//6.Click on Merge Contacts using Xpath Locator
		driver.findElement(By.linkText("Merge Contacts")).click();
		Thread.sleep(2000);
		
		//7.Click on Widget of From Contact
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> page = new ArrayList<String>(windowHandles);
		Thread.sleep(2000);
		
		driver.switchTo().window(page.get(1));
		driver.manage().window().maximize();
		
		//8.Click on First Resulting Contact
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(page.get(0));
		Thread.sleep(2000);
		
		//9.Click on Widget of To Contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> page1 = new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(page1.get(1));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//10.Click on Second Resulting Contact
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		driver.switchTo().window(page1.get(0));
		Thread.sleep(2000);
		
		//11.Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		String text = alert.getText();
		System.out.println(text);
		
		//12.Accept the Alert
		alert.accept();
		
		//13.Verify the title of the page
		System.out.println(driver.getTitle());
		driver.close();
	}
}