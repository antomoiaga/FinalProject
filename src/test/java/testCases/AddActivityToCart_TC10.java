package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.ActivityPage;
import pages.CartepediaShopPage;
import pages.HomePage;

public class AddActivityToCart_TC10 extends TestBase {


    @Test()
    public void add_activity_to_cart() throws InterruptedException {
        test = extent.createTest("add Activity  to cart", "Case 10: User is able to add Activity to cart")
                .assignCategory("Functional_testcase")
                .assignAuthor("QA team");

        logger.info("Verify URL");
        openURL("https://www.cartepedia.ro/?gclid=CjwKCAjw-IWkBhBTEiwA2exyO2VKZJfeTZ0v7qKN0KFyxpqFaoDb1_XtEmAtCAcsqENCvtVm-YxmcRoCGMMQAvD_BwE");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");
        metode.clickOnButton(By.cssSelector(".close_cookie_bar"));
        metode.clickOnButton(By.id("closeCounter"));

        metode.waitForElementToBeVisible(HomePage.CartepediaBanner);
        metode.hoverOverElements(HomePage.CartepediaBanner);
        test.log(Status.INFO, "Hover over the Cartepedia Banner(Homepage)");
        logger.info("Hover over the Cartepedia Banner(Homepage)");

        metode.waitForElementToBeClickable(HomePage.ShopBtn);
        metode.clickOnButton(HomePage.ShopBtn);
        test.log(Status.INFO, "Click on the Shop Button(Homepage)");
        logger.info("Click on the Shop Button(Homepage)");

        metode.waitForElementToBeClickable(CartepediaShopPage.ActivityGame);
        metode.denySubscribingToNews();
        test.log(Status.INFO, "Click on the No Thank you button when asked to subscribe to the news(CartepediaShopPage)");
        logger.info("Click on the No Thank you button when asked to subscribe to the news(CartepediaShopPage)");

        metode.clickOnButton(CartepediaShopPage.ActivityGame);
        test.log(Status.INFO, "Click on the Activity Game (CartepediaShopPage)");
        logger.info("Click on the Activity Game (CartepediaShopPage)");

        Thread.sleep(2000);
        metode.denySubscribingToNews();
        metode.clickOnButton(ActivityPage.AddToCartActivity);
        test.log(Status.INFO, "Click on the add to cart the Activity Game (ActivityPage)");
        logger.info("Click on the add to cart the Activity Game (ActivityPage)");
    }
}
