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
                .headers("x-cf-source-id", "coding-challenge", "x-cf-corr-id", UUID.randomUUID(), "Content-Type", "application/json").body("{\n"
                        + "\t\"username\": \"coding.challenge.login@upgrade.com\",\n"
                        + "\t\"password\": \"On$3XcgsW#9q\",\n"
                        + "\t\"recaptchaToken\": \"coding_challenge\"\n"
                        + "}").when()
                .post("https://credapi.credify.tech/api/brportorch/v2/login");

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
