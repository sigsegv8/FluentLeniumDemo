import org.fluentlenium.adapter.testng.FluentTestNg;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.upgrade.rewards.rewardscheckinglandingpage;

public class MyTest extends FluentTestNg {

    @Page
    public rewardscheckinglandingpage rewardscheckingpage;

    @Test(priority = 0)
    public void testCase1(){
        rewardscheckingpage.go();
        rewardscheckingpage.ClickOpenRewardsChecking();
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        rewardscheckingpage.inputData();
    }


    @Test(priority = 2)
    public void testCase2(){
    }

    @Override
    public WebDriver newWebDriver() {
    	System.setProperty("webdriver.chrome.driver", "C:/Users/tayda/chromedriver.exe"); // Set for ChromeDriver
        return new ChromeDriver();
    }

}
