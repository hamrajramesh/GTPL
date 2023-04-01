package guru99Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99ApplicationTest {
	
public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser(){
		
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/html/Managerhomepage.php");
	}
	
	@Test
	public void verifyTitle() {
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String actualTitle=driver.getTitle();
        String expectedTitle= "GTPL Bank Manager HomePage";
        
        Assert.assertEquals(actualTitle, expectedTitle);
     }
	
	@AfterMethod
	public void closeBrowser() {
		
		
		driver.close();
		
		
	}
        
 }


