package com.testinium.test.Page;

import com.testinium.test.base.BasePage;
import org.openqa.selenium.WebDriver;

public class FavoritePage extends BasePage {
    public FavoritePage(WebDriver driver) {
        super (driver);
    }

    public FavoritePage favoritePage(){
        clickClassName ("user-menu__link--favorite");
        return new FavoritePage (driver);
    }
}
