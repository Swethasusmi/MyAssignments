package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][1]")).sendKeys("Swetha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thiyag");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("8502654249");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Welcome@123");
		
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select opt=new Select(date);
		opt.selectByVisibleText("30");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select opt1=new Select(month);
		opt1.selectByIndex(11);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select opt2=new Select(year);
		opt2.selectByValue("1992");
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();

		}
}