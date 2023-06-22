package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchByHorrorGenre_TC5 extends TestBase {

    @Test()
    public void search_by_horror_genre() throws InterruptedException {
        test = extent.createTest("search by horror genre", "Case 5: User is able to search books by horror genre")
                .assignCategory("Functional_testcase")
                .assignAuthor("QA team");
        logger.info("Verify URL");

        openURL("https://www.cartepedia.ro/?gclid=CjwKCAjw-IWkBhBTEiwA2exyO2VKZJfeTZ0v7qKN0KFyxpqFaoDb1_XtEmAtCAcsqENCvtVm-YxmcRoCGMMQAvD_BwE");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        metode.waitForElementToBeVisible(HomePage.CartepediaBanner);
        metode.hoverOverElements(HomePage.CartepediaBanner);
        test.log(Status.INFO, "Hover over the Cartepedia Banner(Homepage)");
        logger.info("Hover over the Cartepedia Banner(Homepage)");

        metode.waitForElementToBeVisible(HomePage.CarteFictiuneBtn);
        metode.hoverOverElements(HomePage.CarteFictiuneBtn);
        test.log(Status.INFO, "Hover over the Fiction Books button(Homepage)");
        logger.info("Hover over the Fiction Books button(Homepage)");

        metode.waitForElementToBeVisible(HomePage.HorrorGenreBtn);
        metode.clickOnButton(HomePage.HorrorGenreBtn);
        test.log(Status.INFO, "Click on the Horror Genre button(Homepage)");
        logger.info("Click on the Horror Genre button(Homepage)");

    }
}
