package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.bouncycastle.cms.CMSEncryptedData;
import org.testng.annotations.Test;
import pages.ArthurPage;
import pages.DiscountsPage;
import pages.HomePage;

public class SelectArthurDiscounts_TC7 extends TestBase {

    @Test()
    public void select_arthur_discounts(){
        test = extent.createTest("select books with discounts from the Arthur publishing house", "Case 7: User is able to select the page with discounts for the Arthur publishing house")
                .assignCategory("Functional_testcase")
                .assignAuthor("QA team");
        logger.info("Verify URL");

        openURL("https://www.cartepedia.ro/?gclid=CjwKCAjw-IWkBhBTEiwA2exyO2VKZJfeTZ0v7qKN0KFyxpqFaoDb1_XtEmAtCAcsqENCvtVm-YxmcRoCGMMQAvD_BwE");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        metode.waitForElementToBeClickable(HomePage.DiscountsBtn);
        metode.clickOnButton(HomePage.DiscountsBtn);
        test.log(Status.INFO, "Click on the Discounts button(Homepage)");
        logger.info("Click on the Discounts button(Homepage)");

        metode.waitForElementToBeClickable(DiscountsPage.ArthurDiscounts);
        metode.clickOnButton(DiscountsPage.ArthurDiscounts);
        test.log(Status.INFO, "Click on the Arthur Discounts image(DiscountsPage)");
        logger.info("Click on the Arthur Discounts image(DiscountsPage)");





    }
}
