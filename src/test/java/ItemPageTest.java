import com.walmart.page.ProductItemPage;
import org.fluentlenium.adapter.testng.FluentTestNg;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ItemPageTest extends FluentTestNg {

    @Page
    private ProductItemPage productItemPage;

    @Test(priority = 0)
    public void testCase1(){
        productItemPage.go("6000197045450");
        productItemPage.ClickOnAddToCartButton();
        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        productItemPage.confirmationPopup().continueShopping();
    }


    @Test(priority = 2)
    public void testCase2(){
        productItemPage.doSomething("4");
        productItemPage.ClickOnAddToCartButton();
        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public WebDriver newWebDriver() {
        return new ChromeDriver();
    }

}
