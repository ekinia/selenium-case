package com.trendyol.bootcamp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HomePage extends BasePage {


    private By elektronikTab = By.cssSelector("a[href='/butik/liste/elektronik']");
    private By tvGoruntu = By.cssSelector("a[href='/tv-goruntu-ses-sistemleri-x-c104035']");
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    public void goTVGoruntu(){
        waitElement(elektronikTab);

        Actions builder = new Actions(webDriver);
        WebElement element = webDriver.findElement(elektronikTab);
        builder.moveToElement(element).build().perform();

        click(tvGoruntu,1);

    }



}
