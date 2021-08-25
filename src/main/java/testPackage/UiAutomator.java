package testPackage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UiAutomator extends BaseAndroidDriver {

	@Test
	public void uiAutomator() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findElementByAndroidUiAutomator("attribute(value)")

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		// driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		// validate clickable feature for all options

		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

	}

}
