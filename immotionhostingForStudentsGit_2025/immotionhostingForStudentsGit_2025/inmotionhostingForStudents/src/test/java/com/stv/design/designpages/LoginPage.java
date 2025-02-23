package com.stv.design.designpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends Page {
    private final By HelpLink = By.cssSelector(".amp-icon-newtab");

    public boolean isClickNeedHelpLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement needHelpLink = wait.until(ExpectedConditions.visibilityOfElementLocated(HelpLink));
        return needHelpLink.isDisplayed();

    }
}

