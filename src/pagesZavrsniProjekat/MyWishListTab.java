package pagesZavrsniProjekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishListTab {
	
	WebDriver driver;
	WebElement myWishList;
	WebElement nameInputField;
	WebElement saveButton;
	WebElement deleteButton;

	
	public MyWishListTab (WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getmyWishList() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span"));
	}
	public WebElement getnameInputField() {
		return driver.findElement(By.id("name"));
	}
	public WebElement getsaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"submitWishlist\"]/span"));
	}
	public WebElement getdeleteButton() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_35090\"]/td[6]/a/i"));
	}
	
	public void myWishListClick() {
		this.getmyWishList().click();
	}
	public void firstNameFormFilling(String firstName) {
		this.getnameInputField().sendKeys(firstName);
	}
	public void saveButtonClick() {
		this.getsaveButton().click();
	}
	public void secondNameFormFilling(String secondName) {
		this.getnameInputField().sendKeys(secondName);
	}
	public void deleteProduct() {
		this.getdeleteButton().click();
		driver.switchTo().alert().accept();
		
	}

}
