package testsZavrsniProjekat;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pagesZavrsniProjekat.MainNavigation;
import pagesZavrsniProjekat.AddingProductsToCartPage;
import pagesZavrsniProjekat.LogInTab;
import pagesZavrsniProjekat.MyAccountTab;
import pagesZavrsniProjekat.MyPersonalInfoTab;
import pagesZavrsniProjekat.MyWishListTab;

	public class BaseTest {
	
		WebDriver driver;
		MainNavigation mainNavigation;
		LogInTab logInTab;
		ExcelReader citacIzExcela;
		String homerUrl;
		MyAccountTab myAccountTab;
		MyPersonalInfoTab myPersonalInfoTab;
		MyWishListTab myWishListTab;
		AddingProductsToCartPage addingProductsToCartPage;
		
	
	@BeforeClass
		public void preSvihTestova() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mainNavigation = new MainNavigation(driver);
		logInTab = new LogInTab(driver);
		citacIzExcela = new ExcelReader("data/Zavrsni Projekat1.xlsx");
		homerUrl = "http://automationpractice.com";
		myAccountTab = new MyAccountTab(driver);
		myPersonalInfoTab = new MyPersonalInfoTab(driver);
		myWishListTab = new MyWishListTab(driver);
		addingProductsToCartPage = new AddingProductsToCartPage(driver);
	}
	
	@AfterClass
		public void posleSvihTestova() {
			driver.close();
	}
}
