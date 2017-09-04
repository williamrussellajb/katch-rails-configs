package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import internal.TestTemplate;
import pages.LanderPage;

/**
 * Created by william.russell on 8/28/17.
 */
public class TestLandingIcons extends TestTemplate {

	String site = "http://staging.healthplans.com";

	@Test
	public void inputDOB() {
		driver.navigate().to(site);
		LanderPage lp = new LanderPage(driver);

		String landerURL = lp.getCurrectURL();

		lp.clickInTheButtonLearnMoreACA();
		Assert.assertTrue(landerURL != lp.getCurrectURL());
		lp.browserBack();

		lp.clickInTheButtonLearnMoreBasic();
		Assert.assertTrue(landerURL != lp.getCurrectURL());
		lp.browserBack();

		lp.clickInTheButtonLearnMoreDiscount();
		Assert.assertTrue(landerURL != lp.getCurrectURL());
		lp.browserBack();

		lp.clickInTheButtonLearnMoreMedicalCare();
		Assert.assertTrue(landerURL != lp.getCurrectURL());
		lp.browserBack();
	}

	public void sleep(int timeMs) {

		try {
			Thread.sleep(timeMs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
