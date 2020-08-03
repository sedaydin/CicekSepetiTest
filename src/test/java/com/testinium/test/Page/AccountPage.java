package com.testinium.test.Page;

import org.openqa.selenium.WebDriver;

public class AccountPage extends BasketPage {

    public AccountPage(WebDriver driver) {
        super (driver);
    }


    public AccountPage bilgilerim(String name,String adress) throws InterruptedException {


        clickClassName ("icon-user");
        setId ("Name", name);
        Thread.sleep (2000);
        setId ("address", adress);
        clickClassName ("js-update-account-info");
        clickClassName ("user-menu__log-out-icon");
        Thread.sleep (4000);
        return new AccountPage (driver);
    }

    public AccountPage remember(String name,String phone) throws InterruptedException {


        clickClassName ("icon-event");

        clickClassName ("saved__item-add-new");

        setId ("name", name);

    //    clickId ("ReminderType");
      //  clickXpath ("/html/body/main/div/div/div[2]/div/form/div[4]/div/div[1]/div");
        Thread.sleep(1000);

        clickId ("DateString");
        clickXpath ("/html/body/div[8]/div[1]/table/tbody/tr[3]/td[7]");
        setId ("phone", phone);

        clickClassName ("reminder__btn-wrapper");

        return new AccountPage (driver);
    }
}
