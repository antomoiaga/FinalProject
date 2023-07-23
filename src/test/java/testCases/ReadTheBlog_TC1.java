package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.BlogPage;
import pages.AndEveryMorningPage;
import pages.HomePage;


public class ReadTheBlog_TC1 extends TestBase {

    @Test()
    public void read_the_blog(){
        test = extent.createTest("read the blog", "Case 1: User is able to read an article from the blog")
                .assignCategory("Functional_testcase")
                .assignAuthor("QA team");
        logger.info("Verify URL");

        openURL("https://www.cartepedia.ro/?gclid=CjwKCAjw-IWkBhBTEiwA2exyO2VKZJfeTZ0v7qKN0KFyxpqFaoDb1_XtEmAtCAcsqENCvtVm-YxmcRoCGMMQAvD_BwE");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");
        metode.clickOnButton(By.cssSelector(".close_cookie_bar"));
        metode.clickOnButton(By.id("closeCounter"));

        metode.waitForElementToBeVisible(HomePage.LibrarPersonalizatBtn);
        metode.assertTheText(HomePage.LibrarPersonalizatBtn, "Librar personalizat");
        test.log(Status.INFO, "Assert the LibrarPersonalizat button(Homepage)");
        logger.info("Assert the LibrarPersonalizat button(Homepage)");

        metode.waitForElementToBeClickable(HomePage.BlogBtn);
        metode.clickOnButton(HomePage.BlogBtn);
        test.log(Status.INFO, "Click on the Blog button(Homepage)");
        logger.info("Click on the Blog button(Homepage)");

        metode.waitForElementToBeVisible(BlogPage.BlogulCartepediaImage);
        metode.scrollDown(BlogPage.AndEveryMorningRecommendation);
        test.log(Status.INFO, "Scroll down to the AndEveryMorningRecommendation(BlogPage)");
        logger.info("Scroll down to the AndEveryMorningRecommendation(BlogPage)");

        metode.waitForElementToBeVisible(BlogPage.AndEveryMorningRecommendation);
        metode.assertTheText(BlogPage.AndEveryMorningRecommendation, "drumul spre");
        test.log(Status.INFO, "Scroll down to the AndEveryMorningRecommendation(BlogPage)");
        logger.info("Scroll down to the AndEveryMorningRecommendation(BlogPage)");

        metode.waitForElementToBeClickable(BlogPage.AndEveryMorningRecommendation);
        metode.clickOnButton(BlogPage.AndEveryMorningRecommendation);
        test.log(Status.INFO, "Click on AndEveryMorningRecommendation button(BlogPage)");
        logger.info("Click on AndEveryMorningRecommendation button(BlogPage)");

       metode.scrollDown(AndEveryMorningPage.EveryMorningText);
      metode.waitForElementToBeVisible(AndEveryMorningPage.EveryMorningText);
       metode.assertTheText(AndEveryMorningPage.EveryMorningText, "Fredrik Backman");
       test.log(Status.INFO, "Assert the sentence from EveryMorningText(AndEveryMorningPage)");
       logger.info("Assert the sentence from EveryMorningText(AndEveryMorningPage)");
    }
}
