package com.testinium.test.Page;

import com.testinium.test.base.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super (driver);
    }

    public LoginPage login(String username , String password) throws InterruptedException {
        clickCssSelector ("a.user-process-toggle");
        clickCssSelector ("span.icon-login");
        setId ("EmailLogin",username);
        setId ("Password",password);
        clickXpath ("//button[text() = 'Giriş']");
Thread.sleep (4000);
        return new LoginPage (driver);


    }

}
