package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPagesObjects {
	
	WebDriver driver = null;

	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
	
	public GoogleSearchPagesObjects(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	//function to enter string in text box
	public void setTextInSearchBox(String text) {
		
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	//function to click search button
	public void clickSearchButton() {
		
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}


}
