package com.epam.moby.testng.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AccessPage extends BasePage {

    @AndroidFindBy(id = "zocial-epam.com")
    private MobileElement singWithEpamButton;

    public LoginPage clickSingWithEpamButton() {
        singWithEpamButton.click();
        return new LoginPage();
    }
}
