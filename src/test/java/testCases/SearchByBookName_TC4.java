package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;
import pages.GospodinovPage;
import pages.HomePage;

public class SearchByBookName_TC4 extends TestBase {

    @Test()
    public void search_by_book_name(){

        test = extent.createTest("search books by book name", "Case 4: User is able to search books by book name")
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

        metode.enterText(HomePage.SearchBookOrAuthorField, "Refugiul timpului");
        metode.clickOnButton(HomePage.SubmitSearchBtn);
        test.log(Status.INFO, "Click on the Submit search button(Homepage)");
        logger.info("Click on the Submit search button(Homepage)");

        metode.waitForElementToBeVisible(GospodinovPage.RefugiulTimuluiBook);
        metode.assertTheText(GospodinovPage.RefugiulTimuluiBook, "Refugiul timpului");
        test.log(Status.INFO, "Assert that the book named Refugiul Timpului is displayed(GospodinovPage)");
        logger.info("Assert that the book named Refugiul Timpului is displayed(GospodinovPage)");
    }
}
