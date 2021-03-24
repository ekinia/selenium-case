package com.trendyol.bootcamp;

import com.trendyol.bootcamp.pages.HomePage;
import com.trendyol.bootcamp.pages.MailGenerator;
import com.trendyol.bootcamp.pages.SignPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;




public class CaseStudyTest extends BaseTest{
    @Test
    public void shouldSignandShop() throws InterruptedException {
        //create a mail generator class to get an email
        MailGenerator mailGenerator = new MailGenerator(webDriver);

        //call mail generator function and storing it
        String memberMail = mailGenerator.getTempMail();

        //Now we are going back to Trendyol
        SignPage signPage = new SignPage(webDriver, true);
        signPage.navigatetoAddress("www.trendyol.com/uyelik");

        //random pass
        String pass = "1234abcd";

        signPage.SignMember(memberMail,pass);

        HomePage homePage = signPage.goHome();

        Thread.sleep(5000);

        homePage.goTVGoruntu();
        //assertion would be great to check if I get correct








    }
}
