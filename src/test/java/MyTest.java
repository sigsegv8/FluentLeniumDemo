import org.fluentlenium.adapter.testng.FluentTestNg;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.upgrade.rewards.rewardscheckinglandingpage;
import java.util.UUID;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

/**
 * For the UI design phase, use the following links to help you:
 *      https://fluentlenium.com/quickstart/
 *      https://fluentlenium.com/docs/key_features/#page-object-pattern-support
 *
 * For the API design phase, use the following links to help you:
 *      https://github.com/rest-assured/rest-assured/wiki/Usage
 */
public class MyTest extends FluentTestNg {

    @Page
    public rewardscheckinglandingpage rewardscheckingpage;

    @Test(priority = 0)
    public void testCase1() {
        rewardscheckingpage.go();
        await().explicitlyFor(10000);
        rewardscheckingpage.ClickOpenRewardsChecking();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rewardscheckingpage.inputData();
    }

    @Test
    public void test33() {
        Response res = given().contentType("application/json")
                .headers("x-cf-source-id", "coding-challenge", "x-cf-corr-id", "fcb24980-be6c-11eb-8529-0242ac130003", "Content-Type", "application/json").body("{\n"
                        + "\t\"loanAppUuid\": \"b8096ec7-2150-405f-84f5-ae99864b3e96\",\n"
                        + "\t\"skipSideEffects\": true,\n"
                        + "}").when()
                .post("https://credapi.credify.tech/api/brfunnelorch/v2/resume/byLeadSecret");

        String loginRes = res.asString();
        System.out.println(loginRes);
    }

    @Test(priority = 2)
    public void testCase2() {
    }

    @Override
    public WebDriver newWebDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver"); // Set for ChromeDriver
        return new ChromeDriver();
    }

}
