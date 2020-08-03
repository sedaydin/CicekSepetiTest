package com.testinium.test.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingInPage extends BasketPage{
    public SingInPage(WebDriver driver) {
        super (driver);
    }


    public HomePage üyeol(String name,String email,String pass) throws InterruptedException {
        clickCssSelector ("a.user-process-toggle");
        clickCssSelector ("span.icon-register");
        setId ("NameIndivual",name);
        setId ("EmailIndivual",email);
        setId ("PasswordIndivual",pass);

      clickCssSelector ("label.required-label");
      clickClassName ("js-customer-contract-accept-button");
 clickClassName ("js-individual-register-button");

return new HomePage (driver);
    }
}
