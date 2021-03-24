package com.trendyol.bootcamp.pages;

import com.trendyol.bootcamp.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class BasePage extends WebDriverHelper {

    String TrendyolAddress =  "www.trendyol.com";



    public BasePage(WebDriver webDriver) {
        super(webDriver);
    }

    //function for navigating after start
    public void navigatetoAddress(String address){
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.navigate().to("https://www.trendyol.com/uyelik");

    }
}
