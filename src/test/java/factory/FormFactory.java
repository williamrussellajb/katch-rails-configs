package factory;

import components.FormContainerImpl;
import components.interfaces.FormContainer;
import org.openqa.selenium.WebDriver;

/**
 * Created by william.russell on 8/28/17.
 */
public class FormFactory {


    public static FormContainer newFormContainer(WebDriver driver){
        return new FormContainerImpl(driver);
    }


}
