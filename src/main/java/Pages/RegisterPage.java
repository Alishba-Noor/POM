package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    public WebDriver driver;
    WebDriverWait webDriverWait;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void waitClickable(By locator){
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(80));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        webDriverWait.until(ExpectedConditions.elementToBeClickable((locator)));
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 800)");
    }

    //REGISTER SCREEN XPATHS ......................
    By Register = By.xpath("//strong[contains(text(),'Register Now')]");
    By Onward_Connection = By.id("buy-new-onward-connection");
    By Choose_plan = By.xpath("//button[@id='10071']");
    By ContinueButton1 = By.xpath("//body/div[@id='__next']/div[2]/div[4]/div[1]/div[2]/button[1]");
    By PhoneLockNo_btn = By.xpath("//button[@id='no']");
    By IMEI_NumberField= By.xpath("//input[@id='standard-basic']");
    By IMEINumber_Ok = By.xpath("//body/div[@id='__next']/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]/*[1]");
    By BringOwnNumberNo_btn = By.xpath("//button[@id='no']");
    By ContiuneButton2=By.xpath("//body/div[@id='__next']/div[2]/div[4]/div[1]/div[2]/button[1]");
    By firstname = By.xpath("//input[@id=':r7:']");
    By lastname = By.xpath("//input[@id=':r8:']");
    By email = By.xpath("//input[@id=':r9:']");
    By address1 = By.xpath("//input[@id=':ra:']");
    By address2 = By.xpath("//input[@id=':rb:']");
    By city = By.xpath("//input[@id=':rc:']");
    By state = By.xpath("//div[@id='mui-component-select-billingState']");
    By state_DropDown = By.xpath("//body/div[@id='menu-billingState']/div[3]/ul[1]/li[8]");
    By Zip_Code = By.xpath("//input[@id=':re:']");
    By Service_address1 = By.xpath("//input[@id=':rf:']");
    By Service_address2 = By.xpath("//input[@id=':rg:']");
    By Service_city = By.xpath("//input[@id=':rh:']");
    By Service_state = By.xpath("//div[@id='mui-component-select-serviceState']");
    By Service_state_DropDown = By.xpath("//body/div[@id='menu-serviceState']/div[3]/ul[1]/li[9]");
    By Service_Zip_Code = By.xpath("//input[@id=':rj:']");
    By ContineButton3=By.xpath("//body/div[@id='__next']/div[2]/div[4]/div[1]/div[2]/button[1]");
    By Proceed_Button =By.xpath("//body/div[@id='__next']/div[2]/div[3]/div[1]/div[2]/div[1]/button[1]");
    By View_recipt= By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div[2]/form/div[1]/div/div/div[3]/div/div[2]/button");

    // REGISTER PAGE FUNCTIONS............................
    public void Click_Register(){
        waitClickable(Register);
        driver.findElement(Register).click();
    }
    public void Click_Onward_Connection(){
        waitClickable(Onward_Connection);
        driver.findElement(Onward_Connection).click();
    }
    public void Click_Choose_plan(){
        waitClickable(Choose_plan);
        driver.findElement(Choose_plan).click();
    }
    public void Click_ContinueButton1(){
        waitClickable(ContinueButton1);
        driver.findElement(ContinueButton1).click();
    }
    public void Click_ContinueButton2(){
        waitClickable(ContiuneButton2);
        driver.findElement(ContiuneButton2).click();
    }

    public void Click_PhoneLockNo_btn(){
        waitClickable(PhoneLockNo_btn);
        driver.findElement(PhoneLockNo_btn).click();
    }
    public void Send_IMEI_NumberField(){
        waitClickable(IMEI_NumberField);
        driver.findElement(IMEI_NumberField).sendKeys("243567565");
    }
    public void Click_IMEINumber_Ok(){
        waitClickable(IMEINumber_Ok);
        driver.findElement(IMEINumber_Ok).click();
    }
    public void Click_BringOwnNumberNo_btn(){
        waitClickable(BringOwnNumberNo_btn);
        driver.findElement(BringOwnNumberNo_btn).click();
    }

    public void Send_firstname(){
        waitClickable(firstname);
        driver.findElement(firstname).sendKeys("John");
    }
    public void Send_lastname(){
        waitClickable(lastname);
        driver.findElement(lastname).sendKeys("Sendy");
    }
    public void Send_email(){
        waitClickable(email);
        driver.findElement(email).sendKeys("arslan@gmail.com");
    }
    public void Send_address1(){
        waitClickable(address1);
        driver.findElement(address1).sendKeys("House 25/F");
    }
    public void Send_address2(){
        waitClickable(address2);
        driver.findElement(address2).sendKeys("Street 45 B");
    }
    public void Send_city(){
        waitClickable(city);
        driver.findElement(city).sendKeys("Islamabad");
    }
    public void Click_state(){
        waitClickable(state);
        driver.findElement(state).click();
    }
    public void Click_state_DropDown(){
        waitClickable(state_DropDown);
        driver.findElement(state_DropDown).click();

    }
    public void Send_Zip_Code(){
        waitClickable(Zip_Code);
        driver.findElement(Zip_Code).sendKeys("46000");
    }
    public void Send_Service_address1(){
        waitClickable(Service_address1);
        driver.findElement(Service_address1).sendKeys("House 25/F");
    }
    public void Send_Service_address2(){
        waitClickable(Service_address2);
        driver.findElement(Service_address2).sendKeys("Street 45 B");
    }
    public void Send_Service_city(){
        waitClickable(Service_city);
        driver.findElement(Service_city).sendKeys("Islamabad");
    }
    public void Click_Service_state(){
        waitClickable(Service_state);
        driver.findElement(Service_state).click();
    }
    public void Click_Service_state_DropDown(){
        waitClickable(Service_state_DropDown);
        driver.findElement(Service_state_DropDown).click();

    }
    public void Send_Service_Zip_Code(){
        waitClickable(Service_Zip_Code);
        driver.findElement(Service_Zip_Code).sendKeys("46000");
    }
    public void Click_ContineButton3(){
        waitClickable(ContineButton3);
        driver.findElement(ContineButton3).click();
    }
    public void Click_Proceed_Button(){
        waitClickable(Proceed_Button);
        driver.findElement(Proceed_Button).click();
    }
    public void Click_View_recipt(){
        waitClickable(View_recipt);
        driver.findElement(View_recipt).click();
    }
}
