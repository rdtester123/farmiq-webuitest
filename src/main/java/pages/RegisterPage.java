package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;
    private By titleField = By.id("title");
    private By firstNameField = By.id("first_name");
    private By lastNameField = By.id("last_name");
    private By emailField = By.id("email");
    private By phoneField = By.id("phone");
    private By mobileField = By.id("mobile");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("passconf");
    private By termsTickBox = By.id("terms");
    private By mailingTickBox = By.id("mailing");
    private By registerButton = By.id("register_submit");

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }
    public void setTitleField(String title){
        driver.findElement(titleField).sendKeys(title);
    }
    public void setFirstNameField(String firstname){
        driver.findElement(firstNameField).sendKeys(firstname);
    }
    public void setLastNameField(String lastname){
        driver.findElement(lastNameField).sendKeys(lastname);
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPhoneField(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }
    public void setMobileField(String mobile){
        driver.findElement(mobileField).sendKeys(mobile);
    }
    public void setPasswordFieldField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setConfirmPasswordField(String confirmPassword){
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void setTermsTickBox(String terms){
        driver.findElement(termsTickBox).sendKeys(terms);
    }

    public void setMailingTickBox(String mailing){
        driver.findElement(mailingTickBox).sendKeys(mailing);
    }

    public CaptchaPage clickRegisterButton(){
        driver.findElement(registerButton).click();
        return new CaptchaPage(driver);
    }

}
