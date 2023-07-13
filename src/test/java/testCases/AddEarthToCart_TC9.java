package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CartepediaShopPage;
import pages.EarthPage;
import pages.HomePage;

public class AddEarthToCart_TC9 extends TestBase {


    @Test()
    public void add_earth_to_cart() throws InterruptedException {
        test = extent.createTest("add earth  to cart", "Case 9: User is able to add earth to cart")
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

        metode.waitForElementToBeClickable(CartepediaShopPage.Earth);
        metode.denySubscribingToNews();
        test.log(Status.INFO, "Click on the No Thank you button when asked to subscribe to the news(CartepediaShopPage)");
        logger.info("Click on the No Thank you button when asked to subscribe to the news(CartepediaShopPage)");

        metode.clickOnButton(CartepediaShopPage.Earth);
        test.log(Status.INFO, "Click on the Earth (CartepediaShopPage)");
        logger.info("Click on the Earth (CartepediaShopPage)");


        metode.denySubscribingToNews();
       metode.waitForElementToBeClickable(EarthPage.AddToCartEarthBtn);

       metode.clickOnButton(EarthPage.AddToCartEarthBtn);
    }
}

