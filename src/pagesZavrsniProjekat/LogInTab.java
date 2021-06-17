package pagesZavrsniProjekat;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInTab {
	
	WebDriver driver;
	WebElement logInButton;
	WebElement emailAddressInputField;
	WebElement passwordInputField;
	WebElement signInButton;
	WebElement signOuButtont;
	WebElement textSignOut;
	
	
	public LogInTab(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getlogInButton() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	}
	public WebElement getemailAddressInputField() {
		return driver.findElement(By.id("email"));
	}
	public WebElement getpasswordInputField() {
		return driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
	}
	public WebElement getsignInButton() {
		return driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
	}
	public WebElement getsignOutButton() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	}
	
	
	
	public void logInButtonClick() {
		this.getlogInButton().click();
	}
	public void setEmailAddress(String email) {
		this.getemailAddressInputField().sendKeys(email);
	}
	public void setPassword(String password) {
		this.getpasswordInputField().sendKeys(password);
		//this.getpasswordInputField().sendKeys(Integer.toString(password));
	}
	public void signInButton() {
		this.getsignInButton().click();
	}
	public void signOutButton() {
		this.getsignOutButton().click();
	}

	public void logInFormFilling(String email, String password) {
		this.setEmailAddress(email);
		this.setPassword(password);
		this.logInButtonClick();
	}	
	
	
}




