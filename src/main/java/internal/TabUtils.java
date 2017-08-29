package internal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by william.russell on 8/28/17.
 */
public class TabUtils {

    public static void switchTab(WebDriver webDriver, int tabNumber) {

        if (webDriver instanceof InternetExplorerDriver) {
            try {
                TimeUnit.SECONDS.sleep(2);// let tab animation open.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try {
                TimeUnit.SECONDS.sleep(1);// let tab animation open.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());
        if (tabs.size() >= 1 && tabNumber <= tabs.size()) {
            webDriver.switchTo().window(tabs.get(tabNumber));
            webDriver.manage().window().maximize();
        }

    }

    public static void closeTab(WebDriver webDriver, int tabNumber) {
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(tabNumber));
        webDriver.close();
    }
}
