package pagesZavrsniProjekat;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainNavigation {
	
	WebDriver driver;
	WebElement LogInTab;
	WebElement MyAccountTab;
	WebElement MyPersonalInfoTab;
	WebElement signOut;
	WebElement MyWishListTab;
	WebElement AddingProductsToCartPage;
	
	public MainNavigation(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getLogInTab() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	}
	public void LogInTabClick() {
		this.getLogInTab().click();
	}
	public WebElement getMyAccountTab() {
		return driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]"));
	}
	public void MyAccountTabClick() {
		this.getMyAccountTab().click();
	}
	public WebElement getMyPersonalTab() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span"));
	}
	public void MyPersonalInfoTab() {
		this.getMyPersonalTab().click();
	}
	public WebElement getSignOut() {
		return driver.findElement(By.className("logout"));
	}
	public void SignOut() {
		this.getSignOut().click();
	}
	public WebElement getMyWishListTab() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span"));
	}
	public void MyWishListTabClick() {
		this.getMyWishListTab().click();
	}
	public WebElement getAddingProductsToCartPage() {
		return driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a"));
	}
	public void AddingProductsToCartPageClick() {
		this.getAddingProductsToCartPage().click();
	}
	

}
