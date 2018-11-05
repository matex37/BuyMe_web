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
    //private static WebElement NameOfFriend = null;
    public static void Name (WebDriver driver)    {
        driver.findElement(Constants.FriendName).sendKeys("Leon");

    }
    //send name of buyer the gift
   // private  static WebElement FromWho = null;
    public static void BuyerName (WebDriver driver){
        driver.findElement(Constants.FromWho).sendKeys("Anton");

    }
    //open event catagory dropdown menu
    private static WebElement WhatEvent = null;
    public static WebElement SelectEventTab (WebDriver driver) {
        WhatEvent = driver.findElement(Constants.EventBox);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
    //add picture to the gift
    private static WebElement AddPicture =null;
    public  static void Picture (WebDriver driver){
        driver.findElement(Constants.UploadPicture).sendKeys("C:\\Users\\Yosef\\Documents\\image_fof_gift.png");
    }
    //time to send gift to friend
    private static WebElement TimeToSend = null;
    public static WebElement ChooseTimeToSend (WebDriver driver){
    TimeToSend=driver.findElement(Constants.AfterPayment);
    TimeToSend.click();
    return  TimeToSend;
  }
  //choose send gift to friend by e-mail
    private static WebElement Email= null;
    public static WebElement SendByEmail (WebDriver driver){
        Email=driver.findElement(Constants.SendEmail);
        Email.click();
        return Email;
    }
    //inter friend email address
    private static  WebElement EmailAddress = null;
    public static WebElement FriendsEmail (WebDriver driver){
        EmailAddress= driver.findElement(Constants.EmailAddress);
        EmailAddress.sendKeys("Leon@gaga.com");
        return EmailAddress;
            }
    //save the friends e-mail
    private static WebElement SaveTheEmail = null;
    public static WebElement SaveEmail (WebDriver driver){
        SaveTheEmail= driver.findElement(Constants.SaveEmail);

        SaveTheEmail.click();
        return SaveTheEmail;
    }
    //to pay the gift
    private static  WebElement Pay = null;
    public static WebElement PayButton (WebDriver driver){
        Pay=driver.findElement(Constants.PayButton);
        Pay.click();
        return Pay;
    }
}
