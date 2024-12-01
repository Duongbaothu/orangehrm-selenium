package pageObjects.PIMPageObjects;

import commons.BaseElement;
import org.openqa.selenium.WebDriver;
import utilities.PropertiesConfig;

public class LoginPageObject extends BaseElement {
    private PropertiesConfig propertiesConfig;
    private WebDriver driver;

    public LoginPageObject(WebDriver driver, PropertiesConfig propertiesConfig) {
        super(driver);
        this.driver = driver;
        this.propertiesConfig = propertiesConfig;
    }

    public void loginToAdmin(){
        enterToTextboxByText("Username", propertiesConfig.getApplicationUserName());
        enterToTextboxByText("Password", propertiesConfig.getApplicationPassword());
        clickToButtonByText("Login");
    }
}
