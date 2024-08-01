package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    public WebDriver driver;
    WebDriverWait webDriverWait;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void waitClickable(By locator){
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(80));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        webDriverWait.until(ExpectedConditions.elementToBeClickable((locator)));
    }

    //LOGIN SCREEN XPATHS ......................
    By username = By.name("phoneNumber");
    By password = By.name("password");
    By LoginBtn = By.xpath("//button[@type='submit']");

    // LOGIN PAGE FUNCTIONS............................
    public void Click_Username() {
        waitClickable(username);
        driver.findElement(username).click();
    }
    public void Send_Username(){
        waitClickable(username);
        driver.findElement(username).sendKeys("4704691340");
    }
    public void Click_Password(){
        waitClickable(password);
        driver.findElement(password).click();
    }
    public void Send_Password(){
        waitClickable(password);
        driver.findElement(password).sendKeys("654321");
    }
    public void Click_Username1(){
        waitClickable(username);
        driver.findElement(username).clear();
    }
    public void Click_Password1(){
        waitClickable(password);
        driver.findElement(password).clear();
    }
    public void Click_Login_Btn(){
        waitClickable(LoginBtn);
        driver.findElement(LoginBtn).click();
    }
}
