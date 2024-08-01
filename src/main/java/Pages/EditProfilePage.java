package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditProfilePage {
    public WebDriver driver;
    WebDriverWait webDriverWait;
    public EditProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public void waitClickable(By locator) {
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(80));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        webDriverWait.until(ExpectedConditions.elementToBeClickable((locator)));
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");
    }

    //EDIT PROFILE SCREEN XPATHS ......................
    By UserDropdown = By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]/span[1]");
    By ProfileOption = By.xpath("//li[contains(text(),'Profile')]");
    By EditOption = By.xpath("//button[@id='edit-profile']");
    By DOBoption = By.xpath("//input[@id='dateofbirth']");
    By SaveOption = By.xpath("//button[@id='save']");

    // EDIT PROFILE FUNCTIONS............................
    public void Click_UserDropdown() {
        waitClickable(UserDropdown);
        driver.findElement(UserDropdown).click();
    }
    public void Click_Profile() {
        waitClickable(ProfileOption);
        driver.findElement(ProfileOption).click();
    }
    public void Click_EditProfile() {
        waitClickable(EditOption);
        driver.findElement(EditOption).click();
    }
    public void Click_DOBOption() {
        waitClickable(DOBoption);
        driver.findElement(DOBoption).sendKeys("16102022");
    }
    public void Click_Save() {
        waitClickable(SaveOption);
        driver.findElement(SaveOption).click();
    }
}

