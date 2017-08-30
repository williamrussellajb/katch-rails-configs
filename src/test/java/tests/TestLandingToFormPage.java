package tests;

import internal.TestTemplate;
import org.testng.annotations.Test;
import pages.FormPage;
import pages.LanderPage;

/**
 * Created by william.russell on 8/28/17.
 */
public class TestLandingToFormPage extends TestTemplate {

    String site = "http://staging.healthplans.com";

    @Test
    public void inputDOB(){
        driver.navigate().to(site);

        //Pages like normal
        LanderPage lp = new LanderPage(driver);
        FormPage formpage = lp.submitZipCode("91324");
        sleep(5000);// just to show it working, avoid sleeps.

        formpage.setDOB("06","18", "1992");
    }


    public void sleep(int timeMs){

        try {
            Thread.sleep(timeMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
