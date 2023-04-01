package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginPage {
	
	

	public static void main(String[]args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/index.php");
		WebElement userid=driver.findElement(By.name("uid"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement loginbtn=driver.findElement(By.name("btnLogin"));
		
		userid.sendKeys("mngr482952");
		password.sendKeys("EpAdabY");
	    loginbtn.click();
	    
	    driver.getTitle();
	    
	    
	    
	    driver.close();
	    
		
		
		
		
	}

}
