package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.HomePage;

public class FindContactNumber_TC11 extends TestBase {

    @Test()
    public void find_contact_number(){
        test = extent.createTest("find contact number", "Case 11: User is able to find a contact phone number")
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

        metode.waitForElementToBeVisible(ContactPage.PhoneText);
        metode.assertTheText(ContactPage.PhoneText, "Telefon");
        test.log(Status.INFO, "Assert that the Telephone element is displayed(ContactPage)");
        logger.info("Assert that the Telephone element is displayed(ContactPage)");
    }
}
