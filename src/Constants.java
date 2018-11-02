import org.openqa.selenium.By;

public class Constants {

    // A. login
    public static final By LogInLocator = (By.className("seperator-link"));
    public static final By NewRegister =(By.xpath("//*[@id=\"auth-modal\"]/div/span/strong"));

    //new user registration
    public static final By registration = By.className("header-link");
    public static final By name = By.id("ember890");
    public static final By email = By.id("ember891");
    public static final By pass = By.id("valPass");
    public static final By passvalid = By.id("ember893");
    public static final By Iagree = By.xpath("//label[@for='register-consent']");
    public static final By submitReg = By.xpath("//*[@id=\"ember889\"]/button");

    //B.home screen
    public static final By FindGiftLocator =(By.id("ember664"));//תמצאו לי מתנה
    public static final By AmountBox = (By.xpath("//span[.='סכום']")); //בחירת רשימה של סכומים
    public static final By ChooseAmonut = (By.className("active-result"));// בחירת סכום מתנה
    public static final By AreaBox =(By.xpath("//*[@id=\"ember620_chosen\"]/a/span"));// בחירת רשימת אזור
    public static final By ChooseArea = (By.className("active-result")); //בחירת אזור
    public static final By CatagoryBox =(By.xpath("//*[@id=\"ember629_chosen\"]/a/span"));//בחירת רשימת סוגי מתנןת
    public static final By ChooseCatagory =(By.className("active-result"));//בחירת סוג מתנה

    //C.giftscreen
    public static final By ChooseGiftCompany = By.partialLinkText("BUYME BRUNCH - שובר משולב לארוחות בוקר");
    public static final By ChooseGiftParam = By.partialLinkText("ארוחת בוקר זוגית מפנקת לבחירה");
    public static final By forSameOne = By.xpath("//label[@data='forSomeone']");
    public static final By forMysalfe = By.xpath("//label[@data='forMyself']");
    public static final By FriendName =(By.xpath("//input[@data-parsley-required-message='מי הזוכה המאושר? יש להשלים את שם המקבל/ת']"));
    public static final By FromWho = (By.xpath("//input[@data-parsley-required-message='למי יגידו תודה? שכחת למלא את השם שלך']"));
    public static final By EventBox =(By.xpath("//span[.='לאיזה אירוע?']")) ;
    public static final By ChooseTheEvent = (By.className("active-result"));
    public static final By UploadPicture = (By.name("fileUpload"));
    public static final By AfterPayment =(By.xpath("//label[.='מיד אחרי התשלום']")) ;
    public static final By SendEmail =(By.xpath("//span[.='במייל']"));
    public static final By EmailAddress =(By.xpath("//input[@type='email']"));
    public static final By SaveEmail =(By.xpath("//button[.='שמירה']"));
    public static final By PayButton =(By.xpath("//button[@data-toggle='modal']"));

}