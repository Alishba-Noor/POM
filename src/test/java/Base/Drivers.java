package Base;

import Pages.*;
import Utility.CapMethods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
public class Drivers {
    public static WebDriver wd;
    protected static LoginPage LoginPage;
    protected static RegisterPage Register_OnwardPage;
    protected static ManageNumbersPage manageNumbersPage;
    protected  static InfoPage infoPage;
    protected static EditProfilePage editProfilePage;
    protected static SearchPage searchPage;
    protected  static ContactUsPage contactUsPage;
    protected static BlockUnblockPage blockUnblockPage;
    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
    public static ExtentTest test;
    public static CapMethods capMethods;
    @BeforeSuite
    public void reportSetUp() {
        // start reporters
        spark = new ExtentSparkReporter("Spark.html");
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        spark.config().setReportName("SelfCare Portal Automation Report"); // name of the report
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("SelfCare Portal Automation Report");
        spark.config().setEncoding("utf-8");
        extent.attachReporter(spark);
        extent.setSystemInfo("Application", "SelfCare Portal Automation");
        extent.setSystemInfo("Operating System", System.getProperty("os.name"));
        extent.setSystemInfo("User Name", System.getProperty("user.name"));
        extent.setSystemInfo("Java Version", System.getProperty("java.version"));
        extent.setSystemInfo("Execution Date", LocalDateTime.now().toString());
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User", "Arslan");
    }
    @BeforeTest
    public void drivers(){
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("headless");       // HeadLess browser
        wd = new ChromeDriver(chromeOptions);
        //wd.get("http://111.68.97.25:30019/login");   //Selfcare Portal  url
      //  wd.get("https://scportal.evampsaanga.com/auth");
        wd.get("https://selfcare-oncomms.optiva.dev/");
        wd.manage().window().maximize();
        LoginPage = new LoginPage(wd);
        Register_OnwardPage = new RegisterPage(wd);
        manageNumbersPage= new ManageNumbersPage(wd);
        infoPage =  new InfoPage(wd);
        editProfilePage = new EditProfilePage(wd);
        searchPage = new SearchPage(wd);
        contactUsPage = new ContactUsPage(wd);
        blockUnblockPage = new BlockUnblockPage(wd);

    }
    @AfterMethod
    public void takeFailureScreenShot(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            String imageFilename = result.getName();
            var getScreenShot = (TakesScreenshot) wd;
            File screenShot = getScreenShot.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenShot, new File("src/main/resources/ScreenShots/" + result.getName() + ".png"));
                String str = capMethods.getBase64Screenshot(imageFilename);
                //test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(String.valueOf(screenShot)).build());
                test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case FAILED", ExtentColor.RED));
                test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromBase64String(str).build());
            } catch (IOException e) {
                e.getStackTrace();
                e.getMessage();
            }
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));

        } else {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
    }
    @AfterTest
    public void reportTearDown() {
        extent.flush();

    }
}
