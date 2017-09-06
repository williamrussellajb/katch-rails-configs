package pages;

import components.interfaces.QLEFormContainer;
import factory.QLEFormFactory;
import internal.BasePageObject;
import org.openqa.selenium.WebDriver;

/**
 * Created by william.russell on 8/28/17.
 */
public class QLEFormPage extends BasePageObject<QLEFormPage> {
    public QLEFormContainer qfc;

    public QLEFormPage(WebDriver driver) {
        super(driver);
        qfc = QLEFormFactory.newQLEFormContainer(driver);
    }

    public void clickQLENoneApply() {
        qfc.clickQLENoneApply();
    }

    public void clickQLELostCoverage() {
        qfc.clickQLELostCoverage();
    }

    public void clickQLEGotMarried() {
        qfc.clickQLEGotMarried();
    }

    public void clickQLENewJob() {
        qfc.clickQLENewJob();
    }

    public void clickQLEHadBaby() {
        qfc.clickQLEHadBaby();
    }

    public void clickQLEMovedAnotherState() {
        qfc.clickQLEMovedAnotherState();
    }

    public void clickQLEGotDivorced() {
        qfc.clickQLEGotDivorced();
    }

    public void clickQLELostJob() {
        qfc.clickQLELostJob();
    }

    public void clickQLEMemberFamilyDied() {
        qfc.clickQLEMemberFamilyDied();
    }

}
