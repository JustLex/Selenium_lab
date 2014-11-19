import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import tutby.actions.*;
import tutby.bl.JobsAnalyzer;

import java.util.ResourceBundle;
import java.util.Stack;

/**
 * Created by Aleksei on 19.11.14.
 */
public class Test {
    private ResourceBundle bundle = ResourceBundle.getBundle("consts");
    private WebDriver driver;

    public Test() {
        driver = new FirefoxDriver();
    }

    public void run() {
        Stack<String> ops = new Stack<String>();
        ops.push(StringManager.getValue("main_page_id"));
        ops.push(StringManager.getValue("url"));

        // Go to main page tut.by
        BasePage page = new RealPage(driver);
        new UrlLinkPage(page).act(ops);

        ops.push(StringManager.getValue("job_page_id"));
        ops.push(StringManager.getValue("job_btn_id"));

        new ClickOnNavBarPage(page).act(ops);

        ops.push(StringManager.getValue("job_page_id"));
        ops.push(StringManager.getValue("search_btn_id"));
        ops.push(StringManager.getValue("job_query"));
        ops.push(StringManager.getValue("search_field_id"));

        new SearchPage(page).act(ops);

        System.out.println(String.format(StringManager.getValue("test_output_pattern"),
                StringManager.getValue("test_output_text"),
                JobsAnalyzer.getJobsCount(page.getDriver())));

        driver.close();
    }
}
