package tutby.actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Stack;

/**
 * Created by Aleksei on 19.11.2014.
 */
public class RealPage implements BasePage {
    private WebDriver driver;
    public RealPage(WebDriver driver){
        this.driver = driver;
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }

    @Override
    public void act(Stack<String> operations) {
        Assert.assertTrue(driver.getTitle().equals(operations.pop()));
    }
}
