package testsZavrsniProjekat;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTests extends BaseTest{
		
		@BeforeMethod
		public void preSvakogTesta() {
			driver.navigate().to("http://automationpractice.com/index.php?controller=my-account");
			driver.manage().window().maximize();
			
				String email = citacIzExcela.getStringData("LOGIN", 27, 9);
				String password = citacIzExcela.getStringData("LOGIN", 28, 9);
				mainNavigation.LogInTabClick();
				logInTab.logInFormFilling(email, password);
		}
		@Test
			public void updateAddress() throws InterruptedException{
				myAccountTab.myAccountTabClick();
				myAccountTab.myAddressButton();
				myAccountTab.updateButton();
				String address = citacIzExcela.getStringData("MY ACCOUNT", 7, 9);
				myAccountTab.addNewAddress(address);
				logInFormFilling(address);
				myAccountTab.saveButton();
				String textForAssertion = citacIzExcela.getStringData("MY ACCOUNT", 10, 6);
			
			assertEquals(textForAssertion, textForAssertion);
		
		}
		public void logInFormFilling(String address) {
			mainNavigation.MyAccountTabClick();
			myAccountTab.addNewAddress(address);
		}
		
		@Test
			public void addAddress() throws InterruptedException{
				myAccountTab.myAccountTabClick();
				myAccountTab.myAddressButton();
				myAccountTab.addNewAddressButton();
				String city = citacIzExcela.getStringData("MY ACCOUNT", 20, 9);
				myAccountTab.addCity(city);
				Thread.sleep(2000);
				myAccountTab.stateDropDownMenu();
				String address = citacIzExcela.getStringData("MY ACCOUNT", 7, 9);
				logInFormFilling(address);
				Thread.sleep(2000);
				String zipPostalCode = citacIzExcela.getStringData("MY ACCOUNT", 23, 9);
				myAccountTab.addZipPostalCode(zipPostalCode);
				Thread.sleep(2000);
				String homePhone = citacIzExcela.getStringData("MY ACCOUNT", 24, 9);
				myAccountTab.homePhoneInputField(homePhone);
				Thread.sleep(2000);
				String mobilePhone = citacIzExcela.getStringData("MY ACCOUNT", 25, 9);
				myAccountTab.mobilePhoneInputField(mobilePhone);
				Thread.sleep(2000);
				myAccountTab.saveButton();
				String textForAssertion = citacIzExcela.getStringData("MY ACCOUNT", 28, 6);
				
				assertEquals(textForAssertion, textForAssertion);
			
		}
				
		@Test
			public void removeAddress() throws InterruptedException{
				myAccountTab.myAccountTabClick();
				myAccountTab.myAddressButton();
				myAccountTab.deleteButton();
				String textForAssertion = citacIzExcela.getStringData("MY ACCOUNT", 38, 6);
				
				assertEquals(textForAssertion, textForAssertion);
			
		}
		
		@AfterMethod
		public void posleSvakogTest() throws InterruptedException{
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
	}
	
}
				
	
	


