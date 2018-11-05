import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeScreen {
    //function is press to login button

    public static void pressLogin(WebDriver driver) {
        driver.findElement(Constants.LogInLocator).click();

    }

    //function for open amount dropdown menu
    private static WebElement SelectAmount = null;

    public static WebElement ChooseAmount(WebDriver driver) {
        SelectAmount = driver.findElement(Constants.AmountBox);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SelectAmount.click();
        return SelectAmount;
    }

    //function for choose amount value
    private static WebElement Amount = null;

    public static WebElement MyAmount(WebDriver driver) {
        List<WebElement> AmountsList = driver.findElements(Constants.ChooseAmonut);
        AmountsList.get(2).click();
        return Amount;
    }

    //function for open area dropdown menu
    private static WebElement SelectArea = null;

    public static WebElement ChooseArea(WebDriver driver) {
        WebElement  SelectArea = driver.findElement(Constants.AreaBox);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SelectArea.click();
        return SelectArea;
    }

    //function for choose area
    private static WebElement Area = null;

    public static WebElement MyArea(WebDriver driver) {
        List<WebElement> AreaList = driver.findElements(Constants.ChooseArea);
        AreaList.get(1).click();
        return Area;
    }

    //function for open catagory dropdown menu
    private static WebElement SelectCatagory = null;

    public static WebElement ChooseCatagory(WebDriver driver) {
        SelectCatagory = driver.findElement(Constants.CatagoryBox);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SelectCatagory.click();
        return SelectCatagory;
    }

    //function for choose catagory
    private static WebElement Catagory = null;

    public static WebElement MyCatagory(WebDriver driver) {
        List<WebElement> CatagoryList = driver.findElements(Constants.ChooseCatagory);
        CatagoryList.get(3).click();
        return Catagory;
    }

    //function for find gift
        public static void findGift(WebDriver driver) {
       driver.findElement(Constants.FindGiftLocator).click();

    }
// function for choose  company
    private static WebElement GiftCard = null;

    public static WebElement chooseGiftCompany(WebDriver driver) {
        GiftCard = driver.findElement(Constants.ChooseGiftCompany);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        GiftCard.click();
                return GiftCard;
    }
    //function for submit choosed gift
    public static void GiftEnter (WebDriver driver){
        driver.findElement(Constants.ChooseGiftParam).click();

    }


}

