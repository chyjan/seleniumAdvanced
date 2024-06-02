package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static WebDriver getDriver(String browser) {
		
	WebDriver driver;
	
	switch (browser.toLowerCase()) {
    case "chrome":
        
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	break;
    	
    case "edge":
    	WebDriverManager.edgedriver().setup();
    	driver = new EdgeDriver();
    	break;
    	
    case "firefox":
    	WebDriverManager.firefoxdriver().setup();
    	driver = new FirefoxDriver();
    	break;
    	
    	default: 
    		throw new IllegalArgumentException("Browser " + browser +  " isn't supported.");
	}
    		
    		return driver;
		
	
	}
	}
