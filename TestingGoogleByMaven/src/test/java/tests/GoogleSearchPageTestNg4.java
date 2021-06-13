package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GoogleSearchPagesObjects;


public class GoogleSearchPageTestNg4 {
	private static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.print("Project path " + projectPath);
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public static void googleSearchTest() throws InterruptedException {
			
		GoogleSearchPagesObjects searchPageObj = new GoogleSearchPagesObjects(driver);
		
		driver.get("http://google.com");
		
		searchPageObj.setTextInSearchBox("Hello World");
		Thread.sleep(2000);
		searchPageObj.clickSearchButton();
		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		
	}
	
}
	

