package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CaptchaPage {
    private WebDriver driver;
    private By captchaChallenge = By.id("recaptcha-token");

    public CaptchaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSelectAllImagesText(){
        return driver.findElement(captchaChallenge).getText();
    }
}
