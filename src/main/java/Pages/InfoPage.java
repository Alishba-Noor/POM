package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InfoPage {
    public WebDriver driver;
    WebDriverWait webDriverWait;
    public InfoPage(WebDriver driver) {
        this.driver = driver;
    }
    public void waitClickable(By locator){
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(80));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        webDriverWait.until(ExpectedConditions.elementToBeClickable((locator)));
    }
    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 800)"); // Scroll by smaller increments
            try {
                Thread.sleep(200); // Delay between scrolls
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void scrollToTop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -800)"); // Scroll by smaller increments
            try {
                Thread.sleep(200); // Delay between scrolls
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //INFO PAGE SCREEN XPATHS ......................
    By InfoOption = By.xpath("//*[@id=\"info\"]/a/div/p");
    By PrivacyPolicy = By.id("tab-1");
    By Licenses = By.id("tab-2");
    By TermsAndConditions = By.id("tab-3");

    // INFO PAGE FUNCTIONS............................
    public void Click_InfoOption() {
        waitClickable(InfoOption);
        driver.findElement(InfoOption).click();
    }
    public void Click_PrivacyPolicy(){
        waitClickable(PrivacyPolicy);
        driver.findElement(PrivacyPolicy).click();
    }
    public void Click_Licenses(){
        waitClickable(Licenses);
        driver.findElement(Licenses).click();
    }
    public void Click_Terms(){
        waitClickable(TermsAndConditions);
        driver.findElement(TermsAndConditions).click();
    }
}
