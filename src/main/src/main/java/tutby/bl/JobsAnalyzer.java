package tutby.bl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tutby.actions.StringManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksei on 19.11.2014.
 */
public class JobsAnalyzer {
    public static int getJobsCount(WebDriver driver){
        List<WebElement> result = new ArrayList<WebElement>();

        List<WebElement> els = driver.findElements(By.className(StringManager.getValue("job_search_result_el_class")));
        for ( WebElement el: els ) {
            if (el.getText().toLowerCase().contains(StringManager.getValue("job_search_pattern").toLowerCase())) {
                result.add(el);
            }
        }
        return result.size();
    }
}
