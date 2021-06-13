package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {

	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test", "Google Search testing with String");
        
		
		String projectPath = System.getProperty("user.dir");
		System.out.print("Project path " + projectPath);
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		
		driver.get("http://google.com");
		test1.pass("Navigated to Google.com");
		
		driver.findElement(By.name("q")).sendKeys("Hello Word");
		test1.pass("Entered test in search box");
		Thread.sleep(2000);
				
		driver.findElement(By.name("BtnK")).sendKeys((Keys.RETURN));
		test1.pass("Click Enter");
		
		
		driver.close();
		driver.quit();
		
		// calling flush writes everything to the log file
        extent.flush();
	}

}
