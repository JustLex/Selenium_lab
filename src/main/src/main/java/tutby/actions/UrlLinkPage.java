package tutby.actions;

import java.util.Stack;

/**
 * Created by Aleksei on 19.11.2014.
 */
public class UrlLinkPage extends PageAction {
    public UrlLinkPage(BasePage page) {
        super(page);
    }

    @Override
    public void act(Stack<String> operations) {
        getDriver().navigate().to(operations.pop());
        super.act(operations);
    }
}
