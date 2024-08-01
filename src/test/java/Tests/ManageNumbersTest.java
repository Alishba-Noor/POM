package Tests;

import Base.Drivers;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageNumbersTest extends Drivers {

    @Test(priority = 1)
    public void Login() throws InterruptedException {
        test = extent.createTest("Login Test", " Login Test");
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
    public void Switch_Numbers() throws InterruptedException {
        test = extent.createTest(" Switch Numbers test", " Switch Numbers Test");
        Thread.sleep(2000);
        manageNumbersPage.Click_UserDropdown();
        test.log(Status.INFO, "Click user Dropdown Option");
        manageNumbersPage.Click_Number1();
        test.log(Status.INFO, "Click Number 1 Option");
        manageNumbersPage.Click_YesOption();
        test.log(Status.INFO, "Click Yes Option");
        Thread.sleep(3000);
        manageNumbersPage.Click_OKoption();
        test.log(Status.INFO, "Click Ok Option");
        String headingText = manageNumbersPage.getNumber1HeadingText();
        Assert.assertEquals(headingText, "(470) 404-8279", "The heading should show (470) 404-8279");
        System.out.println("Number changed Succesful");
    }
}