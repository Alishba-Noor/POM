/*
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {
    public WebDriver driver;
    WebDriverWait webDriverWait;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(80));
    }
    public void waitClickable(By locator) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    By SearchOption = By.xpath("//input[@id=':r1:']");
    By DropdownOption = By.xpath("//input[@id=':r1:-option-0']");
    By SearchButton = By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*[1]");

    public void Click_SearchOption() {
        waitClickable(SearchOption);
        WebElement searchOption = driver.findElement(SearchOption);
        searchOption.click();
    }

    public void Search_Plans() {
        waitClickable(SearchOption);
        driver.findElement(SearchOption).clear();
        driver.findElement(SearchOption).sendKeys("Plans");
        driver.findElement(DropdownOption).click();
    }

    public void Click_SearchButton() {
        waitClickable(SearchButton);
        driver.findElement(SearchButton).click();
    }

    public void Search_Info() {
        waitClickable(SearchOption);
        driver.findElement(SearchOption).clear();
        driver.findElement(SearchOption).sendKeys("Info");
        driver.findElement(DropdownOption).click();
    }

    public void Search_Subscriptions() {
        waitClickable(SearchOption);
        driver.findElement(SearchOption).clear();
        driver.findElement(SearchOption).sendKeys("Subscriptions");
        driver.findElement(DropdownOption).click();
    }

    public void Search_Dashboard() {
        waitClickable(SearchOption);
        driver.findElement(SearchOption).clear();
        driver.findElement(SearchOption).sendKeys("Dashboard");
        driver.findElement(DropdownOption).click();
    }
}
*/
