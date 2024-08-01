package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ManageNumbersPage {
    public WebDriver driver;
    WebDriverWait webDriverWait;
    public ManageNumbersPage(WebDriver driver) {
        this.driver = driver;
    }
    public void waitClickable(By locator){
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(80));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        webDriverWait.until(ExpectedConditions.elementToBeClickable((locator)));
    }

    //MANAGE NUMBERS SCREEN XPATHS ......................
    By UserDropdown = By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]/span[1]/*[1]");
    By Number1 = By.xpath("//li[contains(text(),'4704048279')]");
    By PrimaryNumber = By.xpath("//li[contains(text(),'4704691340')]");
    By YesOption = By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/button[2]");
    By OKOption = By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]");
    By Number1Heading = By.xpath("//h3[contains(text(),'(470) 404-8279')]");

    // Manage Number PAGE FUNCTIONS............................
    public void Click_UserDropdown() {
        waitClickable(UserDropdown);
        driver.findElement(UserDropdown).click();
    }
    public void Click_Number1(){
        waitClickable(Number1);
        driver.findElement(Number1).click();
    }
    public void Click_YesOption(){
        waitClickable(YesOption);
        driver.findElement(YesOption).click();
    }
    public void Click_OKoption(){
        waitClickable(OKOption);
        driver.findElement(OKOption).click();
    }
    public String getNumber1HeadingText() {
        waitClickable(Number1Heading);
        return driver.findElement(Number1Heading).getText();
    }

}
