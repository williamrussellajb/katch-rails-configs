package pages;

import components.interfaces.FormContainer;
import components.interfaces.ZipContainer;
import factory.FormFactory;
import factory.ZipFactory;
import internal.BasePageObject;
import internal.TabUtils;
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

}
