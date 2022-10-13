package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");//using attribute based
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");//using attribute based
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();//partial attribute
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click(); //partial text
		driver.findElement(By.xpath("//a[text()='Leads']")).click();//Text based
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();//Text based
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9962801612");//attribute based
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();//text based
		driver.findElement(By.xpath("//a[text()='11925']")).click();//text based
		driver.findElement(By.xpath("//a[text()='Delete']")).click();//text based
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("11925");//attribute based
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[text()='No records to display']"));
		driver.close();
		}
}