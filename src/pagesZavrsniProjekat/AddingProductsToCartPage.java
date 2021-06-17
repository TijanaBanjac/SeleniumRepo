package pagesZavrsniProjekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddingProductsToCartPage {
	
	WebDriver driver;
	WebElement product;
	WebElement firstProduct;
	WebElement secondProduct;
	WebElement thirdProduct;
	WebElement addToCart;
	WebElement proceedToCheckout;
	WebElement proceedToCheckoutSummary;
	WebElement proceedToCheckoutAddress;
	WebElement proceedToCheckoutShipping;
	WebElement termsOfServiceCheck;
	WebElement numberInputFieldQuantity;
	WebElement dressesButton;
	WebElement continueShoppingButton;
	WebElement cartButton;
	WebElement binButton;
	
	public AddingProductsToCartPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getproduct() {
		return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));
	}
	public WebElement getfirstProduct() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img"));
	}
	public WebElement getsecondProduct() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
	}
	public WebElement getthirdProduct() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div/div[1]/div/a[1]/img"));
	}
	public WebElement getaddToCart() {
		return driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
	}
	public WebElement getproceedToCheckout() {
		return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	}
	public WebElement getproceedToCheckoutSummary() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
	}
	public WebElement getproceedToCheckoutAddress() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	}
	public WebElement getproceedToCheckoutShipping() {
		return driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
	}
	public WebElement gettermsOfServiceCheck() {
		return driver.findElement(By.id("cgv"));
	}
	public WebElement getnumberInputFieldQuantity() {
		return driver.findElement(By.id("quantity_wanted"));
	}
	public WebElement getdressesButton() {
		return driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/a[3]"));
	}
	public WebElement getcontinueShoppingButton() {
		return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span"));
	}
	public WebElement getcartButton() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[3]"));
	}
	public WebElement getbinButton() {
		return driver.findElement(By.xpath("Blouse"));
	}
	
	
	
	public void productClick() {
		this.getproduct().click();
	}
	public void firstProductClick() {
		this.getfirstProduct().click();
	}
	public void secondProductClick() {
		this.getsecondProduct().click();
	}
	public void thirdProductClick() {
		this.getthirdProduct().click();
	}
	public void addToCart() {
		this.getaddToCart().click();
	}
	public void proceedToCheckoutClick() {
		this.getproceedToCheckout().click();
	}
	public void proceedToCheckoutSummaryClick() {
		this.getproceedToCheckout().click();
	}
	public void proceedToCheckoutAddressClick() {
		this.getproceedToCheckoutAddress().click();
	}
	public void proceedToCheckoutShippingClick() {
		this.getproceedToCheckoutShipping().click();
	}
	public void termsOfServiceCheckClick() {
		this.gettermsOfServiceCheck().click();
	}
	public void addNumberToFieldQuantity(String number) {
		this.getnumberInputFieldQuantity().sendKeys(number);
	}
	public void dressesButtonClick() {
		this.getdressesButton().click();
	}
	public void continueShoppingButtonClick() {
		this.getcontinueShoppingButton().click();
	}
	public void cartButtonClick() {
		this.getcartButton().click();
	}
	public void binButtonClick() {
		this.getbinButton().click();
	}
}
