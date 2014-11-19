package tutby.actions;

import java.util.ResourceBundle;

/**
 * Created by Aleksei on 19.11.2014.
 */
public class StringManager {
    private static ResourceBundle bundle = ResourceBundle.getBundle("consts");

    public static String getValue(String name){
        return bundle.getString(name);
    }
}
