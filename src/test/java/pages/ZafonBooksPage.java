package pages;

import org.openqa.selenium.By;

public class ZafonBooksPage {

    public static By OrasulDeAburBook = By.cssSelector("body > div.content_wrapper > div > div.page_content.page_content_subcat > div.items > div:nth-child(6) > a:nth-child(1) > picture > img");

    public static By BuyOrasulDeAburBtn = By.id("add_prod_b_224662");

    public static By LabirintulSpiritelorBook = By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[7]/a[1]/picture/img");

    public static By BuyLabirintulBtn = By.xpath("/html/body/div[4]/div/div[4]/div[5]/div[7]/span[3]/a");

    public static By CartBtn = By.xpath("/html/body/div[2]/div[2]/div[4]/div[1]/div/div/a");
}
