package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		Set <String> WindowHandles = driver.getWindowHandles();
		List <String> handles = new ArrayList<String>(WindowHandles);
		driver.switchTo().window(handles.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(handles.get(0));
		driver.quit();
	}

}
