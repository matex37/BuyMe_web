import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class MainTest {
    private static WebDriver driver;
 
    @BeforeClass
    public static void beforeMyTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yosef\\Documents\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.get("https://buyme.co.il");
    }
    @Test
    public void Test01(){
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

    //    driver.quit();
    }
}
