package com.cts.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public void add() {
		System.out.println("Addition");
	}
	public static void main(String[] args) throws InterruptedException {
		//Test changes
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cheapair.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"fs_originCity_0\"]")).clear();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id=\"fs_originCity_0\"]")).sendKeys("chennai");
//		Thread.sleep(3000);
		driver.close();
	}

}
