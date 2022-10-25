package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		List<String> window1 = new ArrayList<String>(windowHandles); 
		driver.switchTo().window(window1.get(2));
		driver.manage().window().maximize(); 
		System.out.println(driver.getTitle());
		  
		driver.switchTo().window(window1.get(0)); driver.close();
		driver.switchTo().window(window1.get(1));
		driver.manage().window().maximize(); driver.close();
		driver.switchTo().window(window1.get(2));
		   }
}