package internal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by william.russell on 8/28/17.
 */
public class TestTemplate {

    protected WebDriver driver;

    @BeforeMethod
    public void setupDriver(){
        this.driver = BaseDriver.getDriver();
    }

    @AfterMethod
    public void destroyDriver(){
        if(null != driver){
            driver.quit();
        }
    }

}
