import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GiftScreen {
    //click on radio button [מתנה עבורי]
    public static void mySalfe (WebDriver driver) {
        driver.findElement(Constants.forMysalfe).click();
    }
    //click on radio button [מתנה עבור חבר]
    public static void forSomeOne (WebDriver driver) {
        driver.findElement(Constants.forSameOne).click();
    }
    //double check the radio button
    public static void GiftForSomeOne (WebDriver driver){
        mySalfe(driver);
        forSomeOne(driver);
    }
    //select the name of friend for gift

    public static void Name (WebDriver driver)    {
        driver.findElement(Constants.FriendName).sendKeys("Leon");

    }
    //send name of buyer the gift
       public static void BuyerName (WebDriver driver){
        driver.findElement(Constants.FromWho).sendKeys("Anton");

    }
    //open event catagory dropdown menu
    private static WebElement WhatEvent = null;
    public static WebElement SelectEventTab (WebDriver driver) {
        WhatEvent = driver.findElement(Constants.EventBox);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WhatEvent.click();
        return WhatEvent;
    }
    //choose event catagory
    private static WebElement ChooseEvent = null;
    public static WebElement SelectEvent (WebDriver driver){
        List<WebElement> EventList = driver.findElements(Constants.ChooseTheEvent);
        EventList.get(1).click();
        return ChooseEvent;
    }
    //add picture for the gift
        public  static void Picture (WebDriver driver){
        driver.findElement(Constants.UploadPicture).sendKeys("C:\\Users\\Yosef\\Documents\\image_fof_gift.png");
    }
    //time to send gift to friend
        public static void ChooseTimeToSend (WebDriver driver){
    driver.findElement(Constants.AfterPayment).click();

  }
  //choose send gift to friend by e-mail
        public static void SendByEmail (WebDriver driver){
        driver.findElement(Constants.SendEmail).click();
           }
    //inter friend email address
        public static void FriendsEmail (WebDriver driver){
        driver.findElement(Constants.EmailAddress).sendKeys("Leon@gaga.com");
                    }
    //save the friends e-mail
        public static void SaveEmail (WebDriver driver){
        driver.findElement(Constants.SaveEmail).click();
            }
    // pay  the gift
        public static void PayButton (WebDriver driver){
       driver.findElement(Constants.PayButton).click();
          }
}
