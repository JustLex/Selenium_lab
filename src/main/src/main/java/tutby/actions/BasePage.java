package tutby.actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Stack;

/**
 * Created by Aleksei on 19.11.2014.
 */
public interface BasePage {
    public WebDriver getDriver();
    public void act(Stack<String> operations);
}
