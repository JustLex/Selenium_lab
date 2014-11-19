package tutby.actions;

import org.openqa.selenium.WebDriver;

import java.util.Stack;

/**
 * Created by Aleksei on 19.11.2014.
 */
public abstract class PageAction implements BasePage{
    protected BasePage page;

    protected PageAction(BasePage page) {
        this.page = page;
    }

    @Override
    public void act(Stack<String> operations) {
        page.act(operations);
    }

    @Override
    public WebDriver getDriver() {
        return page.getDriver();
    }
}
