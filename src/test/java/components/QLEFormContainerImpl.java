package components;

import components.interfaces.QLEFormContainer;
import core.KatchFindBy;
import internal.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class QLEFormContainerImpl extends BasePageObject<QLEFormContainer> implements QLEFormContainer {

    @KatchFindBy(locatorPath = "page.form.c_QleForm.qle_none_apply")
    WebElement qle_none_apply;

    @KatchFindBy(locatorPath = "page.form.c_QleForm.qle_lost_coverage")
    WebElement qle_lost_coverage;

    @KatchFindBy(locatorPath = "page.form.c_QleForm.qle_got_married")
    WebElement qle_got_married;

    @KatchFindBy(locatorPath = "page.form.c_QleForm.qle_new_job")
    WebElement qle_new_job;

    @KatchFindBy(locatorPath = "page.form.c_QleForm.qle_had_baby")
    WebElement qle_had_baby;

    @KatchFindBy(locatorPath = "page.form.c_QleForm.qle_moved_another_state")
    WebElement qle_moved_another_state;


    @KatchFindBy(locatorPath = "page.form.c_QleForm.qle_got_divorced")
    WebElement qle_got_divorced;

    @KatchFindBy(locatorPath = "page.form.c_QleForm.qle_lost_job")
    WebElement qle_lost_job;

    @KatchFindBy(locatorPath = "page.form.c_QleForm.qle_member_family_died")
    WebElement qle_member_family_died;


    // TODO Add all elements under the lander in general.yml

    public QLEFormContainerImpl(WebDriver driver) {
        super(driver);
    }

    public QLEFormContainer clickQLENoneApply() {
        clickElement(qle_none_apply);
        return this;
    }

    public QLEFormContainer clickQLELostCoverage() {
        clickElement(qle_lost_coverage);
        return this;
    }

    public QLEFormContainer clickQLEGotMarried() {
        clickElement(qle_got_married);
        return this;
    }

    public QLEFormContainer clickQLENewJob() {
        clickElement(qle_new_job);
        return this;
    }

    public QLEFormContainer clickQLEHadBaby() {
        clickElement(qle_had_baby);
        return this;
    }

    public QLEFormContainer clickQLEMovedAnotherState() {
        clickElement(qle_moved_another_state);
        return this;
    }

    public QLEFormContainer clickQLEGotDivorced() {
        clickElement(qle_got_divorced);
        return this;
    }

    public QLEFormContainer clickQLELostJob() {
        clickElement(qle_lost_job);
        return this;
    }

    public QLEFormContainer clickQLEMemberFamilyDied() {
        clickElement(qle_member_family_died);
        return this;
    }

}
