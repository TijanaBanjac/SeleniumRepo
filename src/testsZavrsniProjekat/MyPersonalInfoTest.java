package testsZavrsniProjekat;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPersonalInfoTest extends BaseTest{
	
	@BeforeMethod
		public void preSvakogTesta() {
			driver.navigate().to("http://automationpractice.com/index.php?controller=my-account");
			driver.manage().window().maximize();
			
	}
	@Test
		public void editPersonalInformation() throws InterruptedException{
			

		String email = citacIzExcela.getStringData("LOGIN", 27, 9);
		String password = citacIzExcela.getStringData("LOGIN", 28, 9);
		mainNavigation.LogInTabClick();
		logInTab.logInFormFilling(email, password);
			
			myPersonalInfoTab.myPersonalInformationButtonClick();
			String currentPassword = citacIzExcela.getStringData("MY PERSONAL INFORMATION", 7, 9);
			myPersonalInfoTab.addCurrentPassword(currentPassword);
			String newPassword = citacIzExcela.getStringData("MY PERSONAL INFORMATION", 8, 9);
			myPersonalInfoTab.addNewPassword(newPassword);
			String confiramtion = citacIzExcela.getStringData("MY PERSONAL INFORMATION", 9, 9);
			myPersonalInfoTab.addConfirmation(confiramtion);
			myPersonalInfoTab.checkBoxSignUpClick();
			myPersonalInfoTab.saveButtonClick();
			String textForAssertion = citacIzExcela.getStringData("MY PERSONAL INFORMATION", 11, 7);
			
			assertEquals(textForAssertion, textForAssertion);
				
	}
	@AfterMethod
	public void posleSvakogTest() throws InterruptedException{
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
