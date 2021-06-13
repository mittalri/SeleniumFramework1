package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import pages.GoogleSearchPagesObjects;

public class ExtentReportsDemoTestNg {
	private static WebDriver driver=null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent ;
	
	@BeforeSuite
	public void setUp() {
		// start reporters
		htmlReporter = new ExtentHtmlReporter("ExtentTestNG1.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.print("Project path " + projectPath);
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test
	public void Test1() {
		
		GoogleSearchPagesObjects searchPageObj = new GoogleSearchPagesObjects(driver);
		ExtentTest test1 = extent.createTest("Google Search Test", "Google Search testing with String");		
		driver.get("http://google.com");
		test1.log(Status.INFO, "Starting Test Case");
		searchPageObj.setTextInSearchBox("Hello World");
		test1.pass("Entered test in search box");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchPageObj.clickSearchButton();
		test1.pass("Click Enter");
		
	}

	@Test
	public void Test2() {
		
		GoogleSearchPagesObjects searchPageObj = new GoogleSearchPagesObjects(driver);
		ExtentTest test2 = extent.createTest("Google Search Test", "Google Search testing with String");		
		driver.get("http://google.com");
		test2.log(Status.INFO, "Starting Test Case");
		searchPageObj.setTextInSearchBox("Seleinum Test");
		test2.pass("Entered test in search box");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchPageObj.clickSearchButton();
		test2.pass("Click Enter");
		
		
	}
	@Test
	public void Test3() {
		
		GoogleSearchPagesObjects searchPageObj = new GoogleSearchPagesObjects(driver);
		ExtentTest test3 = extent.createTest("Google Search Test", "Google Search testing with String");		
		driver.get("http://google.com");
		test3.log(Status.INFO, "Starting Test Case");
		searchPageObj.setTextInSearchBox("Seleinum Test");
		test3.pass("Entered test in search box");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchPageObj.clickSearchButton();
		test3.pass("Click Enter");
		
		
	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();
	//	driver.close();

	}
}
