package metode;

import common.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static common.TestBase.driver;

import static junit.framework.TestCase.assertTrue;

public class Metode extends TestBase {

    public void clickOnButton(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void enterText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    public void scrollDown(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoViewIfNeeded();", element);
    }

    public void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void assertTheText(By locator, String textToAssert) {
        WebElement element = driver.findElement(locator);
        String text = element.getText();
        assertTrue(text.contains(textToAssert));
    }

    public void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void hoverOverElements(By locator) {
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(locator);
        builder.moveToElement(element).build().perform();
    }

    public void checkImageIsDisplayed(By locator) {
        WebElement element = driver.findElement(locator);
        element.isDisplayed();
    }

    public void denySubscribingToNews() throws InterruptedException {
        driver.switchTo().frame("lightbox_iframe");
        driver.findElement(By.id("lightbox_sign")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
    }

    public void denyMagazine() throws InterruptedException {
        driver.switchTo().frame("/html/body/div[7]/div/div/a");

        driver.findElement(By.id("closeCounter")).click();

        Thread.sleep(2000);

        driver.switchTo().defaultContent();
    }

   /* public void closeCookies() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(1));
        driver.get("https://www.cartepedia.ro/edituri/H");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".close_cookie_bar"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("closeCounter"))).click();
        driver.close();
    }*/
}
