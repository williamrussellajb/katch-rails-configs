package components;

import components.interfaces.FormContainer;
import components.interfaces.QLEFormContainer;
import core.KatchFindBy;
import internal.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.QLEFormPage;

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

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_AddDependentButton")
    WebElement bf_AddDependentButton;


    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentApplicantDobMM")
    WebElement bf_DependentApplicantDobMM;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentApplicantDobDD")
    WebElement bf_DependentApplicantDobDD;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentApplicantDobYYYY")
    WebElement bf_DependentApplicantDobYYYY;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentGenderLabel")
    WebElement bf_DependentGenderLabel;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentGenderRadioButton")
    List<WebElement> bf_DependentGenderRadioButton;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentGenderMale")
    WebElement bf_DependentGenderMale;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentGenderFemale")
    WebElement bf_DependentGenderFemale;

//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentGenderMaleText")
//    WebElement bf_DependentGenderMaleText;
//
//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentGenderFemaleText")
//    WebElement bf_DependentGenderFemaleText;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentTobaccoYes")
    WebElement bf_DependentTobaccoYes;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentTobaccoNo")
    WebElement bf_DependentTobaccoNo;

//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentTobaccoYesText")
//    WebElement bf_DependentTobaccoYesText;
//
//    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.bf_DependentTobaccoNoText")
//    WebElement bf_DependentTobaccoNoText;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.next_button_step_1")
    WebElement next_button_step_1;

    @KatchFindBy(locatorPath = "page.form.c_BiographicalForm.back_button_step_1")
    WebElement back_button_step_1;

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

    public FormContainer clickAddDependentButton() {
        clickElement(bf_AddDependentButton);
        return this;
    }

    public FormContainer setDependentApplicantDobMM(String mm) {
        sendKeys(bf_DependentApplicantDobMM, mm);
        return this;
    }

    public FormContainer setDependentApplicantDobDD(String dd) {
        sendKeys(bf_DependentApplicantDobDD, dd);
        return this;
    }

    public FormContainer setDependentApplicantDobYYYY(String yyyy) {
        sendKeys(bf_DependentApplicantDobYYYY, yyyy);
        return this;
    }

    public FormContainer setDependentBFGender(String gender) {
        if (gender.trim().toLowerCase().equals("female")) {
            clickElement(bf_DependentGenderFemale);
        } else {
            clickElement(bf_DependentGenderMale);
        }
        return this;
    }

    public FormContainer setDependentTobaccoUser(String answer) {
        if (answer.trim().toLowerCase().equals("yes")) {
            clickElement(bf_DependentTobaccoYes);
        } else {
            clickElement(bf_DependentTobaccoNo);
        }
        return this;
    }

    public FormContainer clickNextStep1() {
        clickElement(next_button_step_1);
        return this;
    }

    public FormContainer clickBackStep1() {
        clickElement(back_button_step_1);
        return this;
    }
}
