package pages;

import org.openqa.selenium.By;

import static common.TestBase.driver;

public class CartepediaShopPage {

    public static By Earth = By.cssSelector("body > div.content_wrapper > div > div.page_content.page_content_subcat > div.items > div:nth-child(7) > a:nth-child(1) > picture > img");

    public static By ActivityGame = By.xpath("/html/body/div[4]/div/div[5]/div[2]/div[26]/a[1]/picture/img");

    public void denySubscribingToNews() throws InterruptedException {
        driver.switchTo().frame("lightbox_iframe");
        driver.findElement(By.id("lightbox_sign")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
    }
}
