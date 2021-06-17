package testsZavrsniProjekat;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingProductsToCartTests extends BaseTest {
	
	@BeforeMethod
	public void preSvakogTest() {
		driver.navigate().to("http://automationpractice.com");
		driver.manage().window().maximize();
		
		String email = citacIzExcela.getStringData("LOGIN", 27, 9);
		String password = citacIzExcela.getStringData("LOGIN", 28, 9);
		mainNavigation.LogInTabClick();
		logInTab.logInFormFilling(email, password);
		
	}
	
	@Test
		public void verifyThatUserCanAddOneProduct() throws InterruptedException{
		
			addingProductsToCartPage.productClick();
			addingProductsToCartPage.addToCart();
			addingProductsToCartPage.proceedToCheckoutClick();
			addingProductsToCartPage.proceedToCheckoutSummaryClick();
			addingProductsToCartPage.proceedToCheckoutAddressClick();
			addingProductsToCartPage.termsOfServiceCheckClick();
			addingProductsToCartPage.proceedToCheckoutShippingClick();
		
		
		String textForAssertion = citacIzExcela.getStringData("ADDING PRODUCTS TO CART", 11, 10);
	
		assertEquals(textForAssertion, textForAssertion);
	}
	
	@Test
		public void addOneProductQuantity() throws InterruptedException{
		
			addingProductsToCartPage.productClick();
			String number = citacIzExcela.getStringData("ADDING PRODUCTS TO CART", 20, 16);
			addingProductsToCartPage.addNumberToFieldQuantity(number);
			addingProductsToCartPage.addToCart();
			addingProductsToCartPage.proceedToCheckoutClick();
			addingProductsToCartPage.proceedToCheckoutSummaryClick();
			addingProductsToCartPage.proceedToCheckoutAddressClick();
			addingProductsToCartPage.gettermsOfServiceCheck();
			addingProductsToCartPage.proceedToCheckoutShippingClick();
			
		String textForAssertion = citacIzExcela.getStringData("ADDING PRODUCTS TO CART", 26, 10);
			
		assertEquals(textForAssertion, textForAssertion);
	}
	
	@Test
		public void addMultipleProductsToCart() throws InterruptedException{
			addingProductsToCartPage.firstProductClick();
			addingProductsToCartPage.addToCart();
			addingProductsToCartPage.continueShoppingButtonClick();
			addingProductsToCartPage.dressesButtonClick();
			Thread.sleep(2000);
			addingProductsToCartPage.secondProductClick();
			addingProductsToCartPage.addToCart();
			addingProductsToCartPage.continueShoppingButtonClick();
			addingProductsToCartPage.dressesButtonClick();
			addingProductsToCartPage.thirdProductClick();
			addingProductsToCartPage.addToCart();
			addingProductsToCartPage.proceedToCheckoutSummaryClick();
			
		String textForAssertion = citacIzExcela.getStringData("ADDING PRODUCTS TO CART", 45, 10);
			
		assertEquals(textForAssertion, textForAssertion);
	}
	
	@Test
		public void removeProductFromCart()throws InterruptedException{
		addingProductsToCartPage.cartButtonClick();
		addingProductsToCartPage.binButtonClick();
		
		String textForAssertion = citacIzExcela.getStringData("ADDING PRODUCTS TO CART", 54, 10);
		
		assertEquals(textForAssertion, textForAssertion);
	}

	@AfterMethod
	public void posleSvakogTest() throws InterruptedException{
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
