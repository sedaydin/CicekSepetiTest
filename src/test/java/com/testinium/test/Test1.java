package com.testinium.test;

import com.testinium.test.Page.BasketPage;
import com.testinium.test.Page.HomePage;
import com.testinium.test.Page.LoginPage;
import com.testinium.test.Page.ProductPage;
import com.testinium.test.base.BasePage;
import com.testinium.test.base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.support.ui.ISelect;

public class Test1 extends BaseTest {

    @Test
    public  void Test1() throws InterruptedException {

//Siteye gir, giriş yap ,ürün arat, 1. ürünü seç,sepete ekle ve satın al
        new HomePage (driver)
                .calllogin ()
                .login ("seda.adin@testinium.com","123456.S")
                .search ("çiçek")
                .selectProductByIndex (0)
                .sepet ("beşiktaş")
                .buy ()
                .buyProduct ("Seda Aydın","5066947044","Beşiktaş iskele","48758497589759")
                .log_out ();

    }


    @Test
    public void Test2() throws InterruptedException {
        //Giriş yap Çiçek ara, 3. ürünü seç , favorilere ekle
        new HomePage (driver)
                .calllogin ()
                .login ("seda.adin@testinium.com","123456.S")
                .search ("çicek")
                .selectProductByIndex (2)
                .fav()
                .log_out ();
    }

    //giriş yap, Favorilerim sayfasına tıkla, sayfadaki favorilenen ögelerin ismini listele
    @Test
    public void Test3() throws InterruptedException {
        new HomePage (driver)
                .calllogin ()
                .login ("seda.adin@testinium.com","123456.S")
                .goFavPage ()
                .favoritePage ()
                .listele ("products__item-title")
                .log_out ();

    }

    //Siteye giriş yap, ürün ara, ilk ürünü seç,sepete ekle,giriş yap,ve satın al
    @Test
    public void Test4() throws InterruptedException {
        
        new HomePage (driver)
                .search ("çiçek")
                .selectProductByIndex (6)
                .sepet ("beşiktaş")
                .nextLogin ("seda.adin@testinium.com")
                .nextlogin ("123456.S")
                 .buy ()
        .buyProduct ("Seda Aydın","5066947044","Beşiktaş İskele","50669348468");

    }



//Üye ol, Giriş Yap, "Doğum günü hediyesi" arat, ürünleri listele, çıkış yap
    @Test
    public void Test5() throws InterruptedException {
        new HomePage (driver)
                .üyelik ()
                .üyeol ("Erdem erdi", "errxrcd@gmail.com","112233.S")
                .calllogin ()
                .login ("errxrcd@gmail.com","112233.S")
                .search ("doğum günü hediyesi")
                .listele ("products__item-title")
                .log_out ();
    }


    @Test
    public void Test6() throws InterruptedException {

        //Anasayfaya gir, oturum aç,hesaba tıkla,ismi ve adresi değiştir, çıkış yap
        new HomePage (driver)
                .calllogin ()
                .login ("seda.adin@testinium.com","123456.S")
                .account ()
                .bilgilerim ("Seda Aydınnnn","yeni Ev adresi");

    }



    @Test
    public  void Test7() throws InterruptedException {
//Giriş yap iki ürün seç ve satın al

        new HomePage (driver)
                .calllogin ()
                .login ("seda.adin@testinium.com","123456.S")
                .search ("kulaklık")
                .selectProductByIndex (1)
                .directAdd ()
                .search ("kulaklık")
                .selectProductByIndex (0)
                .directAdd ()
                .buyProducts ()
                .buyProduct ("Seda Aydın","5066947044","Beşiktaş İskele","50669348468");

    }

    //giriş yap hesbaıma tıkla Hatırlatma servisini aç Bi hatırlatma ekle ve çıkış yap.

    @Test
    public void Test8() throws InterruptedException {
        new HomePage (driver)
                .calllogin ()
                .login ("seda.adin@testinium.com","123456.S")
                .account ()
                .remember ("Kübra Güven","5050500505050")
                .log_out ();

    }
//ARANAN tüm üRÜNlerin İSMİNİ consola LİSTELE
    @Test
    public void Test9() throws InterruptedException {

        new HomePage (driver)
                .search ("çicekler")
                .listele ("products__item-title");

    }
    //sepete git ordaki ürün isimlerini ekrana yazdır ve bir ürün sil ve çıkış yap
    @Test
    public void Test10() throws InterruptedException {

        new HomePage (driver)
                .calllogin ()
                .login ("seda.adin@testinium.com","123456.S")
                .gotoBasket ()
                .basket ()
                .deleteProduct ()
                .log_out ();
    }
}
