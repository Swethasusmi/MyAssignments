package  week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//label[text()='First name:']/following::input[contains(@name,'firstName')][3]")).sendKeys("Swethasusmi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String title=driver.getTitle();
	    System.out.println(title);
	    driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
	    driver.findElement(By.className("inputBox")).clear();
		driver.findElement(By.className("inputBox")).sendKeys("TL");
		driver.findElement(By.name("submitButton")).click();
	   System.out.println("The company name is changed ");
	   driver.close();
	   }
}	