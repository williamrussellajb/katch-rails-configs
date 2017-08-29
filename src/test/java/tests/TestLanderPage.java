package tests;

import internal.TestTemplate;
import org.testng.annotations.Test;
import pages.LanderPage;

/**
 * Created by william.russell on 8/28/17.
 */
public class TestLanderPage extends TestTemplate {

    String site = "http://staging.healthplans.com";

    @Test
    public void inputZipDataTest(){
        driver.navigate().to(site);

        //Pages like normal
        LanderPage lp = new LanderPage(driver);
        lp.submitZipCode("91324");
        sleep(5000);// just to show it working, avoid sleeps.

    }


    public void sleep(int timeMs){

        try {
            Thread.sleep(timeMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
