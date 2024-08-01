package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsPage {
    public WebDriver driver;
    WebDriverWait webDriverWait;
    public ContactUsPage(WebDriver driver) {
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
            js.executeScript("window.scrollBy(0, 200)"); // Scroll by smaller increments
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
            js.executeScript("window.scrollBy(0, -200)"); // Scroll by smaller increments
            try {
                Thread.sleep(200); // Delay between scrolls
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //CONTACT-US SCREEN XPATHS ......................
    By HelpButton = By.xpath("//body/div[@id='__next']/div[@id='expiryDialog']/div[2]/button[1]/*[1]");
    By FAQ = By.xpath("//button[@id='tab-0']");
    By Complaint = By.xpath("//button[@id='tab-1']");
    By Support = By.xpath("//button[@id='tab-2']");
    By CallUs = By.xpath("//body/div[@id='__next']/div[@id='expiryDialog']/div[2]/div[2]/main[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    By EmailUs = By.xpath("//body/div[@id='__next']/div[@id='expiryDialog']/div[2]/div[2]/main[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]");
    By Address = By.xpath("//body/div[@id='__next']/div[@id='expiryDialog']/div[2]/div[2]/main[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]");
    By SocialChannels = By.xpath("//body/div[@id='__next']/div[@id='expiryDialog']/div[2]/div[2]/main[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]");

    // CONTACT-US PAGE FUNCTIONS............................
    public void Click_HelpButton() {
        waitClickable(HelpButton);
        driver.findElement(HelpButton).click();
    }
    public void Click_FAQ(){
        waitClickable(FAQ);
        driver.findElement(FAQ).click();
    }
    public void Click_Complaint(){
        waitClickable(Complaint);
        driver.findElement(Complaint).click();
    }
    public void Click_Support(){
        waitClickable(Support);
        driver.findElement(Support).click();
    }
    public void Click_CallUs(){
        waitClickable(CallUs);
        driver.findElement(CallUs).click();
    }
    public void Click_EmailUs(){
        waitClickable(EmailUs);
        driver.findElement(EmailUs).click();
    }
    public void Click_Address(){
        waitClickable(Address);
        driver.findElement(Address).click();
    }
    public void Click_Social(){
        waitClickable(SocialChannels);
        driver.findElement(SocialChannels).click();
    }
}
