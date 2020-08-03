package com.testinium.test.Page;

import org.openqa.selenium.WebDriver;

public class ProductBuyPage extends BasketPage {
    public ProductBuyPage(WebDriver driver) {
        super (driver);
    }


    public ProductPage buyProduct(String name, String phone,String adress, String myphone) throws InterruptedException {
 driver.get ("https://www.ciceksepeti.com/teslimat-adresi");
           setId ("GroupDeliveryAddressList_0__Address_AddressName",name);
        setId ("GroupDeliveryAddressList_0__Address_Phone_Phone",phone);
        setId ("GroupDeliveryAddressList_0__Address_AddressLine",adress);
        clickClassName ("order-next-button__text");

        clickClassName ("order-next-button--before-summary");

        setId ("PhoneNumber",myphone);
        clickClassName ("order-next-button__text");

        clickClassName ("order-next-button__text");
        clickClassName ("order-next-button js-submit-form");


       return new ProductPage (driver);
    }
}
