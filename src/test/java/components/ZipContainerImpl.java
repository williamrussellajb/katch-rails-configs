package components;

import components.interfaces.ZipContainer;
import core.KatchFindBy;
import internal.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by william.russell on 8/28/17.
 */
public class ZipContainerImpl extends BasePageObject<ZipContainer> implements ZipContainer {


    @KatchFindBy(locatorPath = "page.lander.c_ZipContainer.zc_ZipButton")
    WebElement zipButton;

    @KatchFindBy(locatorPath = "page.lander.c_ZipContainer.zc_ZipInput")
    WebElement zipInput;

    //TODO Add all elements under the lander in general.yml

    public ZipContainerImpl(WebDriver driver) {
        super(driver);
    }


    public ZipContainer clickZipButton() {
        //wrap all click events in this method, we do extra things with it.
        clickElement(zipButton);
        return this;
    }

    public ZipContainer setZipInput(String zipCode) {
        //wrap all send text events in this method, we do extra things with it.
        sendKeys(zipInput, zipCode);
        return this;
    }


}
