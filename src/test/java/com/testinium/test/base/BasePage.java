package com.testinium.test.base;

import com.testinium.test.Page.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
;import static org.openqa.selenium.By.*;

public class BasePage {
   public WebDriver driver;
   public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public ProductPage adres(String name){

        return new ProductPage (driver);

    }


    public LoginPage calllogin() throws InterruptedException {

        return new LoginPage (driver);

    }

    public ProductPage search(String name) throws InterruptedException {
        setClassName ("js-product-search-input", name);
        clickClassName ("product-search__button");


      return new ProductPage (driver);
    }
    public ProductPage nextLogin(String email) throws InterruptedException {
        setClassName ("js-order-login-email-check",email);
        clickClassName ("js-register-email-check");
      return new ProductPage (driver);
    }



    public HomePage callHomePage(){

        return new HomePage(driver);
    }

    public SingInPage üyelik(){

        return new SingInPage(driver);
    }


    public ProductBuyPage buy() throws InterruptedException {


        return new ProductBuyPage(driver);
    }
    public FavoritePage goFavPage(){

        return new FavoritePage(driver);
    }



    public BasketPage gotoBasket(){
        clickClassName ("user-menu__item--shopping-cart");
        return new BasketPage (driver);
    }


     public AccountPage account(){
         clickClassName ("user-menu__item--account");
        return new AccountPage(driver);
       }



    public ProductBuyPage buyProducts() throws InterruptedException {
        clickClassName ("js-submit-basket");

        return new ProductBuyPage(driver);
    }
    public void log_out() throws InterruptedException {
        clickClassName ("user-menu__log-out-icon");
    }

    public ProductPage listele(String name) throws InterruptedException {
        List<WebElement> listElement = driver.findElements(By.className(name));
        for(int i =0;i<listElement.size();i++) {
            String elementText = listElement.get(i).getText();
            System.out.println(elementText);
        }

        // Wait until page load
       return new ProductPage (driver);
    }


    public void dropdown(String name, int index){
    WebElement testDropDown = driver.findElement(By.className(name));
    Select dropdown = new Select(testDropDown);
    dropdown.selectByIndex(index);
    }
    public ProductPage directAdd() throws InterruptedException {
        clickClassName ("js-add-to-cart");

        return  new ProductPage (driver);
    }




    public void setId(String id,String value){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (By.id (id)));
        element.clear ();
        element.sendKeys (value);

    } public void setClassName(String name,String value){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (className (name)));
        element.clear ();
        element.sendKeys (value);

    } public void setXpath(String name,String value){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (xpath (name)));
        element.clear ();
        element.sendKeys (value);

    }
       public void setCssSelector(String name,String value){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (xpath (name)));
        element.clear ();
        element.sendKeys (value);

    }
    public void setByXpath(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(id)));
        element.clear();
        element.sendKeys(value);
    }

    public void clickId(String id){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (By.id (id)));

        element.click ();

    }

    public void clickCssSelector(String id){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (By.cssSelector (id)));

        element.click ();

    }
     public void clickClassName(String name){
        WebElement element=new WebDriverWait (driver,50).until (ExpectedConditions.visibilityOfElementLocated (className (name)));

        element.click ();



      }public void clickXpath(String xpath){
        WebElement element=new WebDriverWait (driver,30).until (ExpectedConditions.visibilityOfElementLocated (By.xpath (xpath)));

        element.click ();



      }
    public List<WebElement> getElementsByXpath(String s) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[contains(@class, 'products__item-inner'] "))));
    }

    public List<WebElement> getElementsByClass(String s ) {
        return new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(className ("products__item-inner"))));
    }
    public List<WebElement> getElementsByCssSelector(String s ) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(cssSelector ("div.products__item-inner"))));
    }

}
