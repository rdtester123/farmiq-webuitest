package register;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CaptchaPage;
import pages.RegisterPage;

public class RegisterTests extends BaseTests {

    @Test
    public void testLoginErrors(){
        RegisterPage registerPage = homePage.clickRegister();
        registerPage.setTitleField("Mr");
        registerPage.setFirstNameField("First");
        registerPage.setLastNameField("Lastname");
        registerPage.setEmailField("email@mail.com");
        registerPage.setPhoneField("1234567");
        registerPage.setMobileField("7654321");
        registerPage.setPasswordFieldField("secret1234");
        registerPage.setConfirmPasswordField("blah");
        // add more step to clear all characters in textfields
        // add assertion here to verify that the error messages are displayed
        CaptchaPage captchaPage = registerPage.clickRegisterButton();
    }
}
