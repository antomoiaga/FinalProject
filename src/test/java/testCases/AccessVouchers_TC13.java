package testCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.HomePage;
import pages.VouchersPage;

public class AccessVouchers_TC13 extends TestBase {

    @Test()
    public void can_access_vouchers(){
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

        metode.waitForElementToBeClickable(ContactPage.VouchersBtn);
        metode.clickOnButton(ContactPage.VouchersBtn);
        test.log(Status.INFO, "Click on the Vouchers Button(ContactPage)");
        logger.info("Click on the Vouchers Button(ContactPage)");

        metode.waitForElementToBeVisible(VouchersPage.PoftaDeLecturaVoucher);
        metode.checkImageIsDisplayed(VouchersPage.PoftaDeLecturaVoucher);
        test.log(Status.INFO, "Check that the image of the Vouchers named 'Pofta de Lectura' is displayed (VouchersPage)");
        logger.info("Check that the image of the Vouchers named 'Pofta de Lectura' is displayed (VouchersPage)");

        metode.waitForElementToBeVisible(VouchersPage.CoduriPromotionaleVoucher);
        metode.checkImageIsDisplayed(VouchersPage.CoduriPromotionaleVoucher);
        test.log(Status.INFO, "Check that the image of the Vouchers based on 'coduri promotionale' is displayed (VouchersPage)");
        logger.info("Check that the image of the Vouchers based on 'coduri promotionale' is displayed (VouchersPage)");

        metode.waitForElementToBeVisible(VouchersPage.CoduriValoriceVoucher);
        metode.checkImageIsDisplayed(VouchersPage.CoduriValoriceVoucher);
        test.log(Status.INFO, "Check that the image of the Vouchers based on 'coduri valorice' is displayed (VouchersPage)");
        logger.info("Check that the image of the Vouchers based on 'coduri valorice' is displayed (VouchersPage)");
    }
}
