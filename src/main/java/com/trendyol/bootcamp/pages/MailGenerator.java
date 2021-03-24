package com.trendyol.bootcamp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailGenerator extends BasePage{
    private By tempMail = By.id("fe_text");
    public MailGenerator(WebDriver webDriver) {
        super(webDriver);
        webDriver.get("https://10minutemail.net/?lang=tr");
    }
    public String getTempMail(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(tempMail)).getAttribute("value");
    }

}
