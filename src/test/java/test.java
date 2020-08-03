import com.testinium.test.Page.HomePage;
import com.testinium.test.Page.ProductBuyPage;
import com.testinium.test.base.BaseTest;
import org.junit.Test;

public class test extends BaseTest {
    @Test
    public void Test4() throws InterruptedException {
        new HomePage (driver)
                .search ("pembe gül")
                .selectProductByIndex (1)
                .sepet ("beşiktaş");

    }
    @Test
    public void Test2() throws InterruptedException {
        new HomePage (driver)
                .calllogin ()
                .login ("seda.adin@testinium.com","123456.S")
                .buy ()
            .buyProduct ("Seda Aydın","5066947044","Beşiktaş iskele","6565757657657")
        .log_out ();
    }
}

