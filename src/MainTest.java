import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class MainTest {
    private static WebDriver driver;
    //create the report object
    private static ExtentReports extent = new ExtentReports();
    private static ExtentTest test ;
    private static ExtentHtmlReporter htmlReport;


    @BeforeClass
    public static void runBefore () throws Exception {
        String browserType = LoadXml.getData ("Browser");
        if(browserType.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yosef\\Documents\\chromedriver_win32\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start--incognito");
            driver = new ChromeDriver(options);
        }else if(browserType.equals("FireFox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yosef\\Documents\\FirefoxDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(LoadXml.getData("URL"));
        //log information into the report
        htmlReport = new ExtentHtmlReporter("C:\\Users\\Yosef\\Desktop\\extent.html");
        extent.attachReporter(htmlReport);
        extent.setSystemInfo("Environment", "Production");
        test = extent.createTest("MyTest","Sample description");
        test.log(Status.INFO,"before test method");
    }

   @Test
    public void Test01(){

       test.log(Status.INFO,"connecting driver");
        HomeScreen.pressLogin(driver);
        Registration.newReg(driver);
        Registration.setName(driver);
        Registration.setEmail(driver);
        Registration.setPass(driver);
        Registration.passValid(driver);
        Registration.iAgree(driver);
        Registration.submitReg(driver);
  }
    @Test
    public void Test02() {
        test.log(Status.INFO,"connecting driver");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        HomeScreen.ChooseAmount(driver);
        HomeScreen.MyAmount(driver);
        HomeScreen.ChooseArea(driver);
        HomeScreen.MyArea(driver);
        HomeScreen.ChooseCatagory(driver);
        HomeScreen.MyCatagory(driver);
        HomeScreen.findGift(driver);
        HomeScreen.chooseGiftCompany(driver);
        HomeScreen.GiftEnter(driver);
    }
        @Test
        public void Test03(){
           test.log(Status.INFO,"connecting driver");

        GiftScreen.GiftForSomeOne(driver);
        GiftScreen.Name(driver);
        GiftScreen.BuyerName(driver);
        GiftScreen.SelectEventTab(driver);
        GiftScreen.SelectEvent(driver);
        GiftScreen.Picture(driver);
        GiftScreen.ChooseTimeToSend(driver);
        GiftScreen.SendByEmail(driver);
        GiftScreen.FriendsEmail(driver);
        GiftScreen.SaveEmail(driver);
        GiftScreen.PayButton(driver);
    }

    @AfterClass
    public static void afterAll() {

      //  driver.quit();
    }
}
