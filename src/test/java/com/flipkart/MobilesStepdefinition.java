package com.flipkart;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilesStepdefinition {
	
	@DataProvider(name = "URL")
	public Object[][] getUrl() {
		return new Object[][] {{"https://www.amazon.in/"}};
	}
	
	static WebDriver driver;
	static JavascriptExecutor js;
	static SoftAssert soft;
	
	@BeforeClass(groups = "common")
	public static void applicationLaunch( ) {
		System.setProperty("webdriver.edge.driver", "D:\\Workspace\\Flipkart\\src\\test\\resources\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 js = (JavascriptExecutor)driver;
		 soft = new SoftAssert();
	}
	
	@BeforeMethod(groups = "common")
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod(groups = "common")
	public void afterMethod() {
		System.out.println("After Method");
	}
	
//	Allure Reports
	@Parameters({"parameter1"})
	@Test(priority = -1,groups ="sanity" )
	public void clickOnTodaysDeals(@Optional("Default Value")String variable) {
		WebElement todayDeals = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
		todayDeals.click();
		AssertJUnit.assertEquals("123", "321", "Strings are not equals");
	}
	
	@Test(priority = 2, groups = "smoke")
	public void validateProductWithPercentage() {
		List<WebElement> elements = driver.findElements(By.xpath("//div[@data-csa-c-owner='DealsX']/descendant::span[@class='a-truncate-cut']"));
		List<WebElement> percentage = driver.findElements(By.xpath("//div[@data-csa-c-owner='DealsX']/descendant::span[@class='a-size-mini']"));
		int j = 0;
		for(int i =0; i<elements.size();i++) {
			
			System.out.println("Product Name : "+elements.get(0).getText()+ " Percentage : "+percentage.get(j).getText());
			j = j +2;
		}
//		Actions action = new Actions(driver);
//		action.moveToElement(bottomGrid).build().perform();
//		WebElement apple = driver.findElement(By.xpath("//h2[text()='Apple Smartphones']"));
//		Assert.assertTrue(apple.isDisplayed());
//		action.moveToElement(apple).build().perform();
//		WebElement viewAll = driver.findElement(By.xpath("//h2[text()='Apple Smartphones']/../following-sibling::div/a/span"));
//		action.click(viewAll).build().perform();
	}
	
	@Test(priority = 3)
	public void validateAppleRelatedProducts() {
		
	}
	
	@Test(priority = 4)
	public void select3rdProduct() {
		
	}
	
	@Test(priority = 5)
	public void addProductToCart() {
		
	}
	
	@AfterClass(groups = "common")
	public static void closeBrowser() {
//		driver.quit();
//		soft.assertAll();
	}
	
	@BeforeTest(groups = "common")
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest(groups = "common")
	public void afterTest() {
		System.out.println("After Test");
	}
	
	
	@BeforeSuite(groups = "common")
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite(groups = "common")
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	
	
}
