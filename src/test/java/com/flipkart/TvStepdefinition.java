package com.flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TvStepdefinition {
	
	static WebDriver driver;
	static JavascriptExecutor js;
	
	@BeforeClass
	public static void method1() {
		System.setProperty("webdriver.edge.driver", "D:\\Workspace\\Flipkart\\src\\test\\resources\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 js = (JavascriptExecutor)driver;
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	
	@Test
	public void method2() {
		WebElement mobiles = driver.findElement(By.xpath("//span[text()='Mobiles & Tablets']"));
		mobiles.click();
	}
	
	@Test
	public void method3() {
		WebElement bottomGrid = driver.findElement(By.xpath("//h2[text()='Mobile Phones- Buy mobile phones online at best prices in India']"));
		Actions action = new Actions(driver);
		action.moveToElement(bottomGrid).build().perform();
		WebElement apple = driver.findElement(By.xpath("//h2[text()='Apple Smartphones']"));
		Assert.assertTrue(apple.isDisplayed());
		action.moveToElement(apple).build().perform();
		WebElement viewAll = driver.findElement(By.xpath("//h2[text()='Apple Smartphones']/../following-sibling::div/a/span"));
		action.click(viewAll).build().perform();
	}
	
//	@Ignore
	@Test
	public void validateAppleRelatedProducts() {
		
	}
	
	@Test
	public void select3rdProduct() {
		
	}
	
	@Test
	public void addProductToCart() {
		
	}
	
	@AfterClass
	public static void closeBrowser() {
//		driver.quit();
	}
}
