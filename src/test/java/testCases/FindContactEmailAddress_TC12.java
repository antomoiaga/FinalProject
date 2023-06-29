package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.HomePage;

public class FindContactEmailAddress_TC12 extends TestBase {

    @Test()
    public void find_contact_email_address(){

        test = extent.createTest("find contact email address", "Case 12: User is able to find a contact email address")
                .assignCategory("Functional_testcase")
                .assignAuthor("QA team");



        logger.info("Verify URL");
        openURL("https://www.cartepedia.ro/?gclid=CjwKCAjw-IWkBhBTEiwA2exyO2VKZJfeTZ0v7qKN0KFyxpqFaoDb1_XtEmAtCAcsqENCvtVm-YxmcRoCGMMQAvD_BwE");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        metode.waitForElementToBeClickable(HomePage.ContactBtn);
        metode.clickOnButton(HomePage.ContactBtn);
        test.log(Status.INFO, "Click on the Contact Button(Homepage)");
        logger.info("Click on the Contact Button(Homepage)");

        metode.waitForElementToBeVisible(ContactPage.EmailAddress);
        metode.assertTheText(ContactPage.EmailAddress, "carte@cartepedia.ro");
        test.log(Status.INFO, "Assert that the email address is displayed(ContactPage)");
        logger.info("Assert that the email address is displayed(ContactPage)");

    }
}
