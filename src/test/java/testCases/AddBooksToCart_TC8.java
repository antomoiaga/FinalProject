package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ZafonBooksPage;

public class AddBooksToCart_TC8 extends TestBase {

   @Test()
    public void add_books_to_cart() throws InterruptedException {
       test = extent.createTest("add books to cart", "Case 8: User is able to add books to cart")
               .assignCategory("Functional_testcase")
               .assignAuthor("QA team");
       logger.info("Verify URL");

       openURL("https://www.cartepedia.ro/?gclid=CjwKCAjw-IWkBhBTEiwA2exyO2VKZJfeTZ0v7qKN0KFyxpqFaoDb1_XtEmAtCAcsqENCvtVm-YxmcRoCGMMQAvD_BwE");
       test.log(Status.INFO, "Open URL");
       logger.info("Open URL");

       metode.waitForElementToBeClickable(HomePage.SearchBookOrAuthorField);
       metode.clickOnButton(HomePage.SearchBookOrAuthorField);
       test.log(Status.INFO, "Click on the Search book or author field(Homepage)");
       logger.info("Click on the Search book or author field(Homepage)");

       metode.enterText(HomePage.SearchBookOrAuthorField, "Carlos Ruiz Zafon");
       metode.clickOnButton(HomePage.SubmitSearchBtn);
       test.log(Status.INFO, "Submit a search for Carlos Ruiz Zafon(Homepage)");
       logger.info("Submit a search for Carlos Ruiz Zafon(Homepage)");

       metode.scrollDown(ZafonBooksPage.OrasulDeAburBook);
       metode.hoverOverElements(ZafonBooksPage.OrasulDeAburBook);
       metode.waitForElementToBeClickable(ZafonBooksPage.BuyOrasulDeAburBtn);
       metode.clickOnButton(ZafonBooksPage.BuyOrasulDeAburBtn);
       test.log(Status.INFO, "Hovering over Orasul de abur book, select buy(ZafonBooksPage)");
       logger.info("Hovering over Orasul de abur book, select buy(ZafonBooksPage)");

       metode.scrollDown(ZafonBooksPage.LabirintulSpiritelorBook);
       metode.waitForElementToBeVisible(ZafonBooksPage.LabirintulSpiritelorBook);
       metode.hoverOverElements(ZafonBooksPage.LabirintulSpiritelorBook);
       Thread.sleep(2000);
       metode.waitForElementToBeClickable(ZafonBooksPage.BuyLabirintulBtn);
       metode.clickOnButton(ZafonBooksPage.BuyLabirintulBtn);
       test.log(Status.INFO, "Hovering over Labirintul spiritelor book, select buy(ZafonBooksPage)");
       logger.info("Hovering over Labirintul spiritelor book, select buy(ZafonBooksPage)");

       metode.scrollDown(ZafonBooksPage.CartBtn);
       metode.waitForElementToBeClickable(ZafonBooksPage.CartBtn);
       test.log(Status.INFO, "Scroll to the Cart Button(ZafonBooksPage)");
       logger.info("Scroll to the Cart Button(ZafonBooksPage)");

       metode.hoverOverElements(ZafonBooksPage.CartBtn);
       metode.clickOnButton(ZafonBooksPage.CartBtn);
      test.log(Status.INFO, "Select the Cart Button(ZafonBooksPage)");
      logger.info("Select the Cart Button(ZafonBooksPage)");

      Thread.sleep(2000);
      metode.scrollDown(CartPage.OrderedProduct);
      metode.waitForElementToBeVisible(CartPage.OrderedProduct);
      metode.assertTheText(CartPage.OrderedProduct,"comandat");
      test.log(Status.INFO, "Assert the Ordered product(CartPage)");
      logger.info("Assert the Ordered product(CartPage)");

   }


}
