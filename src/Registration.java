import org.openqa.selenium.WebDriver;

public class Registration {
//all functions for new user registration
//new registration button
    public static void newReg(WebDriver driver) {
        driver.findElement(Constants.NewRegister).click();
    }
    //set new name for registration
    public static void setName (WebDriver driver) {
        driver.findElement(Constants.name).sendKeys("test");
    }
    //set email registration
    public static void setEmail (WebDriver driver) {
      driver.findElement (Constants.email).sendKeys("antontest73@ffgg.cdgf");
          }
    //set password
    public static void setPass (WebDriver driver) {
     driver.findElement (Constants.pass).sendKeys("Ab123456");
         }
    //submit password
    public static void passValid (WebDriver driver) {
        driver.findElement (Constants.passvalid).sendKeys("Ab123456");
           }
    //click on iAgree checkbox
    public static void iAgree (WebDriver driver) {
        driver.findElement(Constants.Iagree).click();
            }
    //submit registration
    public static void submitReg (WebDriver driver) {
        driver.findElement(Constants.submitReg).click();
            }

}