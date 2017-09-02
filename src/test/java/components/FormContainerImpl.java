package components;

import components.interfaces.FormContainer;
import core.KatchFindBy;
import internal.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


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

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_GenderLabel")
    WebElement bf_GenderLabel;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_GenderRadioButton")
    List<WebElement> bf_GenderRadioButton;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_GenderMale")
    WebElement bf_GenderMale;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_GenderFemale")
    WebElement bf_GenderFemale;

//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_GenderMaleText")
//    WebElement bf_GenderMaleText;
//
//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_GenderFemaleText")
//    WebElement bf_GenderFemaleText;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_TobaccoYes")
    WebElement bf_TobaccoYes;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_TobaccoNo")
    WebElement bf_TobaccoNo;

//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_TobaccoYesText")
//    WebElement bf_TobaccoYesText;
//
//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_TobaccoNoText")
//    WebElement bf_TobaccoNoText;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_AddSpouseButton")
    WebElement bf_AddSpouseButton;


    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseApplicantDobMM")
    WebElement bf_SpouseApplicantDobMM;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseApplicantDobDD")
    WebElement bf_SpouseApplicantDobDD;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseApplicantDobYYYY")
    WebElement bf_SpouseApplicantDobYYYY;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseGenderLabel")
    WebElement bf_SpouseGenderLabel;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseGenderRadioButton")
    List<WebElement> bf_SpouseGenderRadioButton;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseGenderMale")
    WebElement bf_SpouseGenderMale;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseGenderFemale")
    WebElement bf_SpouseGenderFemale;

//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseGenderMaleText")
//    WebElement bf_SpouseGenderMaleText;
//
//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseGenderFemaleText")
//    WebElement bf_SpouseGenderFemaleText;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseTobaccoYes")
    WebElement bf_SpouseTobaccoYes;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseTobaccoNo")
    WebElement bf_SpouseTobaccoNo;

//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseTobaccoYesText")
//    WebElement bf_SpouseTobaccoYesText;
//
//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_SpouseTobaccoNoText")
//    WebElement bf_SpouseTobaccoNoText;


    // TODO Add all elements under the lander in general.yml

    public FormContainerImpl(WebDriver driver) {
        super(driver);
    }

    public FormContainer setApplicantDobMM(String mm) {
        sendKeys(bf_ApplicantDobMM, mm);
        return this;
    }

    public FormContainer setApplicantDobDD(String dd) {
        sendKeys(bf_ApplicantDobDD, dd);
        return this;
    }

    public FormContainer setApplicantDobYYYY(String yyyy) {
        sendKeys(bf_ApplicantDobYYYY, yyyy);
        return this;
    }

    public FormContainer setBFGender(String gender) {
        if (gender.trim().toLowerCase().equals("female")) {
            clickElement(bf_GenderFemale);
        } else {
            clickElement(bf_GenderMale);
        }
        return this;
    }

    public FormContainer setTobaccoUser(String answer) {
        if (answer.trim().toLowerCase().equals("yes")) {
            clickElement(bf_TobaccoYes);
        } else {
            clickElement(bf_TobaccoNo);
        }
        return this;
    }

    public FormContainer clickAddSpouseButton() {
        clickElement(bf_AddSpouseButton);
        return this;
    }

    public FormContainer setSpouseApplicantDobMM(String mm) {
        sendKeys(bf_SpouseApplicantDobMM, mm);
        return this;
    }

    public FormContainer setSpouseApplicantDobDD(String dd) {
        sendKeys(bf_SpouseApplicantDobDD, dd);
        return this;
    }

    public FormContainer setSpouseApplicantDobYYYY(String yyyy) {
        sendKeys(bf_SpouseApplicantDobYYYY, yyyy);
        return this;
    }

    public FormContainer setSpouseBFGender(String gender) {
        if (gender.trim().toLowerCase().equals("female")) {
            clickElement(bf_SpouseGenderFemale);
        } else {
            clickElement(bf_SpouseGenderMale);
        }
        return this;
    }

    public FormContainer setSpouseTobaccoUser(String answer) {
        if (answer.trim().toLowerCase().equals("yes")) {
            clickElement(bf_SpouseTobaccoYes);
        } else {
            clickElement(bf_SpouseTobaccoNo);
        }
        return this;
    }
}
