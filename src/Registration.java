import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {

private static WebElement RegButton =null;
    public static WebElement newReg(WebDriver driver) {
        RegButton=driver.findElement(Constants.NewRegister);
        RegButton.click();
        return RegButton;
    }
    private static WebElement EnterName =null;
    public static WebElement setName (WebDriver driver) {
        EnterName=driver.findElement(Constants.name);
        EnterName.sendKeys("test");
        return EnterName;
    }
    private static  WebElement EnterMail=null;
    public static WebElement setEmail (WebDriver driver) {
      EnterMail=driver.findElement (Constants.email);
      EnterMail.sendKeys("antontest70@ffgg.cdgf");
      return EnterMail;
    }
    private static WebElement EnterPass=null;
    public static WebElement setPass (WebDriver driver) {
     EnterPass=driver.findElement (Constants.pass);
     EnterPass.sendKeys("Ab123456");
     return EnterPass;
    }
    private static WebElement ValidPass=null;
    public static WebElement passValid (WebDriver driver) {
        ValidPass=driver.findElement (Constants.passvalid);
        ValidPass.sendKeys("Ab123456");
        return ValidPass;
    }
    private static WebElement Regulation = null;
    public static WebElement iAgree (WebDriver driver) {
        Regulation=driver.findElement(Constants.Iagree);
        Regulation.click();
        return Regulation;
    }
    private static WebElement Registration = null;
    public static WebElement submitReg (WebDriver driver) {
        Registration=driver.findElement(Constants.submitReg);
        Registration.click();
        return Registration;
    }

}