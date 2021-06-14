package testsZavrsniProjekat;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class LogInTests extends BaseTest{
		
		@BeforeMethod
			public void preSvakogTest() {
				driver.navigate().to(homerUrl);
				driver.manage().window().maximize();
		}
				
		@Test
			public void logInWithValidCredentials() throws InterruptedException{
				String email = citacIzExcela.getStringData("LOGIN", 27, 9);
				String password = citacIzExcela.getStringData("LOGIN", 28, 9);
				Thread.sleep(2000);
				mainNavigation.LogInTabClick();
				logInTab.logInFormFilling(email, password);
				String textForAssertion = citacIzExcela.getStringData("LOGIN", 29, 7);
			
			assertEquals(textForAssertion, textForAssertion);
		}
		
		@Test
			public void logInWithInvalidCredentials() throws InterruptedException{
				String email = citacIzExcela.getStringData("LOGIN", 37, 9);
				String password = citacIzExcela.getStringData("LOGIN", 38, 9);
				Thread.sleep(2000);
				mainNavigation.LogInTabClick();
				logInTab.logInFormFilling(email, password);
				String textForAssertion = citacIzExcela.getStringData("LOGIN", 39, 7);
				//String actualText = logInPage.textInvalidCredentials();
				
				}
		@Test
			public void logInWithEmptyCredentials() throws InterruptedException{
				mainNavigation.LogInTabClick();	
				logInTab.logInFormFilling(" ", " ");
				String textForAssertion = citacIzExcela.getStringData("LOGIN", 49, 7);
				AssertJUnit.assertEquals(textForAssertion, textForAssertion);
		}
		@Test
			public void logInWithEmptyPasswordAndEnteredEmail () throws InterruptedException{
				String email = citacIzExcela.getStringData("LOGIN", 57, 9);
				String password = citacIzExcela.getStringData("LOGIN", 58, 9);
				Thread.sleep(2000);
				mainNavigation.LogInTabClick();
				logInTab.logInFormFilling(email, password);
				String textForAssertion = citacIzExcela.getStringData("LOGIN", 59, 7);
				AssertJUnit.assertEquals(textForAssertion, textForAssertion);
		}
		@Test
			public void signOut()throws InterruptedException{
				logInWithValidCredentials();
				Thread.sleep(2000);
				mainNavigation.LogInTabClick();
				logInTab.signOutButton();	
				String textForAssertion = citacIzExcela.getStringData("LOGIN", 69, 7);
				assertEquals(textForAssertion, textForAssertion);
	}
		@AfterMethod
			public void posleSvakogTest() throws InterruptedException{
				driver.manage().deleteAllCookies();
				driver.navigate().refresh();
		}

	}


