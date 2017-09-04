package pages;

import org.openqa.selenium.WebDriver;

import components.interfaces.ZipContainer;
import factory.ZipFactory;
import internal.BasePageObject;
import internal.TabUtils;

/**
 * Created by william.russell on 8/28/17.
 *
 * The Each page is broken down into components. In the framework, each component has a factory, and
 * changes depending on the site being tested.
 *
 *
 * Page Object can have logic (such as the submitZipCode) that knows how to use each components, so
 * test cases are written normally.
 */
public class LanderPage extends BasePageObject { // Try to use the methods from base page object.

	public ZipContainer zc;

	public LanderPage(WebDriver driver) {
		super(driver);
		zc = ZipFactory.newZipContainer(driver);
	}

	public FormPage submitZipCode(String zipCode) {
		zc.setZipInput(zipCode);
		zc.clickZipButton();

		TabUtils.switchTab(driver, 1);
		return new FormPage(driver);
	}

	public void clickInTheButtonLearnMoreBasic() {
		zc.clickLMBasicIcon();
	}

	public void clickInTheButtonLearnMoreDiscount() {
		zc.clickLMDiscountIcon();
	}

	public void clickInTheButtonLearnMoreACA() {
		zc.clickLMACAIcon();
	}

	public void clickInTheButtonLearnMoreMedicalCare() {
		zc.clickLMMedicareIcon();
	}

	public String getCurrectURL() {
		return driver.getCurrentUrl();
	}

	public void browserBack() {
		driver.navigate().back();
	}

	// TODO add more methods that help test the lander page.
	// TODO document which methods we're looking for.
}
