package com.testinium.test.Page;

import com.testinium.test.base.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super (driver);
        driver.get ("https://www.ciceksepeti.com/");
        clickClassName ("js-subheader-close");

    }
}
