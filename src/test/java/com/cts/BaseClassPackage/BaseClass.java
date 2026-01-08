package com.cts.BaseClassPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cts.PageFactory.LoginPage;
;

public class BaseClass {
public static WebDriver driver;
	
	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));

	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static String readProperty(String key) throws IOException {
		File file = new File(
				"C:\\Users\\mrman\\eclipse-workspace\\Nandhini2025\\BDDAutomation\\src\\test\\resources\\Source\\Cheapair.feature");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);

		String value = prop.getProperty(key);
		return value;
	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	// Select dropdown by value attribute
	public static void selectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	// Select dropdown by index
	public static void selectByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public static void overElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void selectTripType(String type) {
		LoginPage lp = new LoginPage();
		lp.drop.click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase(type)) {
				option.click();
				break;
			}
		}
	}

}


