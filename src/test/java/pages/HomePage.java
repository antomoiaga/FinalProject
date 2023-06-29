package pages;

import org.openqa.selenium.By;

public class HomePage {

    public static By LibrarPersonalizatBtn = By.xpath("//span[contains(.,'Librar personalizat')]");

    public static By BlogBtn = By.xpath("/html/body/div[2]/div[2]/ul/li[3]/a/span");

    public static By PublishingHousesBtn = By.xpath("/html/body/div[2]/div[2]/ul/li[7]/a/span");

    public static By SearchBookOrAuthorField = By.id("search_input");

    public static By SubmitSearchBtn = By.id("submit_search");

    public static By CartepediaBanner = By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div/div[3]/a/img");

    public static By CarteFictiuneBtn = By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div/a");

    public static By HorrorGenreBtn = By.xpath("/html/body/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/a[5]");

    public static By CrimeGenreBtn = By.xpath("/html/body/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/a[14]");

    public static By DiscountsBtn = By.xpath("/html/body/div[2]/div[2]/ul/li[1]/a/span");

    public static By ShopBtn = By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[5]/a");

    public static By PuzzleBtn = By.xpath("/html/body/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/a[10]");


}
