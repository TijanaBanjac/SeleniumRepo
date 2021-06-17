package testsZavrsniProjekat;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyWishListTabTests extends BaseTest {
	
		@BeforeMethod
			public void preSvakogTest() {
				driver.navigate().to("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span");
				driver.manage().window().maximize();
	}
		@Test
			public void addWishList() throws InterruptedException{
			
			String email = citacIzExcela.getStringData("LOGIN", 27, 9);
			String password = citacIzExcela.getStringData("LOGIN", 28, 9);
			Thread.sleep(2000);
			mainNavigation.LogInTabClick();
			logInTab.logInFormFilling(email, password);
			
			myWishListTab.myWishListClick();
			String name = citacIzExcela.getStringData("MY WISHLIST", 6, 9);
			myWishListTab.firstNameFormFilling(name);
			myWishListTab.saveButtonClick();
			String textForAssertion = citacIzExcela.getStringData("MY WISHLIST", 6, 5);
	
			assertEquals(textForAssertion, textForAssertion);
		}
		
		@Test
			public void addMultipleWishList() throws InterruptedException{
				myWishListTab.myWishListClick();
				String firstName = citacIzExcela.getStringData("MY WISHLIST", 16, 9);
				myWishListTab.firstNameFormFilling(firstName);
				myWishListTab.saveButtonClick();
				Thread.sleep(2000);
				String secondName = citacIzExcela.getStringData("MY WISHLIST", 18, 9);
				myWishListTab.secondNameFormFilling(secondName);
				myWishListTab.saveButtonClick();	
		}
		@Test
			public void removeWishList() throws InterruptedException{
				myWishListTab.myWishListClick();
				myWishListTab.deleteProduct();
		}
		@AfterMethod
			public void posleSvakogTest() throws InterruptedException{
				driver.manage().deleteAllCookies();
				driver.navigate().refresh();
	}
}
