package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import base.Basetest;

import utils.ScreenshotUtils;

public class ITestListenerImpl extends Basetest implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        String screenshotPath = ScreenshotUtils.captureScreenshot(driver, result.getName());
        System.out.println("Screenshot saved at: " + screenshotPath);
    }
}
