package Tests;

import Base.Drivers;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class ContactUsTest extends Drivers {

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
        System.out.println("Login Succesful");
    }

    @Test(priority = 2)
    public void Contact_Us() throws InterruptedException {
        test = extent.createTest("Contact Us Test", "Contact Us Test");
        contactUsPage.Click_HelpButton();
        Thread.sleep(2000);;
        test.log(Status.INFO, "Click Help Button on Dashboard");
        contactUsPage.Click_FAQ();
        test.log(Status.INFO, "Click FAQs");
        contactUsPage.scrollToBottom();
        contactUsPage.scrollToTop();
        contactUsPage.Click_Complaint();
        test.log(Status.INFO, "Click Complaints");
        contactUsPage.scrollToBottom();
        contactUsPage.scrollToTop();
        contactUsPage.Click_Support();
        test.log(Status.INFO, "Click Support");
        contactUsPage.Click_CallUs();
        test.log(Status.INFO, "Click Call Us");
        contactUsPage.Click_EmailUs();
        test.log(Status.INFO, "Click Email Us");
        contactUsPage.Click_Address();
        test.log(Status.INFO, "Click Address");
        contactUsPage.scrollToBottom();
        contactUsPage.Click_Social();
        test.log(Status.INFO, "Click Social channels");
    }
}
