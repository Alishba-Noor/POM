package Tests;

import Base.Drivers;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class RegisterTest extends Drivers {
    @Test(priority = 1)
    public void Register() throws InterruptedException {
        test = extent.createTest(" Register Test","Register Test");
        Register_OnwardPage.Click_Register();
        test.log(Status.INFO,"Click Register");
        Register_OnwardPage.Click_Onward_Connection();
        test.log(Status.INFO,"Click Onward Button");
        Thread.sleep(2000);
        Register_OnwardPage.scrollDown();
        Register_OnwardPage.Click_Choose_plan();
        test.log(Status.INFO,"Choose plan");
        Register_OnwardPage.scrollDown();
        Register_OnwardPage.Click_ContinueButton1();
        test.log(Status.INFO,"Click Continue");
        Thread.sleep(2000);
        Register_OnwardPage.Click_PhoneLockNo_btn();
        test.log(Status.INFO,"Click Phone lock NO Button");
        Register_OnwardPage.Send_IMEI_NumberField();
        test.log(Status.INFO,"Send IMEI");
        Register_OnwardPage.Click_IMEINumber_Ok();
        test.log(Status.INFO,"Click IMEI OK Button");
        Register_OnwardPage.scrollDown();
        Register_OnwardPage.Click_BringOwnNumberNo_btn();
        test.log(Status.INFO,"Click Bring own Number Button");
        Register_OnwardPage.scrollDown();
        Register_OnwardPage.Click_ContinueButton2();
        test.log(Status.INFO,"Click Continue");
        Thread.sleep(1000);
        Register_OnwardPage.Send_firstname();
        test.log(Status.INFO," First name");
        Register_OnwardPage.Send_lastname();
        test.log(Status.INFO,"lastname");
        Register_OnwardPage.Send_email();
        test.log(Status.INFO," email");
        Register_OnwardPage.Send_address1();
        test.log(Status.INFO,"Address 1");
        Register_OnwardPage.scrollDown();
        Register_OnwardPage.Send_address2();
        test.log(Status.INFO,"Address 2");
        Register_OnwardPage.Send_city();
        test.log(Status.INFO," City");
        Register_OnwardPage.Click_state();
        test.log(Status.INFO,"Select State");
        Register_OnwardPage.Click_state_DropDown();
        test.log(Status.INFO,"Click State Dropdown Button");
        Register_OnwardPage.Send_Zip_Code();
        test.log(Status.INFO," Zip code");
        Register_OnwardPage.scrollDown();
        Register_OnwardPage.Send_Service_address1();
        test.log(Status.INFO,"Address 1");
        Register_OnwardPage.Send_Service_address2();
        test.log(Status.INFO,"Address 2");
        Register_OnwardPage.Send_Service_city();
        test.log(Status.INFO," City");
        Register_OnwardPage.Click_Service_state();
        test.log(Status.INFO,"Select State");
        Register_OnwardPage.Click_Service_state_DropDown();
        test.log(Status.INFO,"Click State Dropdown Button");
        Register_OnwardPage.Send_Service_Zip_Code();
        test.log(Status.INFO," Zip code");
        Register_OnwardPage.Click_ContineButton3();
        test.log(Status.INFO,"Click Continue Button");
        Thread.sleep(2000);
        Register_OnwardPage.Click_Proceed_Button();
        test.log(Status.INFO,"Click Proceed Payment Button");
        Thread.sleep(200000);
        Register_OnwardPage.Click_View_recipt();
        test.log(Status.INFO,"View Recipt");
        Thread.sleep(3000);
    }
}
