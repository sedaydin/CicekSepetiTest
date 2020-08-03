package com.testinium.test.Page;

import com.testinium.test.base.BasePage;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super (driver);
    }
    public ProductPage selectProductByIndex(int index) throws InterruptedException {

         getElementsByClass ("js-category-item-hover").get(index).click();
        //    getElementsByCssSelector ("div.products__item-inner").get(index).click ();

       return new ProductPage (driver);
    }

    public ProductPage sepet(String name) throws InterruptedException {

        setClassName ("js-html-tag-replace",name);
        clickXpath ("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[4]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]");
       // clickClassName ("js-same-day-courier-label");
        clickXpath ("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[4]/div[2]/div[5]/div[2]");
        clickClassName ("select-green");

        clickClassName ("product__action-col");

        return new ProductPage (driver);

    }


    public ProductPage odemeyap(){

        clickClassName ("orders__item-pay");
        return new ProductPage (driver);
    }
    public ProductPage searchProduct(String name){
        setClassName ("js-product-search-input", name);
        clickClassName ("product-search__button");
        return new ProductPage (driver);
    }

    public ProductPage fav(){
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException ie){
        }
        clickClassName ("js-favorite-add");
        return new ProductPage (driver);
    }
 public ProductPage üyeolmadan(){
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException ie){
        }
     clickClassName ("js-create-overlay ");
        return new ProductPage (driver);
    }
    public ProductPage nextlogin( String password) throws InterruptedException {


        setId ("Password",password);
        clickClassName ("js-checkout-login-submit");
        Thread.sleep (1000);
        return new ProductPage (driver);


    }

}