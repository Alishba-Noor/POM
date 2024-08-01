package Tests;

import Base.Drivers;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class LoginTest extends Drivers {

    @Test(priority = 1)
    public void SC_PortalLogin() throws InterruptedException {
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
        System.out.println("Login Succesful");
    }
}
