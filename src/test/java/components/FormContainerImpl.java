package components;

import components.interfaces.FormContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import core.KatchFindBy;
import internal.BasePageObject;


/**
 * Created by william.russell on 8/28/17.
 */
public class FormContainerImpl extends BasePageObject<FormContainer> implements FormContainer {

	@KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_ApplicantDobMM")
	WebElement bf_ApplicantDobMM;

	@KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_ApplicantDobDD")
	WebElement bf_ApplicantDobDD;

	@KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_ApplicantDobYYYY")
	WebElement bf_ApplicantDobYYYY;

	// TODO Add all elements under the lander in general.yml

	public FormContainerImpl(WebDriver driver) {
		super(driver);
	}

	public FormContainer setApplicantDobMM(String mm){
		sendKeys(bf_ApplicantDobMM, mm);
		return this;
	}

	public FormContainer setApplicantDobDD(String dd){
		sendKeys(bf_ApplicantDobDD, dd);
		return this;
	}

	public FormContainer setApplicantDobYYYY(String yyyy){
		sendKeys(bf_ApplicantDobYYYY, yyyy);
		return this;
	}

}
