package newCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateNewCustomerTest {
	
	@Test
	public void newCustomerCreation()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/html/Managerhomepage.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("HamrajNikum");
		driver.findElement(By.xpath("//input[@value='1'][1]")).click();
		driver.findElement(By.name("dob")).sendKeys("01-03-1996");
		driver.findElement(By.name("addr")).sendKeys("dhule");
		driver.findElement(By.name("city")).sendKeys("dhule");
		driver.findElement(By.name("state")).sendKeys("maharashtra");
		driver.findElement(By.name("pinno")).sendKeys("424005");
		driver.findElement(By.name("emailid")).sendKeys("hamrajnikum1239@gmail.com");
		driver.findElement(By.name("telephoneno")).sendKeys("7756042140");
		driver.findElement(By.name("sub")).click();
		
		
		
	}

}
