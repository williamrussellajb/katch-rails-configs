package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import internal.TestTemplate;
import pages.LanderPage;

/**
 * Created by william.russell on 8/28/17.
 */
public class TestLandingFooter extends TestTemplate {

	String site = "http://staging.healthplans.com";

	@Test
	public void inputDOB() {
		driver.navigate().to(site);
		LanderPage lp = new LanderPage(driver);

		String landerURL = lp.getCurrectURL();

		lp.clickFooterAboutButton();
		Assert.assertTrue(landerURL != lp.getCurrectURL());
		lp.browserBack();

		lp.clickFooterContactButton();
		Assert.assertTrue(landerURL != lp.getCurrectURL());
		lp.browserBack();

		lp.clickFooterPrivacyPolicyLink();
		Assert.assertTrue(landerURL != lp.getCurrectURL());
		lp.browserBack();

		lp.clickFooterShopButton();
		Assert.assertTrue(landerURL != lp.getCurrectURL());
		lp.browserBack();

		lp.clickFooterTermsLink();
		Assert.assertTrue(landerURL != lp.getCurrectURL());
		lp.browserBack();
	}
}