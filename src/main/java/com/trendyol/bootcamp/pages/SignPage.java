package com.trendyol.bootcamp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class SignPage extends BasePage{



    //locators
    private By emailBy = By.id("register-email");
    private By passwordBy = By.id("register-password-input");
    private By ConfirmButton = By.cssSelector("form > button");
//direct start is required for navigation
    public SignPage(WebDriver webDriver, boolean directStart) {
        super(webDriver);
        if(directStart)
            navigatetoAddress("https://www.trendyol.com/uyelik");
    }

    public void SignMember (String email, String testPass){
        sendKeys(emailBy, email);
        sendKeys(passwordBy,testPass);
        click(ConfirmButton,5 );

    }

    public HomePage goHome(){
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return new HomePage(webDriver);
    }

}
