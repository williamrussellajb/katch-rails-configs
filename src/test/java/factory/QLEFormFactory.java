package factory;

import components.QLEFormContainerImpl;
import components.interfaces.QLEFormContainer;
import org.openqa.selenium.WebDriver;

/**
 * Created by william.russell on 8/28/17.
 */
public class QLEFormFactory {


    public static QLEFormContainer newQLEFormContainer(WebDriver driver){
        return new QLEFormContainerImpl(driver);
    }


}
