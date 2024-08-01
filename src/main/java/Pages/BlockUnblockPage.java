package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BlockUnblockPage {
    public WebDriver driver;
    WebDriverWait webDriverWait;
    public BlockUnblockPage(WebDriver driver) {
        this.driver = driver;
    }
    public void waitClickable(By locator){
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(80));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        webDriverWait.until(ExpectedConditions.elementToBeClickable((locator)));
    }

    //BLOCK/UNBLOCK SCREEN XPATHS ......................
    By ManageNumber = By.xpath("//li[contains(text(),'Manage Numbers')]");
    By BlockButton = By.xpath("//button[@id='block-sim']");
    By BlockPopUp =By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]");
    By OkButton = By.xpath("//button[@id='ok']");
    By UnblockButton = By.xpath("//button[@id='unblock-sim']");
    By UnblockPopUp = By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]");

    // BLOCK/UNBLOCK PAGE FUNCTIONS............................
    public void Click_ManageNumber() {
        waitClickable(ManageNumber);
        driver.findElement(ManageNumber).click();
    }
    public void Click_BlockButton(){
        waitClickable(BlockButton);
        driver.findElement(BlockButton).click();
    }
    public void Click_BlockPopup(){
        waitClickable(BlockPopUp);
        driver.findElement(BlockPopUp).click();
    }
    public void Click_OkButton(){
        waitClickable(OkButton);
        driver.findElement(OkButton).click();
    }
    public void Click_UnblockButton(){
        waitClickable(UnblockButton);
        driver.findElement(UnblockButton).click();
    }
    public void Click_UnblockPopup(){
        waitClickable(UnblockPopUp);
        driver.findElement(UnblockPopUp).click();
    }
}
