package com.testinium.test.Page;

import com.testinium.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super (driver);
    }

 public BasketPage basket(){
     clickClassName ("user-menu__item--shopping-cart");
     return  new BasketPage (driver);
 }

 public BasketPage deleteProduct() throws InterruptedException {
     clickClassName ("js-main-product-delete--basket");
     clickClassName ("agree-button");
     Thread.sleep (4000);
     return  new BasketPage (driver);
 }


}
