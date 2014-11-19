package tutby.actions;

import org.openqa.selenium.By;

import java.util.Stack;

/**
 * Created by Aleksei on 19.11.2014.
 */
public class ClickOnNavBarPage extends PageAction {
    public ClickOnNavBarPage(BasePage page) {
        super(page);
    }

    @Override
    public void act(Stack<String> operations) {
        getDriver().findElement(By.linkText(operations.pop())).click();
        super.act(operations);
    }
}
