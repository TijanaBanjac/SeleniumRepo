package pagesZavrsniProjekat;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
	
	public class MyAccountTab {
		
		WebDriver driver;
		WebElement MyAccountTab;
		WebElement MyAddressButton;
		WebElement UpdateButton;
		WebElement AddressInputField;
		WebElement SaveButton;		
		WebElement AddAddress;
		WebElement CityInputField;
		WebElement StateDropDownMenu;
		WebElement ZipPostalCodeInputField;
		WebElement HomePhoneInputField;
		WebElement MyAccountPageTitle;
		WebElement AddNewAddressButton;
		WebElement MobilePhoneInputField;
		WebElement DeleteButton;
		
		
		
		public MyAccountTab(WebDriver driver) {
			super();
			this.driver = driver;
		}
		private WebElement MyAccountTab() {
			return driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]"));
		}
		private WebElement MyAddressButton() {
			return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span"));
		}
		private WebElement UpdateButton() {
			return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[1]/ul/li[9]/a[1]/span"));
		}
		private WebElement AddressInputField() {
			return driver.findElement(By.id("address1"));	
		}
		private WebElement SaveButton() {
			return driver.findElement(By.xpath("//*[@id=\"submitAddress\"]/span"));
		}
		private WebElement newAddressInputField() {
			return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a/span"));
		}
		private WebElement CityInputField() {
			return driver.findElement(By.id("city"));
		}
		private WebElement StateDropDownMenu() {
			return driver.findElement(By.id("id_state"));
		}
		private WebElement ZipPostalCodeInputField() {
			return driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
		}
		private WebElement HomePhoneInputField() {
			return driver.findElement(By.id("phone"));
		}
		private WebElement MyAccountPageTitle() {
			return driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]"));
		}
		private WebElement AddNewAddressButon() {
			return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a/span"));
		}
		private WebElement MobilePhoneInputField() {
			return driver.findElement(By.id("phone_mobile"));	
		}
		private WebElement DeleteButton() {
			return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[1]/ul/li[9]/a[2]/span"));
		}
		
		
		
		public void myAccountTabClick() {
			this.MyAccountTab().click();
		}
		public void myAddressButton() {
			this.MyAddressButton().click();
		}
		public void updateButton() {
			this.UpdateButton().click();
		}
		public void saveButton() {
			this.SaveButton().click();
		}	
		public void addNewAddress(String address) {
			this.newAddressInputField().sendKeys(address);
		}
		public void addNewAddressButton() {
			this.AddNewAddressButon().click();
		}
		public void addCity(String city) {
			this.CityInputField().sendKeys(city);
		}
		public void stateDropDownMenu() {
			this.StateDropDownMenu().click();	
		}
		public void addZipPostalCode(String zipPostalCode) {
			this.ZipPostalCodeInputField().sendKeys(zipPostalCode);
		}
		public void homePhoneInputField(String homePhone) {
			this.HomePhoneInputField().sendKeys(homePhone);
		}
		public void mobilePhoneInputField(String mobliePhone) {
			this.MobilePhoneInputField().sendKeys(mobliePhone);
		}
		public void deleteButton() {
			this.DeleteButton().click();
		}
		
	
		}

