package Tests;

import Base.Drivers;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class InfoTest extends Drivers {

    @Test(priority = 1)
    public void Login() throws InterruptedException {
        test = extent.createTest(" Login Test", " Login Test");
        LoginPage.Click_Username1();
        Thread.sleep(2000);
        LoginPage.Click_Username();
        test.log(Status.INFO, "Click username field");
        LoginPage.Send_Username();
        test.log(Status.INFO, "Send username keys");
        LoginPage.Click_Password1();
        Thread.sleep(2000);
        LoginPage.Click_Password();
        test.log(Status.INFO, "Click password field");
        LoginPage.Send_Password();
        test.log(Status.INFO, "Send password keys");
        LoginPage.Click_Login_Btn();
        test.log(Status.INFO, "Click login Button");
        Thread.sleep(3000);
        System.out.println("Login Successful");
    }

    @Test(priority = 2)
    public void Info() throws InterruptedException {
        test = extent.createTest("Info Option test", "Info Option Test");
        Thread.sleep(2000);
        infoPage.Click_InfoOption();
        test.log(Status.INFO, "Click Info Option");
        Thread.sleep(3000);
        infoPage.Click_PrivacyPolicy();
        test.log(Status.INFO, "Click Privacy policy tab");
        System.out.println("Privacy Policy checked");
        Thread.sleep(3500);
        infoPage.Click_Licenses();
        test.log(Status.INFO, "Click Licenses tab");
        System.out.println("Liscenses checked");
        Thread.sleep(2000);
        infoPage.scrollToBottom();
        infoPage.scrollToTop();
        infoPage.Click_Terms();
        test.log(Status.INFO, "Click Terms And Conditions");
        System.out.println("Terms and conditions checked");
        Thread.sleep(2000);
        infoPage.scrollToBottom();
        infoPage.scrollToTop();

    }
}
