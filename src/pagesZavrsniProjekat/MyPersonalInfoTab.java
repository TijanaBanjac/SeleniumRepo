package pagesZavrsniProjekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyPersonalInfoTab {
	
	WebDriver driver;
	WebElement MyAccountTab;
	WebElement MyPersonalInformationButton;
	WebElement CurrentPasswordInputField;
	WebElement NewPasswordInputField;
	WebElement ConfirmationInputField;
	WebElement CheckBoxSignUp;
	WebElement SaveButton;
	
	public MyPersonalInfoTab(WebDriver driver) {
		super();
		this.driver = driver;
	}
	private WebElement MyAccountTab() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
	}
	private WebElement MyPersonalInformationButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span"));
	}
	private WebElement CurrentPasswordInputField() {
		return driver.findElement(By.id("old_password"));
	}
	private WebElement NewPasswordInputField() {
		return driver.findElement(By.id("passwd"));
	}
	private WebElement ConfirmationInputField() {
		return driver.findElement(By.id("confirmation"));
	}
	private WebElement CheckBoxSignUp() {
		return driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
	}
	private WebElement SaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button/span"));
	}
	
	
	public void myAccountTabClick() {
		this.MyAccountTab().click();
	}
	public void myPersonalInformationButtonClick() {
		this.MyPersonalInformationButton().click();
	}
	public void addCurrentPassword(String password) {
		this.CurrentPasswordInputField().sendKeys(password);
	}
	public void addNewPassword(String password) {
		this.NewPasswordInputField().sendKeys(password);
	}
	public void addConfirmation(String password) {
		this.ConfirmationInputField().sendKeys(password);
	}
	public void checkBoxSignUpClick() {
		this.CheckBoxSignUp().click();
	}
	public void saveButtonClick() {
		this.SaveButton().click();
	}
}
