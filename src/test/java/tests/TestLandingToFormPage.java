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
        FormPage formPage = lp.submitZipCode("91324");

        formPage.setDOB("06","18", "1992");
        formPage.setBFGender("female");
        formPage.setTobaccoUser("yes");

        formPage.clickAddSpouseButton();
        formPage.setSpouseDOB("06","19", "1993");
        formPage.setBFSpouseGender("female");
        formPage.setSpouseTobaccoUser("yes");

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
