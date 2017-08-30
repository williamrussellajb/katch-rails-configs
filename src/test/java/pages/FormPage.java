package pages;

import components.interfaces.ZipContainer;
import factory.ZipFactory;
import internal.BasePageObject;
import internal.TabUtils;
import org.openqa.selenium.WebDriver;

/**
 * Created by william.russell on 8/28/17.
 */
public class FormPage extends BasePageObject<FormPage>{
    public ZipContainer zc;

    public FormPage(WebDriver driver) {
        super(driver);
        zc = ZipFactory.newZipContainer(driver);
    }

    public void setDOB(String mm, String dd, String yyyy){
        zc.setApplicantDobDD(dd);
        zc.setApplicantDobMM(mm);
        zc.setApplicantDobYYYY(yyyy);
    }

}
