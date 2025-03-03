package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginFactoryPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

import static com.stv.framework.core.utils.Waiters.waitForElementVisible;


public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    @Test (description = "Assert the main page is loaded and main logo is visible")
    public void assertMainLogoIsDisplayed() {
        boolean actualResult = mainFactoryPage.isMainLogoDisplayed();
        Assert.assertEquals(actualResult, true, "Main Logo isn't visible");
    }

    @Test (description = "Assert the Navigation panel is loaded", dependsOnMethods = "assertMainLogoIsDisplayed")
    public void assertAdminPanelOpened() {
        waitForElementVisible(getDriver(), Duration.ofSeconds(2), mainFactoryPage.getNavigationPanel());
        Assert.assertEquals(mainFactoryPage.isNavigationPanelDisplayed(), true, "Admin panel isn't visible");
    }

    @Test(description = "Navigate to the login page and assert the needHelpLink link is visible")
    public void navigateToLoginPage() {
        LoginFactoryPage loginFactoryPage = mainFactoryPage.clickLogin(); // Переход на страницу логина
        Assert.assertTrue(loginFactoryPage.isClickNeedHelpLinkDisplayed(), "The login page isn't loaded properly");
    }
}