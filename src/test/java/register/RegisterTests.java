package register;

import base.BaseTests;
import pages.CaptchaPage;
import pages.RegisterPage;

public class RegisterTests extends BaseTests {

    public void testLoginErrors(){
        RegisterPage registerPage = homePage.clickRegister();
        CaptchaPage captchaPage = registerPage.clickRegisterButton();
        registerPage.setTitleField("Mr");


    }
}
