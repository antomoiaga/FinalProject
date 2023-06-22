package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;
import pages.HPublishingHouses;
import pages.HomePage;
import pages.HumanitasPage;
import pages.PublishingHousesPage;

public class SearchByPublishingHouseLetterH_TC2 extends TestBase  {

    @Test()
    public void search_by_publishing_house_letter_h() {
        test = extent.createTest("search books by publishing house", "Case 2: User is able to search books by publishing house starting with letter H")
                .assignCategory("Functional_testcase")
                .assignAuthor("QA team");
        logger.info("Verify URL");

        openURL("https://www.cartepedia.ro/?gclid=CjwKCAjw-IWkBhBTEiwA2exyO2VKZJfeTZ0v7qKN0KFyxpqFaoDb1_XtEmAtCAcsqENCvtVm-YxmcRoCGMMQAvD_BwE");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        metode.waitForElementToBeClickable(HomePage.PublishingHousesBtn);
        metode.clickOnButton(HomePage.PublishingHousesBtn);
        test.log(Status.INFO, "Click on the Publishing House Button(Homepage)");
        logger.info("Click on the Publishing House Button(Homepage)");

        metode.waitForElementToBeClickable(PublishingHousesPage.HPublishingHousesBtn);
        metode.clickOnButton(PublishingHousesPage.HPublishingHousesBtn);
        test.log(Status.INFO, "Click on the H Publishing House Button(PublishingHousesPage)");
        logger.info("Click on the H Publishing House Button(PublishingHousesPage)");

        metode.waitForElementToBeClickable(HPublishingHouses.HumanitasBtn);
        metode.clickOnButton(HPublishingHouses.HumanitasBtn);
        test.log(Status.INFO, "Click on the Humanitas Button(HPublishingHouses)");
        logger.info("Click on the Humanitas Button(HPublishingHouses)");

        metode.waitForElementToBeVisible(HumanitasPage.HumanitasDescriptionText);
        metode.assertTheText(HumanitasPage.HumanitasDescriptionText, "Editurii Humanitas");
        test.log(Status.INFO, "Assert the Humanitas text(HumanitasPage)");
        logger.info("Assert the Humanitas text(HumanitasPage)");
    }
}
