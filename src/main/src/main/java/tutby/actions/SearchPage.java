package tutby.actions;

import org.openqa.selenium.By;

import java.util.Stack;

/**
 * Created by Aleksei on 19.11.2014.
 */
public class SearchPage extends PageAction {
    public SearchPage(BasePage page) {
        super(page);
    }

    @Override
    public void act(Stack<String> operations) {
        getDriver().findElement(By.id(operations.pop())).sendKeys(operations.pop());
        getDriver().findElement(By.className(operations.pop())).click();
        super.act(operations);
    }
}
