package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;
import pages.CartepediaShopPage;
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

        metode.waitForElementToBeVisible(HomePage.CartepediaBanner);
        metode.hoverOverElements(HomePage.CartepediaBanner);


        metode.waitForElementToBeClickable(HomePage.ShopBtn);
        metode.clickOnButton(HomePage.ShopBtn);


        metode.waitForElementToBeClickable(CartepediaShopPage.Earth);
        metode.clickOnButton(CartepediaShopPage.Earth);
    }
}
