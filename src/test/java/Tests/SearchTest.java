/*
package Tests;

import Base.Drivers;
import Pages.SearchPage;
import com.aventstack.extentreports.Status;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest extends Drivers {

    private SearchPage searchPage;

    @BeforeClass
    public void setupPages() {
        searchPage = new SearchPage(wd);
    }

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
    public void Search_Test() throws InterruptedException {
        test = extent.createTest("SC Portal Search test", "SC Portal Search Numbers Test");
        Thread.sleep(2000);
        searchPage.Click_SearchOption();
        searchPage.Search_Info();
        test.log(Status.INFO, "Search Info Option");
        Thread.sleep(3000);
        searchPage.Click_SearchOption();
        test.log(Status.INFO, "Click Search Button");
        Thread.sleep(3000);
        searchPage.Search_Subscriptions();
        test.log(Status.INFO, "Search Subscriptions Option");
        Thread.sleep(3000);
        searchPage.Click_SearchButton();
        test.log(Status.INFO, "Click Search Button");
        Thread.sleep(3000);
        searchPage.Search_Plans();
        test.log(Status.INFO, "Search Plans Option");
        Thread.sleep(3000);
        searchPage.Click_SearchButton();
        test.log(Status.INFO, "Click Search Button");
        Thread.sleep(3000);
        searchPage.Search_Dashboard();
        test.log(Status.INFO, "Search Dashboard Option");
        Thread.sleep(3000);
        searchPage.Click_SearchButton();
        test.log(Status.INFO, "Click Search Button");
        Thread.sleep(3000);
        System.out.println("Search Succesful");
    }
}
*/
