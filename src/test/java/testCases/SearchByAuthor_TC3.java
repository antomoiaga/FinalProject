package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MurakamiPage;

public class SearchByAuthor_TC3 extends TestBase {

    @Test()
    public void search_by_author() {

        test = extent.createTest("search by author", "Case 3: User is able to search books by author")
                .assignCategory("Functional_testcase")
                .assignAuthor("QA team");
        logger.info("Verify URL");

        openURL("https://www.cartepedia.ro/?gclid=CjwKCAjw-IWkBhBTEiwA2exyO2VKZJfeTZ0v7qKN0KFyxpqFaoDb1_XtEmAtCAcsqENCvtVm-YxmcRoCGMMQAvD_BwE");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        metode.waitForElementToBeClickable(HomePage.SearchBookOrAuthorField);
        metode.clickOnButton(HomePage.SearchBookOrAuthorField);
        test.log(Status.INFO, "Click on the Search Book Or Author Field(Homepage)");
        logger.info("Click on the Search Book Or Author Field(Homepage)");

        metode.enterText(HomePage.SearchBookOrAuthorField, "Murakami");
        metode.clickOnButton(HomePage.SubmitSearchBtn);
        test.log(Status.INFO, "Click on the Submit Search Button(Homepage)");
        logger.info("Click on the Submit Search Button(Homepage)");

        metode.waitForElementToBeVisible(MurakamiPage.MurakamiBookItem);
        metode.assertTheText(MurakamiPage.MurakamiBookItem, "Murakami");
        test.log(Status.INFO, "Assert that the displayed book item is written by Murakami(MurakamiPage)");
        logger.info("Assert that the displayed book item is written by Murakami(MurakamiPage)");

    }
}
