package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
		
		cap.setCapability("cssSelectorsEnabled", true);
		
		WebDriver driver = new ChromeDriver(cap);
		
		driver.get("http://google.com");
		
		
		

	}

}
