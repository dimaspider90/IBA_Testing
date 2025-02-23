package com.stv.design.designtests;

import com.stv.design.designpages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BasicTest {

    @Test(description = "Assert the login page is loaded and the email field is visible")
    public void assertClickNeedHelpLinkDisplayed() {
        LoginPage loginPage = new LoginPage();
        Assert.assertEquals(loginPage.isClickNeedHelpLinkDisplayed(), true, "The email field isn't displayed");
    }
}