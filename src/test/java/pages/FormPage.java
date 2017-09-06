package pages;

import components.interfaces.FormContainer;
import components.interfaces.QLEFormContainer;
import factory.FormFactory;
import internal.BasePageObject;
import org.openqa.selenium.WebDriver;

/**
 * Created by william.russell on 8/28/17.
 */
public class FormPage extends BasePageObject<FormPage>{
    public FormContainer fc;

    public FormPage(WebDriver driver) {
        super(driver);
        fc = FormFactory.newFormContainer(driver);
    }

    public void setDOB(String mm, String dd, String yyyy){
        fc.setApplicantDobDD(dd);
        fc.setApplicantDobMM(mm);
        fc.setApplicantDobYYYY(yyyy);
    }

    public void setBFGender(String value){
        fc.setBFGender(value);
    }

    public void setTobaccoUser(String answer){
        fc.setTobaccoUser(answer);
    }

    public void clickAddSpouseButton(){
        fc.clickAddSpouseButton();
    }

    public void setSpouseDOB(String mm, String dd, String yyyy){
        fc.setSpouseApplicantDobDD(dd);
        fc.setSpouseApplicantDobMM(mm);
        fc.setSpouseApplicantDobYYYY(yyyy);
    }

    public void setBFSpouseGender(String value){
        fc.setSpouseBFGender(value);
    }

    public void setSpouseTobaccoUser(String answer){
        fc.setSpouseTobaccoUser(answer);
    }

    public void clickAddDependentButton(){
        fc.clickAddDependentButton();
    }

    public void setDependentDOB(String mm, String dd, String yyyy){
        fc.setDependentApplicantDobDD(dd);
        fc.setDependentApplicantDobMM(mm);
        fc.setDependentApplicantDobYYYY(yyyy);
    }

    public void setBFDependentGender(String value){
        fc.setDependentBFGender(value);
    }

    public void setDependentTobaccoUser(String answer){
        fc.setDependentTobaccoUser(answer);
    }

    public QLEFormPage clickNextStep1(){
        fc.clickNextStep1();
        return new QLEFormPage(driver);
    }

    public void clickBackStep1(){
        fc.clickBackStep1();
    }
}
