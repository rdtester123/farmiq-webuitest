package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By registerLink = By.linkText("Register");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public RegisterPage clickRegister(){
        driver.findElement(registerLink).click();
        return new RegisterPage(driver);
    }
}
