package Tests;

import Base.Drivers;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class EditProfileTest extends Drivers {

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
    public void Edit_profile() throws InterruptedException {
        test = extent.createTest(" Edit Profile test", " Edit Profile Test");
        Thread.sleep(2000);
        editProfilePage.Click_UserDropdown();
        test.log(Status.INFO, "Click user Dropdown Option");
        editProfilePage.Click_Profile();
        test.log(Status.INFO, "Click Profile Option");
        Thread.sleep(3000);
        editProfilePage.scrollDown();
        editProfilePage.Click_EditProfile();
        test.log(Status.INFO, "Click Edit Profile Option");
        Thread.sleep(3000);
        editProfilePage.Click_DOBOption();
        test.log(Status.INFO, "Click Date Of Birth Option");
        System.out.println("DOB changed Successful");
        Thread.sleep(3000);
        editProfilePage.Click_Save();
        test.log(Status.INFO, "Click Save Option");
        System.out.println("edit Successful");
    }
}
