package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay
 */
public class HomePage extends Util {

    @FindBy(linkText ="Register")
    WebElement _registerLink;

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    public void clickOnRegisterLink(){
        clickOnElement(_registerLink);
    }

    public void clickOnLoginLink(){
        clickOnElement(_loginLink);
    }

}
