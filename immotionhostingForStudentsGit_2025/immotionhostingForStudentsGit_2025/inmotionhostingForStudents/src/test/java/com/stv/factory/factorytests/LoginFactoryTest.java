package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginFactoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFactoryTest extends BasicFactoryTest {

    @Test(description = "Assert all elements on the login page are displayed")
    public void assertLoginPageElementsAreDisplayed() {
        LoginFactoryPage loginFactoryPage = new LoginFactoryPage();
        Assert.assertTrue(loginFactoryPage.isEmailFieldDisplayed(), "The email field isn't displayed");
        Assert.assertTrue(loginFactoryPage.isPasswordFieldDisplayed(), "The password field isn't displayed");
        Assert.assertTrue(loginFactoryPage.isForgotPasswordLinkDisplayed(), "The Forgot Password link isn't displayed");
        Assert.assertTrue(loginFactoryPage.isLoginButtonDisplayed(), "The login button isn't displayed");
        Assert.assertTrue(loginFactoryPage.isClickNeedHelpLinkDisplayed(), "The Need Help link isn't displayed");
    }
}